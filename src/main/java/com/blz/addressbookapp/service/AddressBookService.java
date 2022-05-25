package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.model.AddressBookData;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService implements IAddressBookService {
    @Override
    public List<AddressBookData> getEmployeePayrollData() {
        List<AddressBookData> employeePayrolDataList=new ArrayList<>();
        employeePayrolDataList.add(new AddressBookData(1,new AddressBookDTO("Vinayak","Patil",
                "8765432145","developer@gmail.com","bijapur","karnatak",586109)));
        return employeePayrolDataList;
    }

    @Override
    public AddressBookData getEmployeePayrollDataById(int id) {
        AddressBookData addressBookData=new AddressBookData(2,new AddressBookDTO("priya","madiwalar",
                "8765432198","developer@gmail.com","bijapur","karnatak",586109));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData employeePayrolData=new AddressBookData(1,addressBookDTO);
        return employeePayrolData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData employeePayrolData=new AddressBookData(1,addressBookDTO);
        return employeePayrolData;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
    }
}



