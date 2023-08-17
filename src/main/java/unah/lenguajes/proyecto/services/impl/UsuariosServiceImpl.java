package unah.lenguajes.proyecto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import unah.lenguajes.proyecto.models.Usuario;
import unah.lenguajes.proyecto.repositories.UsuariosRepository;
import unah.lenguajes.proyecto.services.UsuariosService;

public class UsuariosServiceImpl implements UsuariosService{
	
	@Autowired
	private UsuariosRepository usrepository;

	@Override
	public boolean guardarUsuario(Usuario usuario) {
		usrepository.save(usuario);
		return false;
	}

	@Override
	public boolean validarCredenciales(String email, String password) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//if(usrepository.findAll() == ) {
			
		//}
=======
		
>>>>>>> b6ccaa28878accf9dfa272d3af3da40473914b5b
		return false;
	}

	@Override
	public boolean actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usrepository.save(usuario);
		return false;
	}


	@Override
	public boolean eliminarUsuario(int id) {
		// TODO Auto-generated method stub
		usrepository.deleteById(id);
		return false;
	}

	@Override
	public Usuario buscarUsuarioId(int id) {
		// TODO Auto-generated method stub
		usrepository.findById(id);
		return null;
	}

	@Override
	public List<Usuario> obtenerTodosUsuarios() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usrepository.findAll();
	}

	public boolean eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
