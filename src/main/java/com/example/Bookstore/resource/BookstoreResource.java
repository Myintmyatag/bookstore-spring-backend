package com.example.Bookstore.resource;

import com.example.Bookstore.dto.Bookstore;
import com.example.Bookstore.dto.Response;
import com.example.Bookstore.service.BookstoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BookstoreResource {

    private BookstoreService bookstoreService;

    public BookstoreResource(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    @GetMapping("/books")
    public List<Bookstore> findAll(){
        return bookstoreService.findAll();
    }

    @PostMapping
    public ResponseEntity<Response> createBook(@RequestBody Bookstore bookstore){
        bookstoreService.create(bookstore);
        return ResponseEntity.ok().body(new Response(HttpStatus.CREATED, "Book is created"));
    }

    @GetMapping("{id}")
    public Optional<Bookstore> findById(@PathVariable String id){
        return bookstoreService.findById(id);
    }
}
