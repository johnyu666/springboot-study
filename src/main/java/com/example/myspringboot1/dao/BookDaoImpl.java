package com.example.myspringboot1.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookDaoImpl {
    @PersistenceContext()
    private EntityManager manager;

    public void addBook(){
        System.out.println(manager);
    }
}
