package com.crypto.bank.controller;

import com.crypto.bank.convertor.AbstractConvertor;
import com.crypto.bank.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/bank")
public abstract class AbstractController<E,D,S extends AbstractService<E,?extends JpaRepository<E,String>>> {
    @Autowired
    protected S service;
    @Autowired
    protected AbstractConvertor<E,D> convertor;

}
