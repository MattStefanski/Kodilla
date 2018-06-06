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
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Employee.findEmployeeByLastName",
        query = "SELECT * FROM EMPLOYEES WHERE LASTNAME LIKE :NameParam",
        resultClass = Employee.class
)


@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Company> getCompanies() {
        return companies;
    }

    @JoinTable(
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
