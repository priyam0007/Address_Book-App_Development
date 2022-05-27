package com.blz.addressbookapp.service;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.exception.AddressBookException;
import com.blz.addressbookapp.model.AddressBookData;
import com.blz.addressbookapp.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
    @Autowired
    private AddressBookRepository addressBookRepository;
    private List<AddressBookData> addressBookDataList=new ArrayList<>();
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        return addressBookDataList.stream().filter(addressBookData -> addressBookData.getId() == id)
                .findFirst().orElseThrow(()-> new AddressBookException("Exception Not Found!!"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        log.info("AddressBook data:"+addressBookData.toString());
        addressBookDataList.add(addressBookData);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=this.getAddressBookDataById(id);
        addressBookData.setFname(addressBookDTO.getFname());
        addressBookData.setLname(addressBookDTO.getLname());
        addressBookData.setPhonenumber(addressBookDTO.getPhonenumber());
        addressBookData.setEmail(addressBookDTO.getEmail());
        addressBookData.setCity(addressBookDTO.getCity());
        addressBookData.setState(addressBookDTO.getState());
        addressBookData.setZipcode(addressBookDTO.getZipcode());
        addressBookDataList.set(id-1,addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int id) {
        addressBookDataList.remove(id-1);
    }

}

