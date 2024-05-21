package com.example.side.repository;

import com.example.side.model.entity.UserPostFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPostFileRepository extends JpaRepository<UserPostFile, Long> {
    // UserPostId로 UserPostFile 조회
    List<UserPostFile> findByUserPostId(Long userPostId);
}