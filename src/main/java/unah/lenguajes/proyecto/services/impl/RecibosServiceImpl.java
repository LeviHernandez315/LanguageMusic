package unah.lenguajes.proyecto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import unah.lenguajes.proyecto.models.Recibo;
import unah.lenguajes.proyecto.repositories.RecibosRepository;
import unah.lenguajes.proyecto.services.RecibosService;

public class RecibosServiceImpl implements RecibosService{

	@Autowired
	private RecibosRepository repoRecibo;
	
	@Override
	public boolean guardarRecibo(Recibo recibo) {
		// TODO Auto-generated method stub
		try {
			repoRecibo.save(recibo);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
			// TODO: handle exception
		}
		
	}

	@Override
	public Recibo obtnerreciboId(int id) {
		// TODO Auto-generated method stub
		
		if(repoRecibo.existsById(id)) {
			return repoRecibo.findById(id).get();
		}
		return null;
	}

}
