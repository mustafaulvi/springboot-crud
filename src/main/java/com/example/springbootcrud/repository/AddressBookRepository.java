package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.AddressBook;
import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepository extends CrudRepository <AddressBook,Long> {
}
