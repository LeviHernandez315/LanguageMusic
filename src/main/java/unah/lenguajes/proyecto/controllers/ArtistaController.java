package unah.lenguajes.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Album;
import unah.lenguajes.proyecto.models.Artista;
import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.services.impl.ArtistasServiceImpl;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {
	
	@Autowired
	private ArtistasServiceImpl artServImpl;
	
	@PostMapping("/guardar")
	public boolean guardarArtista(@RequestBody Artista artista) {
		return artServImpl.guardarArtista(artista);
	}
	
	@GetMapping("/buscar/{idArtista}")
	public Artista buscarArtistaPorId(@PathVariable(name="idArtista") int idArtista) {
		return artServImpl.buscarArtistaPorId(idArtista);
	}
	
	@PostMapping("/actualizar")
	public boolean actualizarArtista(@RequestBody Artista artista) {
		return artServImpl.actualizarArtista(artista);
	}
	
	@GetMapping("/buscar/nombre/{str}")
	public List<Artista> buscarArtistaPorNombre(@PathVariable(name="str") String str) {
		return artServImpl.buscarArtistaPorNombre(str);
	}
	
	@GetMapping("/mostrar")
	public List<Artista> mostrarArtistas() {
		return artServImpl.mostrarArtistas();
	}
	
	@GetMapping("/artista/existe/{idArtista}")
	public boolean existeArtistaConId(@PathVariable(name="idArtista") int idArtista) {
		return artServImpl.existeArtistaConId(idArtista);
	}
	
	@GetMapping("/mostrar/canciones/{idArtista}")
	public List<Cancion> mostrarCancionesArtista(@PathVariable(name="idArtista") int idArtista) {
		return artServImpl.mostrarCancionesArtista(idArtista);
	}
	
	@GetMapping("/mostrar/albumes")
	public List<Album> MostrarAlbunes(@PathVariable(name="id") int idArtista) {
		return artServImpl.MostrarAlbunes(idArtista);
	}
}
