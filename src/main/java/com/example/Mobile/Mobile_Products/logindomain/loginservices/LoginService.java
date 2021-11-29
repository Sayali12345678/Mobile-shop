package com.example.Mobile.Mobile_Products.logindomain.loginservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mobile.Mobile_Products.controller.logindomain.Login;
import com.example.Mobile.Mobile_Products.logindomain.loginrepository.loginRepository;

 

@Service
public class LoginService {
@Autowired
private loginRepository repo;
  
  public Login login(String username, String password) {
  Login user = repo.findByEmailAndPassword(username, password);
  return user;
 
}
}