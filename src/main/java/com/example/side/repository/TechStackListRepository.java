package com.example.side.repository;

import com.example.side.model.entity.TechStackList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechStackListRepository extends JpaRepository<TechStackList, Long> {
    Optional<TechStackList> findByName(String name);
}