package com.s3.test.controller;

import com.s3.test.model.Customer;
import com.s3.test.service.CustomerServiceInterface;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    public CustomerController() {}

    @Autowired
    private CustomerServiceInterface customerService;

    @GetMapping("/showCustomers")
    public List<Customer> findAll() {

        return (List<Customer>) customerService.findAll();

    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customersToAdd) {

        return customerService.insertCustomers(customersToAdd);

    }

    @DeleteMapping("/deleteCustomer")
    public String deleteCustomer(@RequestBody JSONObject customerIdJSON) {

        String customerIdToDelete = customerIdJSON.getAsString("customer_id");

        return customerService.deleteCustomerById(customerIdToDelete);

    }

    @PutMapping("/updateCustomer")
    public String updateCustomer(@RequestBody List<Customer> myCustomer) {

        return customerService.updateCustomer(myCustomer);

    }

}
