package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // This annotation marks the class as a JPA entity
@Table(name = "app_user") 
public class User {
    
    @Id // This annotation specifies the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation specifies the generation strategy for the primary key
    private Long id; // Add an id field as the primary key

    private String username;
    private String password;
    private String role;
}