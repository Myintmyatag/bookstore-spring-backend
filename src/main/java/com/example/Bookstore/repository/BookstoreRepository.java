package com.example.Bookstore.repository;

import com.example.Bookstore.dto.Bookstore;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookstoreRepository extends MongoRepository<Bookstore,String> {
}
