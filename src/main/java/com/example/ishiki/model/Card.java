package com.example.ishiki.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="cards")
@NoArgsConstructor
@Getter
public class Card {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String content;
    @Column(name="createdat")
    private Date createdAt = new Date();
    private String img;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "course_id")
    private Course course;
}
