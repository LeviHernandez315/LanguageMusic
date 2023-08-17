package unah.lenguajes.proyecto.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.Playlist;
import unah.lenguajes.proyecto.repositories.PlaylistRepository;
import unah.lenguajes.proyecto.services.PlaylistService;

public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	private PlaylistRepository repoPlaylist;
	
	@Override
	public boolean guardarPlaylist(Playlist playlist) {
		// TODO Auto-generated method stub
		try {
			
			repoPlaylist.save(playlist);
			return true;
			
		} catch (IllegalArgumentException e) {
			return false;
			// TODO: handle exception
		}
	}

	@Override
	public Playlist buscarPlaylistId(int id) {
		// TODO Auto-generated method stub
		if(repoPlaylist.existsById(id)) {
			return repoPlaylist.findById(id).get();
		}
		return null;
	}

	@Override
	public List<Playlist> buscarPlaylistnombre(String nombre) {
		// TODO Auto-generated method stub
        return repoPlaylist.findByNombrePlaylistContainingIgnoreCase(nombre);

	}

	@Override
	public List<Playlist> obtenerTodasPlalist() {
		// TODO Auto-generated method stub
		return (List<Playlist>) repoPlaylist.findAll();
	}

	@Override
	public Playlist eliminarPlaylist(int id) {
		// TODO Auto-generated method stub
		if(repoPlaylist.existsById(id)) {
			Playlist playlist = repoPlaylist.findById(id).get();
			repoPlaylist.deleteById(id);
			return playlist;
		}
		return null;
	}

	@Override
	public List<Cancion> buscarTodasCaionesPlaylist(int idPlaylist) {
		// TODO Auto-generated method stub
		return repoPlaylist.findById(idPlaylist).get().getCanciones();
	}

}
