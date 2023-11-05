package com.example.p1.Controller;

import com.example.p1.RequestDtos.AuthorDto;
import com.example.p1.RequestDtos.CityDto;
import com.example.p1.ResponseDtos.AuthorResponseDto;
import com.example.p1.ResponseDtos.CityResponseDto;
import com.example.p1.Service.AuthorService;
import com.example.p1.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @PostMapping("/create")
    public AuthorResponseDto create(@RequestBody AuthorDto authorDto){
        return authorService.create(authorDto);
    }


}
