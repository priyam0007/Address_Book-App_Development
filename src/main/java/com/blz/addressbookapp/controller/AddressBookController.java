package com.blz.addressbookapp.controller;

import com.blz.addressbookapp.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/AddressBookApp")
public class AddressBookController {

    @RequestMapping("/get")
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get call Success", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getAddressBookData(@PathVariable int id){
        return  new ResponseEntity<String>("Get call Success for id"+id, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<String> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        return  new ResponseEntity<String>("created Address Book data for"+addressBookDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        return  new ResponseEntity<String>("updated Address Book data for"+addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable int id){
        return  new ResponseEntity<String>("delete call Success for id"+id, HttpStatus.OK);
    }

}

