/*
 * Created by Matt Stefanski on 8/10/18 11:17 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/10/18 11:17 PM
 */

package invoice.simple;


public class SimpleProduct {
    private final String productName;
    private final double productPrice;

    public SimpleProduct(final String productName, final double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleProduct)) return false;
        SimpleProduct that = (SimpleProduct) o;
        return productName.equals(that.productName);
    }
}