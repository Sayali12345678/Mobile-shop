package com.example.Mobile.Mobile_Products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mobile.Mobile_Products.entity.UserData;
import com.example.Mobile.Mobile_Products.repository.UserRepository;

 

@RestController
@RequestMapping("/sign")

public class ApiController {
@Autowired
UserRepository ss;
@GetMapping("/user")
@PostMapping("/users")
public List<UserData>get(){
return ss.findAll();
}

   
}