/*
 * Created by Matt Stefanski on 8/11/18 11:55 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 8:11 PM
 */

package com.kodilla.patterns2.facade.api;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long productId){
        Random generator = new Random();
        return new BigDecimal(generator.nextInt(10000)/100);
    }
}
