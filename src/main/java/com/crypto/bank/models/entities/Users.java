package com.crypto.bank.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class Users extends AbstractEntity{
    private String name;
    private String nationalCode;
    private String family;
    private String phoneNumber;

}
