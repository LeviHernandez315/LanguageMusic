package unah.lenguajes.proyecto.services;

import java.util.List;

import unah.lenguajes.proyecto.models.Album;
import unah.lenguajes.proyecto.models.Artista;
import unah.lenguajes.proyecto.models.Cancion;

public interface ArtistasService {

	public boolean guardarArtista(Artista artista);
	
	public Artista buscarArtistaPorId(int idArtista);
	
	public boolean actualizarArtista(Artista artista);
	
	public List<Artista> buscarArtistaPorNombre(String str);
	
	public List<Artista> mostrarArtistas();
	
	public boolean existeArtistaConId(int idArtista);
	
	public List<Cancion> mostrarCancionesArtista(int idArtista);
	
	public List<Album> MostrarAlbunes(int idArtista);
	
	
}
