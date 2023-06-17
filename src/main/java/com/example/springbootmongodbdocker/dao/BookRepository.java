package com.example.springbootmongodbdocker.dao;

import com.example.springbootmongodbdocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
