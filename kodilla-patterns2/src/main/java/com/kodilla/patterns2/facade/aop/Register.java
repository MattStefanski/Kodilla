/*
 * Created by Matt Stefanski on 8/11/18 11:49 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/11/18 11:46 AM
 */

package com.kodilla.patterns2.facade.aop;



import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Register {

    public static final Logger LOGGER= LoggerFactory.getLogger(Register.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(com.kodilla.patterns2.facade.api.OrderDto,Long))")
    public void logProcessOrder(){
    LOGGER.info("Processing order");
    }
}
