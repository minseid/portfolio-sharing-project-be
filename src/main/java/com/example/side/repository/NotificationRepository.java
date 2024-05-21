package com.example.side.repository;

import com.example.side.model.entity.Notification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Page<Notification> findAll(Pageable pageable);


    Optional<Notification> findById(Long id);
    Notification findbytitle (String title);
    Notification findbydescription (String description);

}
