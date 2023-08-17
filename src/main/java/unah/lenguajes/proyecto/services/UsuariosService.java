package unah.lenguajes.proyecto.services;

import unah.lenguajes.proyecto.models.Usuario;

public interface UsuariosService {
	
	public boolean guardarUsuario(Usuario usuario);
	
	public boolean actualizarUsuario(Usuario usuario);
	
	public boolean eliminarUsuario(Usuario usuario);
	
	public boolean buscarUsuarioId(Usuario usuario);
	
	public boolean obtenerTodosUsuarios(Usuario usuario);
		
}
