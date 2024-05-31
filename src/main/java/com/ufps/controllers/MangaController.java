package com.ufps.controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.entities.Manga;
import com.ufps.services.MangaService;

@RestController
@RequestMapping("/mangas")
public class MangaController {
	
	@Autowired
	MangaService mangaService;

	@GetMapping("/status")
	public Map<String, Object> getStatus() {
        Map<String, Object> status = new HashMap<>();
        status.put("message", "Servidor en funcionamiento");
        status.put("timestamp", LocalDateTime.now());
        return status;
    }
	
	@GetMapping
	public List<Manga> getAllMangas (){
		return mangaService.getAllMangas();
	}
	
	
	
	
}
