package com.ufps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entities.Manga;
import com.ufps.repositories.MangaRepository;

@Service
public class MangaService {
	
	@Autowired
    private MangaRepository mangaRepository;
	
	public List<Manga> getAllMangas(){
		return mangaRepository.findAll();
	}

    

}
