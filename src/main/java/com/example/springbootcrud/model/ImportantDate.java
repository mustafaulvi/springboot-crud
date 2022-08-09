package com.example.springbootcrud.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class ImportantDate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private Date date;
    @OneToMany
    private List<ImportantDateType>  importantDateTypes;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ImportantDateType> getImportantDateTypes() {
        return importantDateTypes;
    }

    public void setImportantDateTypes(List<ImportantDateType> importantDateTypes) {
        this.importantDateTypes = importantDateTypes;
    }
}
