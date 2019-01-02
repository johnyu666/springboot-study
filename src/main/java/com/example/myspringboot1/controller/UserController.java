package com.example.myspringboot1.controller;

import com.example.myspringboot1.bean.Book;
import com.example.myspringboot1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class UserController {
    @Autowired
    private BookRepository br;
    @RequestMapping("/addBook")
    @ResponseBody
    public Book addBook(){
        System.out.println("add book.....");
        Book book=new Book();
        book.setBname("john");
        Book b=br.save(book);
        return b;

    }
//    @RequestMapping("/login")
//    public String login(String uname, Model model){
//        model.addAttribute("userName","JohnYu");
//        //逻辑视图名称
//        return "welcome";
//
//    }
}
