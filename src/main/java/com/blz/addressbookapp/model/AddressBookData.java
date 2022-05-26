package com.blz.addressbookapp.model;

import com.blz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fname;

    private String lname;

    private String phonenumber;

    private String email;

    private String city;

    private String state;

    private long zipcode;

    public AddressBookData() {

    }

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.fname = addressBookDTO.getFname();
        this.lname = addressBookDTO.getLname();
        this.phonenumber = addressBookDTO.getPhonenumber();
        this.email = addressBookDTO.getEmail();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipcode = addressBookDTO.getZipcode();
    }
}
