package com.example.p1.Service;

import com.example.p1.Models.Author;
import com.example.p1.Models.City;
import com.example.p1.Repository.AuthorRepository;
import com.example.p1.Repository.CityRepository;
import com.example.p1.RequestDtos.AuthorDto;
import com.example.p1.ResponseDtos.AuthorResponseDto;
import com.example.p1.ResponseDtos.CityResponseDto;
import com.example.p1.ResponseDtos.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private Mapper mapper;
    public AuthorResponseDto create(AuthorDto authorDto) {
        Author author= Author.builder().
                authorContact(authorDto.getAuthorContact()).
                authorName(authorDto.getAuthorName()).
                build();
        City city= cityRepository.findById(authorDto.getCityId());
        if ( city ==null) {
            throw new RuntimeException();
        }
        else{
            author.setCity(city);
            author= authorRepository.save(author);

        }
       return mapper.mappingAuthor(author);

    }
}
