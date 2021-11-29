package com.example.Mobile.Mobile_Products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mobile.Mobile_Products.entity.ContactData;

 

public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}

