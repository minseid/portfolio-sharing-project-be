package com.example.side.repository;

import com.example.side.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long>{
    List<Notification> findByUser(User user);
}