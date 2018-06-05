/*
 * Created by Matt Stefanski on 6/5/18 10:20 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/5/18 10:20 PM
 */

package com.kodilla.hibernate.manytomany;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {


    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void testEmployeeSearch() {
        //Given


        Employee kKowalska = new Employee("Katarzyna", "Kowalska");
        employeeDao.save(kKowalska);
        Employee bPolak = new Employee("Barbara", "Polak");
        employeeDao.save(bPolak);
        Employee sLewandowski = new Employee("Sebastian", "Lewandowski");
        employeeDao.save(sLewandowski);

        //When
        List<Employee> testedEmployee = employeeDao.findEmployeeByLastName("Kowalska");
        String emplFirstName = testedEmployee.get(0).getFirstname();

        //Then
        Assert.assertEquals("Katarzyna", emplFirstName);

    }


    @Test
    public void testCompanySearch() {
        //Given
        Company asda = new Company("Asda");
        companyDao.save(asda);
        Company morisons = new Company("Morisons");
        companyDao.save(morisons);
        Company tesco = new Company("Tesco");
        companyDao.save(tesco);

        //When
        List<Company> testedCompany = companyDao.findCompanyNameStartsWith("Tes");
        String compName = testedCompany.get(0).getName();

        //Then
        Assert.assertEquals("Tesco", compName);

    }
}
