/*
 * Created by Matt Stefanski on 8/10/18 11:16 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/10/18 11:16 PM
 */

package invoice.simple;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {
    private final List<SimpleItem> items = new ArrayList<>();

    public void addItem(SimpleItem item) {
        items.add(item);
    }

    public boolean removeItem(SimpleItem item) {
        return items.remove(item);
    }

    public double getValueToPay() {
        return items.stream()
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }

    public List<SimpleItem> getItems() {
        return items;
    }
}