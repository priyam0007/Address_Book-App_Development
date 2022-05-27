package com.blz.addressbookapp.repository;

import com.blz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
}
