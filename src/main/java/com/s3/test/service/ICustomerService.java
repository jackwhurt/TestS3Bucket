package com.s3.test.service;

import com.s3.test.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}
