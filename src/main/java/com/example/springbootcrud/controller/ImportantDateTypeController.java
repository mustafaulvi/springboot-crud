package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.ImportantDateType;
import com.example.springbootcrud.service.ImportantDateTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImportantDateTypeController {

    private ImportantDateTypeService importantDateTypeService;

    @GetMapping("/importantDateTypes")
    public ResponseEntity<List<ImportantDateType>> getAllImportantDateType() {
        return ResponseEntity.ok().body(importantDateTypeService.getAllImportantDateType());
    }

    @GetMapping("/importantDateTypes/{id}")
    public ResponseEntity<ImportantDateType> getImportantDateById(@PathVariable long id) {
        return ResponseEntity.ok().body(importantDateTypeService.getImportantDateTypeById(id));
    }

    @PostMapping("/importantDateTypes")
    public ResponseEntity<ImportantDateType> createImportantDateType(@RequestBody ImportantDateType importantDateType) {
        return ResponseEntity.ok().body(importantDateTypeService.creatImportantDateType(importantDateType));
    }

    @PutMapping("/importantDateTypes")
    public ResponseEntity<ImportantDateType> updateImportantDateType(@RequestBody ImportantDateType importantDateType) {
        return ResponseEntity.ok().body(importantDateTypeService.updateImportantDateType(importantDateType));
    }

    @DeleteMapping("/importDateTypes/{id}")
    public HttpStatus deleteImportantDateType(@PathVariable long id) {
        this.importantDateTypeService.deleteImportantDateType(id);
        return HttpStatus.OK;
    }

    @Autowired
    public void setImportantDateTypeService(ImportantDateTypeService importantDateTypeService) {
        this.importantDateTypeService = importantDateTypeService;
    }
}
