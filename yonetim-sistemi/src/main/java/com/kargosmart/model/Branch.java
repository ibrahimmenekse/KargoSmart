package com.kargosmart.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int subeKodu; // UML: subeKodu
    private String sehir; // UML: sehir

    // UML: Bir şubede birden fazla kargo bulunabilir (One-to-Many)
    @OneToMany
    private List<Shipment> kargolar;
}