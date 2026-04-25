package com.kargosmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/gonderiler")
    public String gonderiler() {
        return "gonderiler"; // templates/gonderiler.html
    }

    @GetMapping("/filo")
    public String filo() {
        return "filo"; // templates/filo.html
    }

    @GetMapping("/subeler")
    public String subeler() {
        return "subeler"; // templates/subeler.html
    }

    @GetMapping("/musteriler")
    public String musteriler() {
        return "musteriler"; // templates/musteriler.html
    }
}