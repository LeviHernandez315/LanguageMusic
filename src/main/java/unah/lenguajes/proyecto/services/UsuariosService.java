package unah.lenguajes.proyecto.services;

import java.util.List;

import unah.lenguajes.proyecto.models.Usuario;

public interface UsuariosService {
	
	public boolean guardarUsuario(Usuario usuario);
	
	public boolean validarCredenciales(String email, String password);
	
	public boolean actualizarUsuario(Usuario usuario);
	
	public boolean eliminarUsuario(int id);
	
	public Usuario buscarUsuarioId(int id);
	
	public List<Usuario> obtenerTodosUsuarios();

	boolean eliminarUsuario(Usuario usuario);
		
}
