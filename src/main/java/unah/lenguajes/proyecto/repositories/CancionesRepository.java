package unah.lenguajes.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Cancion;

public interface CancionesRepository extends CrudRepository<Cancion, Integer>{

}
