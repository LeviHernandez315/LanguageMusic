package unah.lenguajes.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;
import unah.lenguajes.proyecto.services.impl.CancionesServiceImpl;

@RestController
@RequestMapping("/api/canciones")
public class CancionController {
	
	@Autowired
	private CancionesServiceImpl cancservimpl;
	
	@PostMapping("/guardar")
	public boolean guardarCancion(@RequestBody Cancion cancion) {
		return cancservimpl.guardarCancion(cancion);
	}
	
	@GetMapping("/eliminar/{idCancion}")
	public Cancion eliminarCancionPorId(@PathVariable(name="idCancion") int idCancion) {
		return cancservimpl.eliminarCancionPorId(idCancion);
	}
	
	@GetMapping("/buscar/{idCancion}")
	public Cancion buscarCancionPorId(@PathVariable(name="idCancion") int idCancion) {
		return cancservimpl.buscarCancionPorId(idCancion);
	}
	
	@GetMapping("/buscar/nombre/{nombreCancion}")
	public List<Cancion> buscarCancionPorNombre(@PathVariable(name="nombreCancion") String nombreCancion){
		return cancservimpl.buscarCancionPorNombre(nombreCancion);
	}
	
	@GetMapping("/obtenertodo")
	public List<Cancion> obtenerCanciones() {
		return cancservimpl.obtenerCanciones();
	}
	
	@GetMapping("/cancion/existe/{idCancion}")
	public boolean existeCancion(@PathVariable(name="idCancion") int idCancion) {
		return cancservimpl.existeCancion(idCancion);
	}
	
	@GetMapping("/reproducir/cancion/{idUsuario}/{idCancion}")
	public boolean esPosibleReproducir(@PathVariable(name="idUsuario") int idUsuario, @PathVariable(name="idCancion") int idCancion) {
		return cancservimpl.esPosibleReproducir(idUsuario, idCancion);
	}
	
	@GetMapping("/guardar/historial/{idCancion}/{idUsuario}")
	public HistorialCancion guardarEnHistorial(@PathVariable(name="idCancion") int idCancion, @PathVariable(name="idUsuario") int idUsuario) {
		return cancservimpl.guardarEnHistorial(idCancion, idUsuario);
	}
}
