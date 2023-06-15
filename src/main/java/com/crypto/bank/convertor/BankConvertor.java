package com.crypto.bank.convertor;

import com.crypto.bank.models.dto.BankDto;
import com.crypto.bank.models.entities.Bank;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankConvertor extends AbstractConvertor <Bank, BankDto> {

}
