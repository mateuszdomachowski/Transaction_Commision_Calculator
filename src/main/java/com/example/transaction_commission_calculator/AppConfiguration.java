package com.example.transaction_commission_calculator;

import com.example.transaction_commission_calculator.entity.Customer;
import com.example.transaction_commission_calculator.entity.Transaction;
import com.example.transaction_commission_calculator.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomMapEditor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Configuration
public class AppConfiguration {

    private final CustomerRepository customerRepository;

    @Autowired
    public AppConfiguration(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {

            Customer customer = new Customer("Mateusz", "Domachowski");

            Transaction transaction1 = new Transaction(BigDecimal.valueOf(1000), LocalDateTime.now());
            Transaction transaction2 = new Transaction(BigDecimal.valueOf(1349.99), LocalDateTime.now());
            Transaction transaction3 = new Transaction(BigDecimal.valueOf(2.99), LocalDateTime.now());

            customer.getTransactionList().add(transaction1);
            customer.getTransactionList().add(transaction2);
            customer.getTransactionList().add(transaction3);

            this.customerRepository.save(customer);
        };
    }
}
