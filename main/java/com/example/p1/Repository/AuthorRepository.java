package com.example.p1.Repository;

import com.example.p1.Models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
//    boolean existsByAuthorIds(Integer integer);

//    boolean existsAuthorById(Long authorId);

   
}
