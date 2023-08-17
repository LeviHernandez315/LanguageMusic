package unah.lenguajes.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Playlist;


public interface PlaylistCancionRepository extends CrudRepository<Playlist, Integer>{

}
