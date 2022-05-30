package com.blz.addressbookapp.controller;


import com.blz.addressbookapp.dto.AddressBookDTO;
import com.blz.addressbookapp.dto.ResponseDTO;
import com.blz.addressbookapp.model.AddressBookData;
import com.blz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private IAddressBookService iAddressBookService;

    //get addressbook details
    @RequestMapping ("/get")
    public ResponseEntity<ResponseDTO> getAddressbookData(){
        List<AddressBookData> addressBookData =iAddressBookService.getAddressBookData();
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //get addressbook details by id
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable int id){
        AddressBookData addressBookData=iAddressBookService.getAddressBookDataById(id);
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    //   To get city in ascending order
    @GetMapping("/get/sortbycity")
    public ResponseEntity<ResponseDTO> sortByCity() {
        List<AddressBookData> addressBookList = null ;
        addressBookList = iAddressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("Sort by city call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    //   To get state in ascending order
    @GetMapping("/get/sortbystate")
    public ResponseEntity<ResponseDTO> sortByState() {
        List<AddressBookData> addressBookList = null;
        addressBookList = iAddressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("Sort by state call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    //create addressbook details by RequestBody
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData=iAddressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Addressbook data succesfully",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //update addressbook details by id with RequestBody
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable int id, @Valid @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = iAddressBookService.updateAddressBookData(id,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated Addressbook data succesfully",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    // Delet addressbook details by id
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int id){
        iAddressBookService.deleteAddressBookData(id);
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}