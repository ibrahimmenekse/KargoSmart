package com.kargosmart.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // Getter ve Setter'ları otomatik yapar
@Entity // Veritabanı tablosu olduğunu belirtir
public class Shipment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Sistemsel ID [cite: 34]

    @Column(unique = true)
    private String takipNo; // UML: Benzersiz takip numarası [cite: 21, 44]

    private double agirlik; // UML: Kargo ağırlığı [cite: 47]
    private String gonderiTipi; // UML: Hızlı veya Standart [cite: 49]
    private String durum; // UML: Yolda, Teslim Edildi vb. [cite: 24, 50]

    // UML: ucretHesapla() metodu [cite: 51]
    public double ucretHesapla() {
        double birimFiyat = gonderiTipi.equalsIgnoreCase("Hızlı") ? 50.0 : 30.0;
        return agirlik * birimFiyat;
    }
}