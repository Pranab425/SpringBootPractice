/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management;

import com.employees.management.userDetails.Address;
import com.employees.management.userDetails.Users;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author proje
 */
public interface UserRepo extends CrudRepository<Users, Integer>{
    
}
