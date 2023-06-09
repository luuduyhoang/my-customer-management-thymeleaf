package com.codegym.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController  {
	
	private final ICustomerService customerService = new CustomerService();
	
	@GetMapping("")
	public String index(Model model) {
		List<Customer> customerList = customerService.findAll();
		model.addAttribute("customers", customerList);
		return "/index";
	}
	
}
