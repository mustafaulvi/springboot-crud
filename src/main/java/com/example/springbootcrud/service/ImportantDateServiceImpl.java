package com.example.springbootcrud.service;

import com.example.springbootcrud.exception.ResourceNotFoundException;
import com.example.springbootcrud.model.ImportantDate;
import com.example.springbootcrud.repository.ImportantDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImportantDateServiceImpl implements ImportantDateService {

    private ImportantDateRepository importantDateRepository;


    @Override
    public ImportantDate creatImportantDate(ImportantDate importantDate) {
        return importantDateRepository.save(importantDate);
    }

    @Override
    public ImportantDate updateImportantDate(ImportantDate importantDate) {

        Optional<ImportantDate> importantDateDb = importantDateRepository.findById(importantDate.getId());
        if (importantDateDb.isPresent()) {
            ImportantDate importantDateUpdated = importantDateDb.get();
            importantDateUpdated.setDate(importantDate.getDate());
            importantDateUpdated.setImportantDateTypes(importantDate.getImportantDateTypes());
            importantDateRepository.save(importantDateUpdated);
            return importantDateUpdated;
        } else {
            throw new ResourceNotFoundException("(Update)Important Date Record not Found with id" + importantDate.getId());
        }
    }

    @Override
    public List<ImportantDate> getAllImportantDate() {
        return (List<ImportantDate>) importantDateRepository.findAll();
    }

    @Override
    public ImportantDate getImportantDateById(long id) {
        Optional<ImportantDate> importantDateDb = importantDateRepository.findById(id);
        if (importantDateDb.isPresent()) {
            return importantDateDb.get();
        } else {
            throw new ResourceNotFoundException("(GetById)Important Date Record not Found with id" + id);
        }
    }

    @Override
    public void deleteImportantDate(long id) {
        Optional<ImportantDate> importantDateDb = importantDateRepository.findById(id);
        if (importantDateDb.isPresent()) {
            importantDateRepository.delete(importantDateDb.get());
        } else {
            throw new ResourceNotFoundException("(Delete)Important Date Record not Found with id" + id);
        }

    }

    @Autowired
    public void setImportantDateRepository(ImportantDateRepository importantDateRepository) {
        this.importantDateRepository = importantDateRepository;
    }
}
