package com.example.springbootcrud.service;

import com.example.springbootcrud.model.PersonGroup;

import java.util.List;

public interface PersonGroupService {
    PersonGroup creatPersonGroup(PersonGroup personGroup);

    PersonGroup updatePersonGroup(PersonGroup personGroup);

    List<PersonGroup> getAllPersonGroup();

    PersonGroup getPersonGroupById(long id);

    void deletePersonGroup(long id);
}
