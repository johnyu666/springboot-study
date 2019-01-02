package com.example.myspringboot1;

import com.example.myspringboot1.bean.Book;
import com.example.myspringboot1.bean.User;
import com.example.myspringboot1.repository.BookRepository;
import com.example.myspringboot1.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired private BookRepository br;
	@Autowired private UserRepository ur;
	@Test public void test1(){
		Book book=new Book();
		book.setBname("tom123");
		br.save(book);
	}

	@Test public void test2(){
		User u=new User();
		u.setUsername("alice");
		u.setPassword("234");
		u.setFullName("John Yu");

		ur.save(u);

		System.out.println(u.getId());

	}
}
