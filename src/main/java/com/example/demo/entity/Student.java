package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    // vars:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // constructors:
    public Student() {
    }
    public Student(Long id, String name){
        this.id = id;
        this.name = name;
    }

    // "setter & getter"s:
    // id ->
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    // name ->
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
