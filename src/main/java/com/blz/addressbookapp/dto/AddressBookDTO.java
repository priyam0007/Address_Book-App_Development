package com.blz.addressbookapp.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Addressbook author first name pattern is invalid")
    private String fname;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Addressbook author last name pattern is invalid")
    private String lname;
    @NotNull(message = "phone number should not be empty")
    private String phonenumber;
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Email pattern is invalid")
    private String email;
    @NotBlank(message = "city should not be empty")
    private String city;
    private String state;
  //@Pattern(regexp = "^[0-9]{5}(?:-[0-9]{4})?$",message = "zipcode is invalid")
    private long zipcode;

}











