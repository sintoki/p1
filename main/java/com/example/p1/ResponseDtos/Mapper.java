package com.example.p1.ResponseDtos;

import com.example.p1.Models.Author;
import com.example.p1.Models.Book;
import com.example.p1.Models.City;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class Mapper {
    //maps the stuff

    public CityResponseDto mapping(City city){
        CityResponseDto cityResponseDto=new CityResponseDto();
        cityResponseDto.setCityName(city.getCityName());
        cityResponseDto.setZipCode(city.getZipCode());
        return cityResponseDto;

    }

    public AuthorResponseDto mappingAuthor(Author author) {
        AuthorResponseDto authorResponseDto= new AuthorResponseDto();
        authorResponseDto.setAuthorContact(author.getAuthorContact());
        authorResponseDto.setAuthorName(author.getAuthorName());
        authorResponseDto.setCityName(author.getCity().getCityName());
        authorResponseDto.setZipCode(author.getCity().getZipCode());
        return authorResponseDto;
    }

    public BookResponseDto mappingB(Book book) {
        BookResponseDto b=new BookResponseDto();
        b.setId(book.getId());
        b.setBookCost(book.getBookCost());
        b.setCategory(String.valueOf(book.getCategory()));
        b.setBookName(book.getBookName());
        b.setBookNo(book.getBookNo());
        List<Author> authorr = book.getAuthors();
//convert this author into authorresponse dto
        List<AuthorResponseDto>authorResponseDtos=new ArrayList<>();
        authorResponseDtos=authorr.stream().map(this::mappingAuthor).collect(Collectors.toList());
        b.setAuthors(authorResponseDtos);
        return  b;
    }
}
