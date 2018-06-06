/*
 * Created by Matt Stefanski on 6/3/18 11:39 AM
 *
 * Copyright (c) 2018. All rights reserved
 *
 * Last modified 6/3/18 11:39 AM
 */

package com.kodilla.hibernate.invoice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository <Invoice,Integer> {


}
