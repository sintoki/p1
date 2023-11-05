package com.example.p1.Controller;

import com.example.p1.RequestDtos.BookDto;
import com.example.p1.ResponseDtos.BookResponseDto;
import com.example.p1.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/create")
    public BookResponseDto create(@RequestBody BookDto bookDto) {
        return bookService.create(bookDto);
    }
}
