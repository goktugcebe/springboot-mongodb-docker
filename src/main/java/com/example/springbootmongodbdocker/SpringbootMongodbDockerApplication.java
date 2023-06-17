package com.example.springbootmongodbdocker;

import com.example.springbootmongodbdocker.dao.BookRepository;
import com.example.springbootmongodbdocker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringbootMongodbDockerApplication {
private BookRepository bookRepository;
@Autowired
    public SpringbootMongodbDockerApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
    @GetMapping
    public List<Book> getBooks(){
    return bookRepository.findAll();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbDockerApplication.class, args);
    }

}
