package com.s3.test.service;

import com.s3.test.model.Customer;
import com.s3.test.repository.CustomerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerService implements CustomerServiceInterface {

    public CustomerService() {}

    @Autowired
    private CustomerRepositoryInterface repository;

    @Override
    public List<Customer> findAll() {

       return (List<Customer>) repository.findAll();

    }

    public List<Customer> insertCustomers(List<Customer> myCustomers) {

        List<Customer> mySavedCustomers = new ArrayList<Customer>();

        for(Customer customer: myCustomers) {

            mySavedCustomers.add(repository.save(customer));

        }

        return mySavedCustomers;

    }

    @Override
    public String deleteCustomerById(String customerId) {

        try {

            if(repository.findById(customerId).isPresent()) {

                repository.deleteById(customerId);
                return("Customer: " + customerId + " deleted");

            } else{

                return("Error! Could not find Customer to delete");

            }

        } catch(Exception ex) {

            ex.printStackTrace();
            return("Error! Could not delete Customer");

        }
    }

    @Override
    public String updateCustomer(List<Customer> myCustomer) {

        String customerId = myCustomer.get(0).getCustomer_id();

        try {

            if(repository.findById(customerId).isPresent()) {

                repository.save(myCustomer.get(0));
                return("Customer: " + customerId + " updated");

            } else{

                return("Error! Could not find Customer to update");

            }

        } catch(Exception ex) {

            ex.printStackTrace();
            return("Error! Could not update Customer");

        }
    }




}
