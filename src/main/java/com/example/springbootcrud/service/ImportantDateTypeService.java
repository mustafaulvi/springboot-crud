package com.example.springbootcrud.service;

import com.example.springbootcrud.model.ImportantDateType;

import java.util.List;

public interface ImportantDateTypeService {

    ImportantDateType creatImportantDateType(ImportantDateType importantDateType);

    ImportantDateType updateImportantDateType(ImportantDateType importantDateType);

    List<ImportantDateType> getAllImportantDateType();

    ImportantDateType getImportantDateTypeById(long id);

    void deleteImportantDateType(long id);

}
