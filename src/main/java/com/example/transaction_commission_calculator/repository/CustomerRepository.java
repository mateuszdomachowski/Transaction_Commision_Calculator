package com.example.transaction_commission_calculator.repository;

import com.example.transaction_commission_calculator.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

//    @Query
//    Optional<Customer> findCustomerById(Long id);

}
