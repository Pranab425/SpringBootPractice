/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.domain;

import com.employees.management.models.employeesummary.ManagerSummary;
import com.employees.management.service.EmployeeSummary;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author proje
 */
public interface ManagerSummaryrepo extends CrudRepository<ManagerSummary, Integer>{
    @Query(value = "select * from developersummary where userid = ?1")
    ManagerSummary findByUserid(Integer userid);

    public EmployeeSummary save(EmployeeSummary es);
    }
