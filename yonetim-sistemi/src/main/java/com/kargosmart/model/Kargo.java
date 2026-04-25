package com.kargosmart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "kargolar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kargo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String takipNo;
    
    @Column(nullable = false)
    private String musteriAdi;
    
    @Column(nullable = false)
    private String durum; // Yolda, Teslim Edildi, Şubede
    
    @Column(nullable = false)
    private String mevcutKonum;
    
    @Column(nullable = false)
    private LocalDateTime tarih;
    
    // Ek alanlar
    @Column
    private Double agirlik;
    
    @Column
    private String gonderiTipi; // Parça, Palet vb.
}
