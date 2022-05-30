package com.blz.addressbookapp.repository;

import com.blz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {
    @Query(value = "select *from address_book_details order by city asc", nativeQuery = true)
    List<AddressBookData> sortByCity();
    @Query(value = "select *from address_book_details order by state asc", nativeQuery = true)
    List<AddressBookData> sortByState();
}

