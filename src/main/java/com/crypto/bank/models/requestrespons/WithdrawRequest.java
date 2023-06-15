package com.crypto.bank.models.requestrespons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawRequest {
    private String cardNumber;
    private String trackingId;
    private Long amount;
}
