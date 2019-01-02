package com.example.myspringboot1.repository;

import com.example.myspringboot1.bean.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
