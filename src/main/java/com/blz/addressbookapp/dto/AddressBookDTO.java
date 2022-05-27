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
    @NotBlank(message = "state should not be empty")
    private String state;
    @Pattern(regexp = "^[1-9]{1}[0-9]{2}\\-{0,1}\\s{0,1}[0-9]{3}$", message = "zipcode pattern is invalid")
    private long zipcode;

}











