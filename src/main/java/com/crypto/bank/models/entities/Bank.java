package com.crypto.bank.models.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bank extends AbstractEntity{
    private String accountNumber;
    private String cardNumber;
    private Long balance;

}
