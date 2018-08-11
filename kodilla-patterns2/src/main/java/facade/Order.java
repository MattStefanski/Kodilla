/*
 * Created by Matt Stefanski on 8/6/18 6:50 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 6:50 PM
 */

package facade;

import com.kodilla.patterns2.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class Order {


    private ProductService productService;
    private final List<Item> items=new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private boolean isPaid = false;
    private boolean isVerified = false;
    private boolean isSubmitted = false;

    public Order(ProductService productService, Long orderId, Long userId) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }
    public BigDecimal calculateValue(){
        BigDecimal sum=BigDecimal.ZERO;
        for (Item item:items){
            sum=sum.add(productService.getPrice(item.getProductId()))
                    .multiply(new BigDecimal(item.getQty()));
        }
        return sum;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
