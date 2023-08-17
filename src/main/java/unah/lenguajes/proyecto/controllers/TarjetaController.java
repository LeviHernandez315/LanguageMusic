package unah.lenguajes.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Tarjeta;
import unah.lenguajes.proyecto.services.impl.TarjetasServiceImpl;

@RestController
@RequestMapping("/api/tajeta")
public class TarjetaController {
	
	@Autowired
	private TarjetasServiceImpl tajServImpl;
	
	@PostMapping("/guardar")
	public boolean guardarTarjeta(@RequestBody Tarjeta tarjeta) {
		return tajServImpl.guardarTarjeta(tarjeta);
	}
	
	@GetMapping("/mostrar/{id}")
	public Tarjeta mostrarTarjetaid(@PathVariable(name="id") int id) {
		return tajServImpl.mostrarTarjetaid(id);
	}
	
}
