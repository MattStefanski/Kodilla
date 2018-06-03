/*
 * Created by Matt Stefanski on 6/3/18 11:40 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/3/18 11:40 AM
 */

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
       // Product hosting = new Product("Hosting");
       /// Product domain = new Product("Domain");
       // Product db = new Product("DB");
        //Invoice invoice1 = new Invoice("467/2018",new ArrayList<Item>());
        //Item item1=new Item(hosting,BigDecimal.valueOf(150.30),2,invoice1);
       // Item item2=new Item(domain,BigDecimal.valueOf(180.91),4,invoice1);
        //Item item3=new Item(db,BigDecimal.valueOf(230.13),3,invoice1);

        //When

        //Then

        //Clean Up


    }
}
