package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.dto.ResponseDTO;
import com.blz.addressbookapp.model.AddressBookData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int id);
    List<AddressBookData> sortAddressBookByCity();
    List<AddressBookData> sortAddressBookByState();

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int id);

}


