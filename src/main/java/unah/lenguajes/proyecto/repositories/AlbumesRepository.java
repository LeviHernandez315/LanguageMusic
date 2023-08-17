package unah.lenguajes.proyecto.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Album;

public interface AlbumesRepository extends CrudRepository<Album, Integer>{
	List<Album> findByNombreContaining(String texto);
}
