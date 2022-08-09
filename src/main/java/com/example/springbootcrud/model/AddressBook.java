package com.example.springbootcrud.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String name;
    private String surName;
    private String address;
    private String email;
    private String telephone;
    @OneToMany
    private List<PersonGroup>  personGroups;
    @OneToMany
    private ArrayList<ImportantDate> importantDates;
    @CreationTimestamp
    private Date createdAt;
    @CreationTimestamp
    private Date updatedAt;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<PersonGroup> getPersonGroups() {
        return personGroups;
    }

    public void setPersonGroups(List<PersonGroup> personGroups) {
        this.personGroups = personGroups;
    }

    public ArrayList<ImportantDate> getImportantDates() {
        return importantDates;
    }

    public void setImportantDates(ArrayList<ImportantDate> importantDates) {
        this.importantDates = importantDates;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
