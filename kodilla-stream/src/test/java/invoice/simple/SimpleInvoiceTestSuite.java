/*
 * Created by Matt Stefanski on 8/10/18 11:18 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/10/18 11:18 PM
 */

package invoice.simple;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));
        double value;
        for (int i=0;i<invoice.getItems().size();i++) {
            value=invoice.getItems().get(i).getValue();
            System.out.println(value);
        }
        //Then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}