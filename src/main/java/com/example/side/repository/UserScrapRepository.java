package com.example.side.repository;

import com.example.side.model.entity.UserScrap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserScrapRepository extends JpaRepository<UserScrap, Long> {
    Page<UserScrap> findByUserId(Long userId, Pageable pageable);
    Optional<UserScrap> findByUserIdAndUserPostId(Long userId, Long userPostId);
}
