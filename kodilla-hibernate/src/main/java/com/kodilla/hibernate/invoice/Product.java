/*
 * Created by Matt Stefanski on 6/3/18 11:05 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/3/18 11:05 AM
 */

package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PRODUCT")
public class Product {

    private Integer id;
    private String name;
    private List<Item> items=new ArrayList<Item>();


    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name="ID",unique = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @Column(name="ProductName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @OneToMany(targetEntity = Item.class,
    mappedBy = "product",
    cascade = CascadeType.ALL,
    fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
