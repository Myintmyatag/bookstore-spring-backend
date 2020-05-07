package com.example.Bookstore.service;

import com.example.Bookstore.dto.Bookstore;
import com.example.Bookstore.repository.BookstoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookstoreService {

    @Autowired
    private BookstoreRepository bookstoreRepository;

    public void create(Bookstore bookstore){
        bookstoreRepository.save(bookstore);
    }

    public List<Bookstore> findAll(){
        return bookstoreRepository.findAll();
    }

    public Optional<Bookstore> findById(String id){
        return bookstoreRepository.findById(id);
    }
}
