package com.example.side.repository;

import com.example.side.model.entity.UserPostComments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostCommentsRepository extends JpaRepository<UserPostComments, Long> {
}
