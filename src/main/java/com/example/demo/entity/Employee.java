package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
    // vars:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String position;

    // constructors:
    public Employee(){
    }

    // "setters & getters":
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

    // email ->
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    // position ->
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
}
