package com.blz.addressbookapp.model;

import com.blz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "addressBookDetails")
public class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressBook_id")
    private int id;
    private String fname;

    private String lname;

    private String phonenumber;

    private String address;
    private String email;

    private String city;

    private String state;

    private String zipcode;


    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }

    public AddressBookData() {
    }
    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.fname = addressBookDTO.getFname();
        this.lname = addressBookDTO.getLname();
        this.phonenumber = addressBookDTO.getPhonenumber();
        this.address = addressBookDTO.getAddress();
        this.email = addressBookDTO.getEmail();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipcode = addressBookDTO.getZipcode();

    }
}