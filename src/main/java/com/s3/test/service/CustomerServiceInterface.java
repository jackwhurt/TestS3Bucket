package com.s3.test.service;

import com.s3.test.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerServiceInterface {

    List<Customer> findAll();
    List<Customer> insertCustomers(List<Customer> myCustomers);
    String deleteCustomerById(String customer_id);
    String updateCustomer(List<Customer> myCustomers);

}
