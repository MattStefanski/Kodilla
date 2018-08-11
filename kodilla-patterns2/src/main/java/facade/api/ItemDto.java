/*
 * Created by Matt Stefanski on 8/6/18 7:55 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 7:55 PM
 */

package facade.api;

public class ItemDto {
    private final Long productId;
    private final double quantity;

    public ItemDto(final Long productId, final double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQuantity() {
        return quantity;
    }
}