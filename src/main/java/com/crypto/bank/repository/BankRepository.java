package com.crypto.bank.repository;

import com.crypto.bank.models.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,String> {
}
