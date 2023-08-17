package unah.lenguajes.proyecto.services;

import java.util.List;

import unah.lenguajes.proyecto.models.Album;
import unah.lenguajes.proyecto.models.Cancion;

public interface AlbumesService {

	public boolean guardarAlbum(Album album);
	
	public Album buscarAlbumPorId(int id);
	
	public boolean actualizarAlbum(Album album);
	
	public Album eliminarAlbum(int id);
	
	public List<Album> mostrarAlbumes();
	
	public List<Album> buscarAlbumNombre(String text);
	
	public boolean existeAlbumConId(int id);
	
	public List<Cancion> obtenerCancionesDeAlbumId(int id);
	
	
}
