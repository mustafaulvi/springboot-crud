package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.PersonGroup;
import org.springframework.data.repository.CrudRepository;

public interface PersonGroupRepository extends CrudRepository<PersonGroup, Long> {
}
