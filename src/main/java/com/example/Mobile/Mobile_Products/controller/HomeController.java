package com.example.Mobile.Mobile_Products.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
 
import com.example.Mobile.Mobile_Products.entity.CheckoutData;
import com.example.Mobile.Mobile_Products.entity.ContactData;
import com.example.Mobile.Mobile_Products.entity.UserData;
import com.example.Mobile.Mobile_Products.repository.CheckRepository;
import com.example.Mobile.Mobile_Products.repository.ContactRepository;
import com.example.Mobile.Mobile_Products.repository.UserRepository;

 
@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;

	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/user")
	public String user()
	{
		return "user";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		
		
		return "redirect:/home";
	}
	
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@GetMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	 
	@GetMapping("/samsung")
	public String samsung()
	{
		return "samsung";
	}
	
	@GetMapping("/iphone")
	public String iphone()
	{
		return "iphone";
	}
	
	@GetMapping("/oneplus")
	public String oneplus()
	{
		return "oneplus";
	}
	@GetMapping("/redmi")
	public String redmi()
	{
		return "redmi";
	}
	
	@GetMapping("/about")
	public String aboutus()
	{
		return "about";
	}
	
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutnote";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData c, HttpSession session)
	{
		System.out.println(c);
		con.save(c);
		
		return "/home";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/signup";
	}
	
	@PostMapping("/checkoutpage")
	public String checkoutpage(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		
		
		return "redirect:/checkoutnote";
	}
	
	
	
}
