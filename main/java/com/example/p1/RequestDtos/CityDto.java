package com.example.p1.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class CityDto {

    private int id;

    private String cityName;
    private String zipCode;
}
