/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.service.impl;

import com.employees.management.domain.ManagerSummaryrepo;
import com.employees.management.service.EmployeeSummary;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author proje
 */
@Component
public class ManagerSummaryService implements EmployeeSummary{

    @Autowired
    ManagerSummaryrepo mansumrepo;
    
    @Override
    public String getSummary(Integer id){
        return mansumrepo.findByUserid(id).toString();
    }
}
