package com.example.p1.Repository;

import com.example.p1.Models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {

    City findById(Long cityId);
}
