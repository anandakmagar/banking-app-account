package com.banking.account.dto;

import com.banking.account.enumeration.AccountStatus;
import com.banking.account.enumeration.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long accountNumber;
    private String fullName;
    private String email;
    private String street;
    private String city;
    private String state;
    private String country;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    private Double balance;
}
