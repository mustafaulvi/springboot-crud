package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.ImportantDate;
import org.springframework.data.repository.CrudRepository;

public interface ImportantDateRepository extends CrudRepository<ImportantDate,Long> {
}
