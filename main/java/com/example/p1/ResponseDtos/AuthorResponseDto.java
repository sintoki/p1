package com.example.p1.ResponseDtos;

import lombok.Data;

@Data
public class AuthorResponseDto {
    private String authorName;
    private String authorContact;

    private String cityName;
    private String zipCode;
}
