package unah.lenguajes.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.PlaylistCancion;


public interface PlaylistRepository extends CrudRepository<PlaylistCancion, Integer>{

}
