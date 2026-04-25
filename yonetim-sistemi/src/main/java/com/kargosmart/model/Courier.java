package com.kargosmart.model;

import com.kargosmart.service.ITrackable;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Courier extends User implements ITrackable {
    
    private String aracPlaka; // UML: aracPlaka

    @Override
    public void girisYap() {
        System.out.println("Kurye girişi yapıldı: " + getAd());
    }

    @Override
    public String konumGetir() {
        // UML: konumGetir() - Canlı takip için
        return "Kurye şu an yolda, teslimat bölgesine yakın.";
    }

    // UML: durumGuncelle()
    public void durumGuncelle() {
        System.out.println("Kargo durumu güncellendi.");
    }
}