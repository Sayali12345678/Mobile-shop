package com.example.Mobile.Mobile_Products.logindomain.loginrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Mobile.Mobile_Products.controller.logindomain.Login;

 

public interface loginRepository extends JpaRepository<Login, Long>{
	Login findByEmailAndPassword(String email, String password);
}
