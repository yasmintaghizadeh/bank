package com.crypto.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbstractService<E,R extends JpaRepository<E,String>> {
    @Autowired
    private R repository;
    public void add(E e) throws Exception{
        repository.save(e);
    }
    public void update(E e) throws Exception{
        repository.save(e);
    }
    public Optional<E> findById(String id) throws Exception{
        return repository.findById(id);
    }
    public void deleteById(String id) throws Exception{
        repository.deleteById(id);
    }
    public E getById(String id) throws Exception{
        return repository.getReferenceById(id) ;
    }
    public List<E> getAll() throws Exception{
        return repository.findAll();
    }
}
