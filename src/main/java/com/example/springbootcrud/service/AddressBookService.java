package com.example.springbootcrud.service;

import com.example.springbootcrud.model.AddressBook;

import java.util.List;

public interface AddressBookService {

    AddressBook creatAddressBook(AddressBook addressBook);

    AddressBook updateAddressBook(AddressBook addressBook);

    List<AddressBook> getAllAddressBook();

    AddressBook getAddressBookById(long id);

    void deleteAddressBook(long id);

}
