package com.example.side.repository;

import com.example.side.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long>{
    List<Notification> findByUser(User user);
}