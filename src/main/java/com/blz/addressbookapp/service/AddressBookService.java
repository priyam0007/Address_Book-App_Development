package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.exception.AddressBookException;
import com.blz.addressbookapp.model.AddressBookData;
import com.blz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;
    @Override
    public List<AddressBookData> getAllAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookData(int id) {
        return addressBookRepository.findById(id)
                .orElseThrow(()->
                        new AddressBookException("Exception with id"+id+"does not exist!!"));
    }

    @Override
    public List<AddressBookData> sortAddressBookByCity() {
        return addressBookRepository.sortByCity();
    }

    @Override
    public List<AddressBookData> sortAddressBookByState() {
        return addressBookRepository.sortByState();
    }


    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDTO);
        log.info("AddressBook data:"+addressBookData.toString());
        return addressBookRepository.save(addressBookData);
    }
    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=this.updateAddressBookData(id,addressBookDTO);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }
    @Override
    public void deleteAddressBookData(int id) {

    }
}