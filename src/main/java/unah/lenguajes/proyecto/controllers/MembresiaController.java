package unah.lenguajes.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Membresia;
import unah.lenguajes.proyecto.models.Usuario;
import unah.lenguajes.proyecto.services.impl.MembresiasServiceImpl;

@RestController
@RequestMapping("/api/membresias")
public class MembresiaController {
	
	@Autowired
	private MembresiasServiceImpl membServImpl;
	
	@GetMapping("/buscar/{idMembresia}")
	public Membresia buscarMembresiaPorId(@PathVariable(name="idMembresia") int idMembresia) {
		return membServImpl.buscarMembresiaPorId(idMembresia);
	}
	
	@GetMapping("/mostrar/{idCancion}")
	public List<Membresia> mostrarTodasLasMembresias() {
		return membServImpl.mostrarTodasLasMembresias();
	}
	
	@GetMapping("/existe/{idMembresia}")
	public boolean existeMembresiaConId(@PathVariable(name="idMembresia") int idMembresia) {
		return membServImpl.existeMembresiaConId(idMembresia);
	}
	
	@GetMapping("/obtener/usuario/{idMembresia}")
	public Usuario obtenerUsuarioDeMembresia(@PathVariable(name="idMembresia") int idMembresia) {
		return membServImpl.obtenerUsuarioDeMembresia(idMembresia);
	}
}
