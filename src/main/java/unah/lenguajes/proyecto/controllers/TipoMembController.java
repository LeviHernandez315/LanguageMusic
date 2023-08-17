package unah.lenguajes.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.TipoMembresia;
import unah.lenguajes.proyecto.services.impl.TipoMembServiceImpl;

@RestController
@RequestMapping("/api/tipomeb")
public class TipoMembController {
	
	@Autowired
	private TipoMembServiceImpl tipoimp;
	
	//@PostMapping("/guardar")
	//@RequestBody
	
	//@GetMapping("/eliminar/{idCancion}")
	//@PathVariable(name="idCancion")
	
	public boolean actualizarTipoMembresia(TipoMembresia tpmembresia) {
		return false;
	}
	
	@GetMapping("/obtener/{id}")
	public TipoMembresia obtenertipoMembresia(@PathVariable(name="id") int id) {
		return tipoimp.obtenertipoMembresia(id);
	}
	
	@GetMapping("/obtener")
	public List<TipoMembresia> obtener(){
		return tipoimp.obtenerTodasMembresias();
	}
}
