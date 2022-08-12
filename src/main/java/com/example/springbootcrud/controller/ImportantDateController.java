package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.ImportantDate;
import com.example.springbootcrud.service.ImportantDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImportantDateController {

    private ImportantDateService importantDateService;

    @GetMapping("/importantDates")
    public ResponseEntity<List<ImportantDate>> getAllImportantDate() {
        return ResponseEntity.ok().body(importantDateService.getAllImportantDate());
    }

    @GetMapping("/importantDates/{id}")
    public ResponseEntity<ImportantDate> getImportantDateById(@PathVariable long id) {
        return ResponseEntity.ok().body(importantDateService.getImportantDateById(id));
    }

    @PostMapping("/importantDates")
    public ResponseEntity<ImportantDate> createImportantDate(@RequestBody ImportantDate importantDate) {
        return ResponseEntity.ok().body(importantDateService.creatImportantDate(importantDate));
    }

    @PutMapping("/importantDates")
    public ResponseEntity<ImportantDate> updateImportantDate(@RequestBody ImportantDate importantDate) {
        return ResponseEntity.ok().body(importantDateService.updateImportantDate(importantDate));
    }

    @DeleteMapping("/importantDates/{id}")
    public HttpStatus deleteImportantDate(@PathVariable long id) {
        this.importantDateService.deleteImportantDate(id);
        return HttpStatus.OK;
    }

    @Autowired
    public void setImportantDateService(ImportantDateService importantDateService) {
        this.importantDateService = importantDateService;
    }
}
