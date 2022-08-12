package com.example.springbootcrud.service;

import com.example.springbootcrud.exception.ResourceNotFoundException;
import com.example.springbootcrud.model.ImportantDateType;
import com.example.springbootcrud.repository.ImportantDateTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImportantDateTypeServiceImpl implements ImportantDateTypeService {

    private ImportantDateTypeRepository importantDateTypeRepository;

    @Override
    public ImportantDateType creatImportantDateType(ImportantDateType importantDateType) {
        return importantDateTypeRepository.save(importantDateType);
    }

    @Override
    public ImportantDateType updateImportantDateType(ImportantDateType importantDateType) {
        Optional<ImportantDateType> importantDateTypeDb = importantDateTypeRepository.findById(importantDateType.getId());
        if (importantDateTypeDb.isPresent()) {
            ImportantDateType importantDateTypeUpdate = importantDateTypeDb.get();
            importantDateTypeUpdate.setName(importantDateType.getName());
            importantDateTypeRepository.save(importantDateTypeUpdate);
            return importantDateTypeUpdate;
        } else {
            throw new ResourceNotFoundException("(Update) Important Date Type Record not Found with id" + importantDateType.getId());
        }
    }

    @Override
    public List<ImportantDateType> getAllImportantDateType() {
        return (List<ImportantDateType>) importantDateTypeRepository.findAll();
    }

    @Override
    public ImportantDateType getImportantDateTypeById(long id) {
        Optional<ImportantDateType> importantDateTypeDb = importantDateTypeRepository.findById(id);
        if (importantDateTypeDb.isPresent()) {
            return importantDateTypeDb.get();

        } else {
            throw new ResourceNotFoundException("(GetById) Important Date Type Record not Found with id" + id);
        }
    }

    @Override
    public void deleteImportantDateType(long id) {
        Optional<ImportantDateType> importantDateTypeDb = importantDateTypeRepository.findById(id);
        if (importantDateTypeDb.isPresent()) {
            importantDateTypeRepository.delete(importantDateTypeDb.get());
        } else {
            throw new ResourceNotFoundException("(Delete) Important Date Type Record not Found with id" + id);

        }

    }

    @Autowired
    public void setImportantDateTypeRepository(ImportantDateTypeRepository importantDateTypeRepository) {
        this.importantDateTypeRepository = importantDateTypeRepository;
    }
}
