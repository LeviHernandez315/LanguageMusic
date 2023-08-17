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
import unah.lenguajes.proyecto.models.Playlist;
import unah.lenguajes.proyecto.services.impl.PlaylistServiceImpl;

@RestController
@RequestMapping("/api/playlist")
public class PlaylistController {
	
	@Autowired
	private PlaylistServiceImpl plstServImpl;
	
	@PostMapping("/guardar")
	public boolean guardarPlaylist(@RequestBody Playlist playlist) {
		return plstServImpl.guardarPlaylist(playlist);
	}
	
	@GetMapping("/buscar/{id}")
	public Playlist buscarPlaylistId(@PathVariable(name="id") int id) {
		return plstServImpl.buscarPlaylistId(id);
	}
	
	@GetMapping("/buscar/nombre/{nombre}")
	public List<Playlist> buscarPlaylistnombre(@PathVariable(name="nombre") String nombre) {
		return plstServImpl.buscarPlaylistnombre(nombre);
	}
	
	@GetMapping("/mostrar/{idCancion}")
	public List<Playlist> obtenerTodasPlalist() {
		return plstServImpl.obtenerTodasPlalist();
	}
	
	@GetMapping("/eliminar/{id}")
	public Playlist eliminarPlaylist(@PathVariable(name="id") int id) {
		return plstServImpl.eliminarPlaylist(id);
	}
	
	@GetMapping("/mostrar/canciones/{idPlaylist}")
	public List<Cancion> buscarTodasCaionesPlaylist(@PathVariable(name="idPlaylist") int idPlaylist) {
		return plstServImpl.buscarTodasCaionesPlaylist(idPlaylist);
	}
}
