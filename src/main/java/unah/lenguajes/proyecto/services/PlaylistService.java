package unah.lenguajes.proyecto.services;

import java.util.List;
import java.util.Optional;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.Playlist;

public interface PlaylistService {
	
	public boolean guardarPlaylist(Playlist playlist);
	
	public Playlist buscarPlaylistId(int id);
	
	public List<Playlist> buscarPlaylistnombre(String nombre);
	
	public List<Playlist> obtenerTodasPlalist();
	
	public Playlist eliminarPlaylist(int id);
	
	

	List<Cancion> buscarTodasCaionesPlaylist(int idPlaylist);
}
