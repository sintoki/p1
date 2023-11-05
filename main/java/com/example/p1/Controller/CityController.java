package com.example.p1.Controller;

import com.example.p1.RequestDtos.CityDto;
import com.example.p1.ResponseDtos.CityResponseDto;
import com.example.p1.Service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    @PostMapping("/create")
    public CityResponseDto create(@RequestBody CityDto cityDto){
        return cityService.create(cityDto);
    }


}
