package com.banking.account.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Long transactionId;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private Long accountNumber;
    private String userName;
    private Double transactionAmount;
    private Double availableBalance;

}
