package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.PersonGroup;
import com.example.springbootcrud.service.PersonGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonGroupController {

    private PersonGroupService personGroupService;

    @GetMapping("/personGroups")
    public ResponseEntity<List<PersonGroup>> getAllPersonGroup() {
        return ResponseEntity.ok().body(personGroupService.getAllPersonGroup());
    }

    @GetMapping("/personGroups/{id}")
    public ResponseEntity<PersonGroup> getPersongroupById(@PathVariable long id) {
        return ResponseEntity.ok().body(personGroupService.getPersonGroupById(id));
    }

    @PostMapping("/personGroups")
    public ResponseEntity<PersonGroup> creatPersonGroup(@RequestBody PersonGroup personGroup) {
        return ResponseEntity.ok().body(personGroupService.creatPersonGroup(personGroup));
    }

    @PutMapping("/personGroups")
    public ResponseEntity<PersonGroup> updatePersonGroup(@RequestBody PersonGroup personGroup) {
        return ResponseEntity.ok().body(personGroupService.updatePersonGroup(personGroup));
    }

    @DeleteMapping("/personGroups/{id}")
    public HttpStatus deletePersonGroup(@PathVariable long id) {
        this.personGroupService.deletePersonGroup(id);
        return HttpStatus.OK;
    }

    @Autowired
    public void setPersonGroupService(PersonGroupService personGroupService) {
        this.personGroupService = personGroupService;
    }
}
