package com.example.side.repository;

import com.example.side.model.entity.UserPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserPostRepository extends JpaRepository<UserPost, Long> {
    Page<UserPost> findAll(Pageable pageable);
    Optional<UserPost> findById(Long id);
    Page<UserPost> findByUserId(Long userId, Pageable pageable);
    Page<UserPost> findByCommunityId(Long communityId, Pageable pageable);
}