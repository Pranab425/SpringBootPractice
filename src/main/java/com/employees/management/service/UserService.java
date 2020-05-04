/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.service;

import com.employees.management.domain.Userrepo;
import com.employees.management.models.userdetails.Users;
import com.employees.management.service.impl.DeveloperSummaryService;
import com.employees.management.service.impl.ManagerSummaryService;
import com.employees.management.service.impl.SalesmanSummaryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author proje
 */
@Component
public class UserService {

    @Autowired
    private Userrepo userrepo;
    
    private DeveloperSummaryService developerSummaryService;
    
    private ManagerSummaryService managerServiceSummary;
    
    private SalesmanSummaryService salesmanSummaryService;

    public Iterable<Users> deleteUser(Integer id) {
        if (userrepo.existsById(id)) {
            userrepo.deleteById(id);
        }
        else{
            throw new RuntimeException("Given id = " + id + " doesn't exist");
        }
        return userrepo.findAll();
    }

    public Users addUser(Users user) {
        return userrepo.save(user);
    }

    public Iterable<Users> getAllUsers() {
        return userrepo.findAll();
    }

    public Optional<Users> getUserById(Integer id) {
        return userrepo.findById(id);
    }

    public Users updateUserById(String name, Integer id){
        Optional<Users> userId = userrepo.findById(id);
        userId.get().setFirstName(name);
        return userrepo.save(userId.get());
    }
    
    
    private EmployeeSummary getEmployeeSummary(String userType){
        
        switch(userType){
            case "developer":
                return developerSummaryService;
                
            case "manager":
                return managerServiceSummary;
                    
            case "salesman":
                return salesmanSummaryService;
                
            default:
                return null;
        }
    }
    
    public String getUserSummary(Integer id){
        Optional<Users> userData = userrepo.findById(id);
        if(userData == null){
            throw new RuntimeException("User not found");
        }
         EmployeeSummary employeeSummary = getEmployeeSummary(userData.get().getUserType());
         if(employeeSummary ==null){
             throw new RuntimeException("User type not found");
         }
         return employeeSummary.getSummary();
    }
}
