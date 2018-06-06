/*
 * Created by Matt Stefanski on 6/5/18 11:12 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/5/18 8:47 PM
 */

package com.kodilla.hibernate.manytomany;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;


@NamedNativeQuery(
        name = "Company.findCompanyNameStartsWith",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE CONCAT(SUBSTRING(:startWithParam,1,3),'%')",
        resultClass = Company.class
)


@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}