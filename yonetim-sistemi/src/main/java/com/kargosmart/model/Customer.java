package com.kargosmart.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Customer extends User {
    
    private String adres; // UML: adres

    @Override
    public void girisYap() {
        System.out.println("Müşteri girişi yapıldı: " + getAd());
    }

    // UML: siparisVer()
    public void siparisVer() {
        System.out.println("Yeni sipariş oluşturuluyor...");
    }
}