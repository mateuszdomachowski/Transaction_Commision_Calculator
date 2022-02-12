package com.example.transaction_commission_calculator.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "transactions")
    private Set<Customer> customers = new HashSet<>();

    public Transaction(BigDecimal transactionAmount, LocalDateTime transactionDate) {
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }
}
