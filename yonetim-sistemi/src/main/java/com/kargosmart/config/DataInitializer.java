package com.kargosmart.config;

import com.kargosmart.model.Kargo;
import com.kargosmart.repository.KargoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDateTime;

@Configuration
public class DataInitializer {
    
    @Bean
    public CommandLineRunner initializeData(KargoRepository kargoRepository) {
        return args -> {
            // Verilerin daha önceden yüklü olmadığını kontrol et
            if (kargoRepository.count() == 0) {
                
                // 1. TR-98245-A: Ali Yılmaz - Yolda - Ankara
                Kargo kargo1 = new Kargo();
                kargo1.setTakipNo("TR-98245-A");
                kargo1.setMusteriAdi("Ali Yılmaz");
                kargo1.setDurum("Yolda");
                kargo1.setMevcutKonum("Ankara");
                kargo1.setTarih(LocalDateTime.now().minusHours(5));
                kargo1.setAgirlik(2.5);
                kargo1.setGonderiTipi("Parça");
                kargoRepository.save(kargo1);
                
                // 2. TR-98246-B: Veli Demir - Teslim Edildi - İstanbul
                Kargo kargo2 = new Kargo();
                kargo2.setTakipNo("TR-98246-B");
                kargo2.setMusteriAdi("Veli Demir");
                kargo2.setDurum("Teslim Edildi");
                kargo2.setMevcutKonum("İstanbul");
                kargo2.setTarih(LocalDateTime.now().minusHours(2));
                kargo2.setAgirlik(1.8);
                kargo2.setGonderiTipi("Parça");
                kargoRepository.save(kargo2);
                
                // 3. TR-98247-C: Ayşe Kaya - Şubede - İzmir
                Kargo kargo3 = new Kargo();
                kargo3.setTakipNo("TR-98247-C");
                kargo3.setMusteriAdi("Ayşe Kaya");
                kargo3.setDurum("Şubede");
                kargo3.setMevcutKonum("İzmir");
                kargo3.setTarih(LocalDateTime.now().minusDays(1));
                kargo3.setAgirlik(3.2);
                kargo3.setGonderiTipi("Palet");
                kargoRepository.save(kargo3);
                
                System.out.println("✓ 3 adet kargo örneği veritabanına başarıyla yüklendi!");
            }
        };
    }
}
