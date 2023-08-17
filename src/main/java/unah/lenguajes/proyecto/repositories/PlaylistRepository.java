package unah.lenguajes.proyecto.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Playlist;



public interface PlaylistRepository extends CrudRepository<Playlist, Integer>{
    List<Playlist> findByNombrePlaylistContainingIgnoreCase(String nombre);

}
