/*
 * Created by Matt Stefanski on 8/10/18 11:17 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/10/18 11:17 PM
 */

package invoice.simple;

public final class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(final SimpleProduct product, final double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return product.getProductPrice() * quantity;
    }
}