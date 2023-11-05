package com.example.p1.Service;

import com.example.p1.Models.City;
import com.example.p1.Repository.CityRepository;
import com.example.p1.RequestDtos.CityDto;
import com.example.p1.ResponseDtos.CityResponseDto;
import com.example.p1.ResponseDtos.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private Mapper mapper;

    public CityResponseDto create(CityDto cityDto) {
     City city=City.builder()
             .cityName(cityDto.getCityName()).
             zipCode(cityDto.getZipCode()).
             build();
   city=  cityRepository.save(city);
     return mapper.mapping(city);


    }
}
