/*
 * Created by Matt Stefanski on 8/6/18 8:10 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 7:02 PM
 */

package com.kodilla.patterns2;

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
