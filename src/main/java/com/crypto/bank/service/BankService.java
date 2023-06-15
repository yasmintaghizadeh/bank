package com.crypto.bank.service;

import com.crypto.bank.exception.NotEnoughAmountException;
import com.crypto.bank.models.TransactionStatus;
import com.crypto.bank.models.entities.Bank;
import com.crypto.bank.models.requestrespons.DepositResponse;
import com.crypto.bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BankService extends AbstractService<Bank, BankRepository> {
    @Autowired
    Bank bank;

    public void withdraw(Long amount) throws NotEnoughAmountException {
        DepositResponse depositResponse=new DepositResponse();
        if (bank.getBalance()<amount){
                     throw new NotEnoughAmountException("not-enough-amount");
        }
         bank.setBalance(bank.getBalance()-amount);
    }

    public void deposit(Long amount)  {
            bank.setBalance(bank.getBalance()+amount);
    }

}
