/*
 * Created by Matt Stefanski on 8/4/18 8:05 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/4/18 8:05 AM
 */

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFasade {


    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompany(String companyName) {


        return companyDao.findCompanyByName(companyName);
    }


    public List<Employee> findEmploy(String employName) {


        return employeeDao.findEmployeeByAnyName(employName);
    }


}
