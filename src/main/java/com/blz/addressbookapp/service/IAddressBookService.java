package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getEmployeePayrollData();
    AddressBookData getEmployeePayrollDataById(int id);
    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);
    public void deleteEmployeePayrollData(int id);
}

