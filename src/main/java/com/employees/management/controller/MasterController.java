/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.controller;

import com.employees.management.domain.Userrepo;
import com.employees.management.models.userdetails.Users;
import com.employees.management.service.UserService;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author proje
 */
@RestController
public class MasterController implements Serializable{
    @Autowired
    UserService userservice;
   
    @PostMapping("/addNewUSer")
    public Users addNewUser(@RequestBody Users users){
        return userservice.addUser(users);
    }

    @GetMapping("/user")
    public @ResponseBody Iterable<Users> getAllUser(){
        return userservice.getAllUsers();
    }
    
    @DeleteMapping("/deleteUser/{id}")
    public @ResponseBody ResponseEntity deleteUser(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(userservice.deleteUser(id));
        }
        catch(RuntimeException e){
            return ResponseEntity.status(400).body(e.getMessage());
        }
        catch(Exception e){
            return ResponseEntity.status(500).body("Something went wrong, please contact dev team");
        }
    }
    
    @GetMapping("/getUser/{id}")
    public @ResponseBody Optional<Users> getUserById(@PathVariable Integer id){
        return userservice.getUserById(id);
    }
    
    @PutMapping("/updateUserById/{id}")
    public Users updateUser(@RequestBody String name, @PathVariable Integer id){
        return userservice.updateUserById(name, id);
    }
}