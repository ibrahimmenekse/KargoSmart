package com.kargosmart.repository;

import com.kargosmart.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Veritabanında kargo araması yapmak için kullanılır
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Optional<Shipment> findByTakipNo(String takipNo);
}