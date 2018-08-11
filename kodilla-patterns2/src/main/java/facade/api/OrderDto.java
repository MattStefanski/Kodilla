/*
 * Created by Matt Stefanski on 8/6/18 7:55 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/6/18 7:55 PM
 */

package facade.api;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {
    private final List<ItemDto> items = new ArrayList<>();

    public void addItem(final  ItemDto item) {items.add(item);}

    public List<ItemDto> getItems() {
        return items;
    }
}