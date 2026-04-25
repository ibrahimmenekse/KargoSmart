package com.kargosmart.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Kalıtım yapısı için [cite: 56]
@Table(name = "users")
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // UML: id [cite: 34]
    
    private String ad; // UML: ad [cite: 35]
    private String telefon; // UML: telefon [cite: 36]
    
    public abstract void girisYap(); // UML: girisYap() soyut metodu [cite: 37, 56]
}