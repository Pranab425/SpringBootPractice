/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.models.employeesummary;

import com.employees.management.models.userdetails.Users;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 *
 * @author proje
 */
@Component
@Entity
@Table(name = "developersummary")
public class DeveloperSummary implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "modulename")
    private String moduleName;
    
    @Column(name = "taskname")
    private String taskName;
    
    //@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    //@Column(name = "userid")
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "DeveloperSummary{" + "id=" + id + ", moduleName=" + moduleName + ", taskName=" + taskName + ", userid=" + userid + '}';
    }   
}
