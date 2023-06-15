package com.crypto.bank.controller;

import com.crypto.bank.exception.NotEnoughAmountException;
import com.crypto.bank.models.dto.BankDto;
import com.crypto.bank.models.entities.Bank;
import com.crypto.bank.models.requestrespons.WithdrawRequest;
import com.crypto.bank.service.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BankController extends AbstractController<Bank, BankDto, BankService> {
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void withdraw (@RequestBody WithdrawRequest request) throws NotEnoughAmountException {
        service.withdraw(request.getAmount());
    }
}
