package com.s3.test.controller;

import com.s3.test.model.Customer;
import com.s3.test.repository.CustomerRepositoryInterface;
import com.s3.test.service.CustomerService;
import com.s3.test.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    public CustomerController() {}

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/showCustomers")
    public List<Customer> findAll(Model model) {

        List<Customer> customers = (List<Customer>) customerService.findAll();

        model.addAttribute("customers", customers);

        return customers;

    }
}
