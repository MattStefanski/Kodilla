/*
 * Created by Matt Stefanski on 6/5/18 11:12 PM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/5/18 8:47 PM
 */

package com.kodilla.hibernate.manytomany;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.data.repository.query.Param;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> findCompanyNameStartsWith(@Param("startWithParam") String startWithParam);

    @Query(nativeQuery = true)
    List<Company> findCompanyByName(@Param("param") String param);


}


