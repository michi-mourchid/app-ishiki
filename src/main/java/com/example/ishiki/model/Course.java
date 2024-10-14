package com.example.ishiki.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name="courses")
@NoArgsConstructor
@Getter
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String content;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="field_id")
    private Field field;
    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<Card> cards;
}
