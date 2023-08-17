package unah.lenguajes.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.lenguajes.proyecto.models.Usuario;
import unah.lenguajes.proyecto.services.impl.UsuariosServiceImpl;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuariosServiceImpl usServImpl;
	
	@PostMapping("/guardar")
	public boolean guardarUsuario(@RequestBody Usuario usuario) {
		return usServImpl.guardarUsuario(usuario);
	}
	//@RequestBody
	//@GetMapping("/eliminar/{idCancion}")
	//@PathVariable(name="idCancion")
	
	public boolean validarCredenciales(@PathVariable(name="email") String email, @PathVariable(name="password") String password) {
		return usServImpl.validarCredenciales(email, password);
	}
	
	@PostMapping("/guardar")
	public boolean actualizarUsuario(@RequestBody Usuario usuario) {
		return usServImpl.actualizarUsuario(usuario);
	}
	
	@GetMapping("/eliminar/{idCancion}")
	public boolean eliminarUsuario(int id) {
		return usServImpl.eliminarUsuario(id);
	}
	
	@GetMapping("/eliminar/{idCancion}")
	public Usuario buscarUsuarioId(int id) {
		return usServImpl.buscarUsuarioId(id);
	}
	
	@GetMapping("/eliminar/{idCancion}")
	public List<Usuario> obtenerTodosUsuarios() {
		return usServImpl.obtenerTodosUsuarios();
	}
	
	@GetMapping("/eliminar/{idCancion}")
	public boolean eliminarUsuario(Usuario usuario) {
		return usServImpl.eliminarUsuario(usuario);
	}
	
	
}
