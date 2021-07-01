package com.s3.test.service;

import com.s3.test.model.Customer;
import com.s3.test.repository.CustomerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    public CustomerService() {}

    @Autowired
    private CustomerRepositoryInterface repository;

    @Override
    public List<Customer> findAll() {

       return (List<Customer>) repository.findAll();

    }

}
