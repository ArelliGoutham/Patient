package com.hospital.patient.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    private int doctorId;
    private Date dateOfVisit;
    private String prescription;

    public Patient() {
    }

    public Patient(int id, String prescription) {
        this.id = id;
        this.prescription = prescription;
    }

    public Patient(String name, int age, int doctorId, Date dateOfVisit) {
        this.name = name;
        this.age = age;
        this.doctorId = doctorId;
        this.dateOfVisit = dateOfVisit;
    }

    public Patient(int id, String name, int age, int visitedDoctor, Date dateOfVisit) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.doctorId = visitedDoctor;
        this.dateOfVisit = dateOfVisit;
    }

    public Patient(int id, String name, int age, int visitedDoctor, Date dateOfVisit, String prescription) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.doctorId = visitedDoctor;
        this.dateOfVisit = dateOfVisit;
        this.prescription = prescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVisitedDoctor() {
        return doctorId;
    }

    public void setVisitedDoctor(int visitedDoctor) {
        this.doctorId = visitedDoctor;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Patient [age=" + age + ", dateOfVisit=" + dateOfVisit + ", id=" + id + ", name=" + name
                + ", prescription=" + prescription + ", visitedDoctor=" + doctorId + "]";
    }

}
