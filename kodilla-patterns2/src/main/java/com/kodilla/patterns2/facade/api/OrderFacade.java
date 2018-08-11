/*
 * Created by Matt Stefanski on 8/11/18 11:49 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/11/18 11:40 AM
 */

package com.kodilla.patterns2.facade.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@EnableAspectJAutoProxy
@Component
public class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processOrder(OrderDto order,Long userId) throws OrderProcessingException {
        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        LOGGER.info("Registering new order, ID: " + orderId);
        if (orderId < 0) {
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORISED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORISED);
        }
        try {
            for (ItemDto orderItem : order.getItems()) {
                LOGGER.info("Adding item " + orderItem.getProductId() + ", " + orderItem.getQuantity() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Order value is: " + value + " USD");
            if (!shopService.doPayment(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_PAYMENT_REJECTED);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Payment successfully completed");
            if (!shopService.verifyOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERROR);
            }
            LOGGER.info("Order is ready to submit");
            if (!shopService.submitOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_SUBMISSION_ERROR);
                wasError = true;
                throw new OrderProcessingException(OrderProcessingException.ERR_SUBMISSION_ERROR);
            }
            LOGGER.info("Order " + orderId + "submitted");
        } finally {
            if (wasError) {
                LOGGER.info("Cancelling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }
    }
}