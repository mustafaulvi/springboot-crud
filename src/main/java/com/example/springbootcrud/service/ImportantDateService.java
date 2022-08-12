package com.example.springbootcrud.service;

import com.example.springbootcrud.model.ImportantDate;

import java.util.List;

public interface ImportantDateService {

    ImportantDate creatImportantDate(ImportantDate importantDate);

    ImportantDate updateImportantDate(ImportantDate importantDate);

    List<ImportantDate> getAllImportantDate();

    ImportantDate getImportantDateById(long id);

    void deleteImportantDate(long id);
}
