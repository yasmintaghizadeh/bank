package com.crypto.bank.models.requestrespons;

import com.crypto.bank.models.TransactionStatus;
import lombok.Data;

@Data
public class DepositResponse {
    private TransactionStatus status;
}
