package unah.lenguajes.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;
import unah.lenguajes.proyecto.services.impl.HistorialCancionServiceImpl;

@RestController
@RequestMapping("/api/historial")
public class HistorialCancionController {
	
	@Autowired
	private HistorialCancionServiceImpl hsCanServImpl;
	
	@GetMapping("/mostrar/{idUsuario}")
	public List<HistorialCancion> mostrarHistorialPorUsuario(@PathVariable(name="idUsuario") int idUsuario) {
		return hsCanServImpl.mostrarHistorialPorUsuario(idUsuario);
	}
	
	@GetMapping("/mostrar/10canciones/{idUsuario}")
	public List<Cancion> ultimasDiez(@PathVariable(name="idUsuario") int idUsuario) {
		return hsCanServImpl.ultimasDiez(idUsuario);
	}
	
	@GetMapping("/obtener/canciones/{idUsuario}")
	public List<Cancion> obtenercanciones(@PathVariable(name="idUsuario") int idUsuario) {
		return hsCanServImpl.obtenercanciones(idUsuario);
	}
}
