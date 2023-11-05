package com.example.p1.ResponseDtos;

import lombok.Data;

import java.util.List;
@Data
public class BookResponseDto {
    private int id;
    private String bookName;
    private String bookCost;
    private double bookNo;
    private String category;
    private List<AuthorResponseDto> authors;
}
