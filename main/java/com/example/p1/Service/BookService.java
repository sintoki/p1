package com.example.p1.Service;

import com.example.p1.Models.Author;
import com.example.p1.Models.Book;
import com.example.p1.Repository.AuthorRepository;
import com.example.p1.Repository.BookRepository;
import com.example.p1.RequestDtos.BookDto;
import com.example.p1.ResponseDtos.AuthorResponseDto;
import com.example.p1.ResponseDtos.BookResponseDto;
import com.example.p1.ResponseDtos.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private Mapper mapper;
    public BookResponseDto create(BookDto bookDto) {
        // i know how my mapper is working then whats the poblem
        Book book=Book.builder().
                bookName(bookDto.getBookName()).bookCost(bookDto.getBookCost())
                .bookNo(bookDto.getBookNo())
                .build();
        List<Integer> authorIds= bookDto.getAuthorIds();
        List<Author> ll =new ArrayList<Author>();

        boolean allExist = authorIds.stream().allMatch(authorRepository::existsById);

        if ( allExist==false) {
            throw new RuntimeException();
        }
        else {
            //retrive all the data like all the authors from repo
            ll = authorRepository.findAllById(authorIds);

        }

        book.setAuthors(ll);
        book=bookRepository.save(book);
                return mapper.mappingB(book);


    }

}
