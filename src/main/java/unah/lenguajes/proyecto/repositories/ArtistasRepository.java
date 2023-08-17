package unah.lenguajes.proyecto.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Artista;

public interface ArtistasRepository extends CrudRepository<Artista, Integer>{

	List<Artista> findByNombreContainingIgnoreCase(String str);

}
