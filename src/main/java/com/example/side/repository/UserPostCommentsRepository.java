package com.example.side.repository;

import com.example.side.model.entity.UserPostComments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPostCommentsRepository extends JpaRepository<UserPostComments, Long> {
    // UserPostComments 테이블에서 postId로 조회하는 메서드
    List<UserPostComments> findByPostId(Long postId);

}