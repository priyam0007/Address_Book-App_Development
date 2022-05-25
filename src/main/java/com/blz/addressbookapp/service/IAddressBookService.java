package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int id);
    AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO);
    void deleteEmployeePayrollData(int id);
}


