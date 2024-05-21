package com.example.side.repository;

import com.example.side.model.entity.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TechStackRepository extends JpaRepository<TechStack, Long> {
    Optional<TechStack> findByUserId(Long userId);
}
