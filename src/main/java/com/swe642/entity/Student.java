package com.swe642.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_FORM")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    @Column(name="firstname")
    private String name;
    @Column(name="lastname")
    private String lastname;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zip")
    private String zip;
    @Column(name="phone")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name="dos")
    private String dos;
    @Column(name="about_college")
    private String about_college;
    @Column(name="interested")
    private String interested;
    @Column(name="recommend")
    private String recommend;
}
