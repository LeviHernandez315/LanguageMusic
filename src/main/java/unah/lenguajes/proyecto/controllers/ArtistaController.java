package unah.lenguajes.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import unah.lenguajes.proyecto.services.impl.ArtistasServiceImpl;

public class ArtistaController {
	
	@Autowired
	private ArtistasServiceImpl artServImpl;
}
