package com.example.side.repository;

import com.example.side.model.entity.PostLike;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {

    Page<PostLike> findAll(Pageable pageable);


    Optional<PostLike> findById(Long id);

}
