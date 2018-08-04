/*
 * Created by Matt Stefanski on 8/4/18 8:22 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 8/4/18 8:22 AM
 */

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFasadeTest {


    @Autowired
    private SearchFasade searchFasade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testCompanySearch(){
        //Given
        Company company=new Company("Boring company");
        companyDao.save(company);
        //When
        List<Company> companyList=searchFasade.findCompany("ring");
        int companyListSize=companyList.size();
        //Then
        Assert.assertEquals(1,companyListSize);
        //Clean up
        companyDao.delete(company);

    }

    @Test
    public void testEmployeeSearch(){
        Employee employee=new Employee("Grzegorz", "Brzęczyszczykiewicz");
        employeeDao.save(employee);
        //When
        List<Employee> employeeList=searchFasade.findEmploy("rzeGo");
        int employeeListSize=employeeList.size();
        //Then
        Assert.assertEquals(1,employeeListSize);
        //Clean up
        employeeDao.delete(employee);
    }


}