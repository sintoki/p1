package com.example.p1.RequestDtos;

import lombok.Data;

import java.util.List;
@Data
public class BookDto {

        private String bookName;
        private String bookCost;
        private double bookNo;
        private String category; //ds to specify which authors are associated with the book.
        private List<Integer> authorIds;


        // Getters and setters
    }