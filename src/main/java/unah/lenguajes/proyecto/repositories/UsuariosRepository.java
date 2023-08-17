package unah.lenguajes.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;

import unah.lenguajes.proyecto.models.Usuario;


public interface UsuariosRepository extends CrudRepository<Usuario, Integer>{
	Usuario findByEmail(String email);
}
