package com.kargosmart.controller;

import com.kargosmart.model.Kargo;
import com.kargosmart.repository.KargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private KargoRepository kargoRepository;

    @GetMapping("/")
    public String anaSayfa() {
        return "anasayfa"; // templates/anasayfa.html
    }

    @PostMapping("/ara")
    public String kargoBul(@RequestParam String takipNo, Model model) {
        // Veritabanında takip numarası ile ara
        Optional<Kargo> kargo = kargoRepository.findByTakipNo(takipNo);
        
        if (kargo.isPresent()) {
            model.addAttribute("sonuc", kargo.get());
            model.addAttribute("basarili", true);
        } else {
            model.addAttribute("basarili", false);
            model.addAttribute("mesaj", "Kargo bulunamadı. Lütfen takip numarasını kontrol edip tekrar deneyin.");
        }
        
        return "anasayfa";
    }

    @GetMapping("/giris")
    public String giris() {
        return "giris"; // templates/giris.html
    }
}