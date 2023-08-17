package unah.lenguajes.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Album;

public interface AlbumesRepository extends CrudRepository<Album, Integer>{

}
