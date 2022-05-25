package com.blz.addressbookapp.controller;

import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.dto.ResponseDTO;
import com.blz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddressBookApp")
public class AddressBookController {

    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData=new AddressBookData(1,new AddressBookDTO("Priya","Madiwalar",
                "9876543218","developer@gmail.com","bijapur","karnatak",586109));
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable int id){
        AddressBookData addressBookData=new AddressBookData(1,new AddressBookDTO("Priya","Madiwalar",
                "9876543218","developer@gmail.com","bijapur","karnatak",586109));
        ResponseDTO responseDTO=new ResponseDTO("Get call for ID Success",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Address Book succesfully",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("update Address Boook succesfully",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int id){
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

}

