package unah.lenguajes.proyecto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Album;
import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.services.impl.AlbumesServiceImpl;

@RestController
@RequestMapping("/api/albumes")
public class AlbumController {
	
	@Autowired
	private AlbumesServiceImpl albservimpl;
	
	@PostMapping("/guardar")
	public boolean guardarAlbum(@RequestBody Album album) {
		return albservimpl.guardarAlbum(album);
	}
	
	@GetMapping("/buscar/{id}")
	public Album buscarAlbumPorId(@PathVariable(name="id") int id){
		return albservimpl.buscarAlbumPorId(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public Album eliminarUsuarioPorId(@PathVariable(name="id") int id){
		return albservimpl.eliminarAlbum(id);
	}
	
	@GetMapping("/obtenertodo")
	public List<Album> todosLosUsuarios(){
		return albservimpl.mostrarAlbumes();
	}
	
	@PostMapping("/actualizar")
	public boolean actualizarAlbum(@RequestBody Album album) {
		return albservimpl.actualizarAlbum(album);
	}
	
	@GetMapping("/nombrealbum/{text}")
	public List<Album> buscarAlbumPorNombre(@PathVariable(name="text") String text){
		return albservimpl.buscarAlbumNombre(text);
	}
	
	@GetMapping("/existealbum/{id}")
	public boolean existeAblumId(@PathVariable(name="id")int id) {
		return albservimpl.existeAlbumConId(id);
	}
	
	@GetMapping("/cancionesdealbum/{id}")
	public List<Cancion> obtenerCancionesDeAlbum(int id){
		return albservimpl.obtenerCancionesDeAlbumId(id);
	}
	
}
