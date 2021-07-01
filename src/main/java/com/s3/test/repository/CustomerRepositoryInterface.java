package com.s3.test.repository;

import com.s3.test.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepositoryInterface extends JpaRepository<Customer, String> {

    //List<Customer> finContactNamedBy(String contact_name);
    //List<Customer> findAll();

}
