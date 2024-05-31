package com.ufps.models;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MangaDTO {
	
	private Integer id;
	private LocalDate fechaLanzamiento;
	private Integer temporadas;
	private PaisDTO pais;
	private Integer anime;
	private Integer juego;
	private Integer pelicula;
	private TipoDTO tipo;
	
	
}
