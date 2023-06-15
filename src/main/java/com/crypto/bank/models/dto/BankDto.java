package com.crypto.bank.models.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankDto extends AbstractDto {

        private String accountNumber;
        private String cardNumber;
        private Long balance;

    }
