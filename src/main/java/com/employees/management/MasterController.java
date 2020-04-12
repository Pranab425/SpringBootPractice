/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management;

import com.employees.management.userDetails.Address;
import com.employees.management.userDetails.Users;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    private UserRepo userrepo;
    
    @PostMapping("/addNewUSer")
/*    public Users addNewUser(@ResponseBody String firstName, 
            String lastName, String dob, String doj,
            String houseNumber, String building,
            String city, String state, Integer pincode) throws ParseException{
*/
    public Users addNewUser(@RequestBody Users users){
        return userrepo.save(users);
    }
        //Add user
  /*      Users u = new Users();
        u.setFirstName(firstName);
        u.setLastName(lastName);
        System.out.println(firstName + " " + lastName + " " + dob + " " + doj);
        u.setDateOfBirth(new SimpleDateFormat("yyyy/MM/dd").parse(dob));
        u.setDateOfJoining(new SimpleDateFormat("yyyy/MM/dd").parse(doj));
        //Adding address
        Address a = new Address();
        a.setHouseNumber(houseNumber);
        a.setBuilding(building);
        a.setCity(city);
        a.setState(state);
        a.setPincode(pincode);
        
        u.setAddress(a);
        userrepo.save(u);
        return u;
    }
  */  
    @GetMapping("/listAllUser")
    public @ResponseBody Iterable<Users> getAllUser(){
        return userrepo.findAll();
    }
}
