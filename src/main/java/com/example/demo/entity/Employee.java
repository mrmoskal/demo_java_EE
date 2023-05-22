package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {
    // vars:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name", nullable = false, length = 100)
    private String name;

    @Column(name = "student_email", nullable = false, length = 100)
    private String email;

    @Column(name = "student_position", nullable = false, length = 100)
    private String position;

}
