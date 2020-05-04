/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.management.models.employeesummary;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 *
 * @author proje
 */
@Component
@Entity
@Table(name = "managersummary")
public class ManagerSummary implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "interviewcount")
    private Integer interviewcount;
    
    @Column(name = "meetingcount")
    private Integer meetingCount;
    
    @Column(name = "meetingsummary")
    private String meetingSummary;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInterviewcount() {
        return interviewcount;
    }

    public void setInterviewcount(Integer interviewcount) {
        this.interviewcount = interviewcount;
    }

    public Integer getMeetingCount() {
        return meetingCount;
    }

    public void setMeetingCount(Integer meetingCount) {
        this.meetingCount = meetingCount;
    }

    public String getMeetingSummary() {
        return meetingSummary;
    }

    public void setMeetingSummary(String meetingSummary) {
        this.meetingSummary = meetingSummary;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "ManagerSummary{" + "id=" + id + ", interviewcount=" + interviewcount + ", meetingCount=" + meetingCount + ", meetingSummary=" + meetingSummary + ", userid=" + userid + '}';
    }
    
    
}
