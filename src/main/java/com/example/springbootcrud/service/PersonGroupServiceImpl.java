package com.example.springbootcrud.service;

import com.example.springbootcrud.exception.ResourceNotFoundException;
import com.example.springbootcrud.model.PersonGroup;
import com.example.springbootcrud.repository.PersonGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonGroupServiceImpl implements PersonGroupService {

    private PersonGroupRepository personGroupRepository;

    @Override
    public PersonGroup creatPersonGroup(PersonGroup personGroup) {
        return personGroupRepository.save(personGroup);
    }

    @Override
    public PersonGroup updatePersonGroup(PersonGroup personGroup) {
        Optional<PersonGroup> personGroupDb = personGroupRepository.findById(personGroup.getId());
        if (personGroupDb.isPresent()) {
            PersonGroup personGroupUpdated = personGroupDb.get();
            personGroupUpdated.setName(personGroup.getName());
            personGroupRepository.save(personGroupUpdated);
            return personGroupUpdated;
        } else {
            throw new ResourceNotFoundException("(Update)Person Group Record not Found with id" + personGroup.getId());
        }
    }

    @Override
    public List<PersonGroup> getAllPersonGroup() {
        return (List<PersonGroup>) personGroupRepository.findAll();
    }

    @Override
    public PersonGroup getPersonGroupById(long id) {
        Optional<PersonGroup> personGroupDb = personGroupRepository.findById(id);
        if (personGroupDb.isPresent()) {
            return personGroupDb.get();

        } else {
            throw new ResourceNotFoundException("(GetById)Person Group Record not Found with id" + id);
        }
    }

    @Override
    public void deletePersonGroup(long id) {
        Optional<PersonGroup> personGroupDb = personGroupRepository.findById(id);
        if (personGroupDb.isPresent()) {
            personGroupRepository.delete(personGroupDb.get());
        } else {
            throw new ResourceNotFoundException("(delete)Person Group Record not Found with id" + id);
        }

    }

    @Autowired
    public void setPersonGroupRepository(PersonGroupRepository personGroupRepository) {
        this.personGroupRepository = personGroupRepository;
    }
}
