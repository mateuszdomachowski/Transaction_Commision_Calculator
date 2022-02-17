package com.example.transaction_commission_calculator.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


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

    @Column(name = "transaction_amount", nullable = false)
    private BigDecimal transactionAmount;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;


    public Transaction(BigDecimal transactionAmount, LocalDateTime transactionDate) {
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
    }
}
