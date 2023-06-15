package com.crypto.bank.models.dto;

import lombok.Data;

@Data
public abstract class AbstractDto {
    private String id;
    private Data lastModifiedDate;
    private Data createdDate;
    private Integer version;

}
