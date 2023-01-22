package br.com.desafiocdc.cdc.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String description;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public Autor(String name, String email, String description) {
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }
}
