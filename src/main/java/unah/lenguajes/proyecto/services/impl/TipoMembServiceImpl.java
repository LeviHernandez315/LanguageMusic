package unah.lenguajes.proyecto.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.TipoMembresia;
import unah.lenguajes.proyecto.repositories.TipoMembRepository;
import unah.lenguajes.proyecto.services.TipoMembService;

@Service
public class TipoMembServiceImpl implements TipoMembService{

	@Autowired
	private TipoMembRepository repoTM;
	
	@Override
	public boolean actualizarTipoMembresia(TipoMembresia tpmembresia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TipoMembresia obtenertipoMembresia(int id) {
		// TODO Auto-generated method stub
		if(repoTM.existsById(id)) {
			return repoTM.findById(id).get();
		}
		
		return null;
	}

	@Override
	public List<TipoMembresia> obtenerTodasMembresias() {
		// TODO Auto-generated method stub
		return (List<TipoMembresia>) repoTM.findAll();
	}

}
