/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.service.impl;

import com.employees.management.domain.SalesmanSummaryrepo;
import com.employees.management.service.EmployeeSummary;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author proje
 */
@Component
public class SalesmanSummaryService implements EmployeeSummary{

    @Autowired
    SalesmanSummaryrepo salessumrepo;
    
    @Override
    public String getSummary(Integer id){
        return salessumrepo.findByUserid(id).toString();
    }
}