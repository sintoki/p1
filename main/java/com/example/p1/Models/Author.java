package com.example.p1.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String authorName;

    private String authorContact;

    @ManyToMany(mappedBy = "authors")
    private List<Book>bookList;


    @JsonIgnore
    @OneToOne
    @JoinColumn
    private City city;


}
