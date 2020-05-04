/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.service.impl;

import com.employees.management.domain.DeveloperSummaryrepo;
import com.employees.management.models.employeesummary.DeveloperSummary;
import com.employees.management.service.EmployeeSummary;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author proje
 */
public class DeveloperSummaryService implements EmployeeSummary{

    @Autowired
    DeveloperSummaryrepo devsumrepo;

    @Override
    public String getSummary(){
        return devsumrepo.toString();
    }
}