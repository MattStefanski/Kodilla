/*
 * Created by Matt Stefanski on 6/3/18 11:29 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/3/18 11:29 AM
 */

package com.kodilla.hibernate.invoice;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Invoice {

    private Integer id;
    private String number;
    private List<Item> items;

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
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
    @Column(name="NAME")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(targetEntity = Item.class,
            mappedBy = "invoce",
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
