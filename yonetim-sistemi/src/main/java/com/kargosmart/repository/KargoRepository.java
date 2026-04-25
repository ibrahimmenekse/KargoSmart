package com.kargosmart.repository;

import com.kargosmart.model.Kargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface KargoRepository extends JpaRepository<Kargo, Long> {
    Optional<Kargo> findByTakipNo(String takipNo);
}
