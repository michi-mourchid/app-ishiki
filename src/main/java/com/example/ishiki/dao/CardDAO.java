package com.example.ishiki.dao;

import com.example.ishiki.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDAO extends JpaRepository<Card,Long> {
}
