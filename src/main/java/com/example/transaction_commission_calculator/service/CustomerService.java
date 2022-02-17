package com.example.transaction_commission_calculator.service;

import com.example.transaction_commission_calculator.entity.Customer;
import com.example.transaction_commission_calculator.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
