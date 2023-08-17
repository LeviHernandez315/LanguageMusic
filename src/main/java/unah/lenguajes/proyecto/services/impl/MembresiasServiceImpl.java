package unah.lenguajes.proyecto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.Membresia;
import unah.lenguajes.proyecto.models.Usuario;
import unah.lenguajes.proyecto.repositories.MembresiaRepository;
import unah.lenguajes.proyecto.services.MembresiaService;

@Service
public class MembresiasServiceImpl implements MembresiaService{

	@Autowired
	private MembresiaRepository repoMembresia;
	
	@Override
	public Membresia buscarMembresiaPorId(int idMembresia) {
		// TODO Auto-generated method stub
		if(repoMembresia.existsById(idMembresia)) {
			return repoMembresia.findById(idMembresia).get();
			
		}
		return null;
	}

	@Override
	public List<Membresia> mostrarTodasLasMembresias() {
		// TODO Auto-generated method stub
		return (List<Membresia>) repoMembresia.findAll();
	}

	@Override
	public boolean existeMembresiaConId(int idMembresia) {
		// TODO Auto-generated method stub
		if(repoMembresia.existsById(idMembresia)) {
			return true;
		}
		return false;
	}

	@Override
	public Usuario obtenerUsuarioDeMembresia(int idMembresia) {
		// TODO Auto-generated method stub
		if(existeMembresiaConId(idMembresia)) {
			return repoMembresia.findById(idMembresia).get().getUsuario();
		}
		
		return null;
	}

}
