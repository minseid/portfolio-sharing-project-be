package com.example.side.repository;

import com.example.side.model.entity.TechStackList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechStackListRepository extends JpaRepository<TechStackList, Long> {

    Page<TechStackList> findAll(Pageable pageable);


    Optional<TechStackList> findById(Long id);
    TechStackList findByName(String name);
}
