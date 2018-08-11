/*
 * Created by Matt Stefanski on 8/6/18 6:49 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 6:49 PM
 */

package facade;

public class Item {

    private final Long productId;
    private final double qty;

    public Item(Long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
