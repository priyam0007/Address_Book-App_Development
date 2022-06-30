package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAllAddressBookData();

    AddressBookData getAddressBookData(int id);
    List<AddressBookData> sortAddressBookByCity();
    List<AddressBookData> sortAddressBookByState();
    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int id);

}



