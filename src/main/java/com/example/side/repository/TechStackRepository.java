package com.example.side.repository;

import com.example.side.model.entity.TechStack;
import com.example.side.model.entity.TechStackList;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechStackRepository extends JpaRepository<TechStack, Long> {
    Page<TechStack> findAll(Pageable pageable);


    Optional<TechStack> findById(Long id);
    Page<TechStackList> findByTechStackId(Long techStackId, Pageable pageable);

}
