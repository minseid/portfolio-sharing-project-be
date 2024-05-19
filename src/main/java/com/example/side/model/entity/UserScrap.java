package com.example.side.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.Table(name = "user_scrap")
@lombok.Getter
@lombok.Setter

public class UserScrap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
