package unah.lenguajes.proyecto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.Tarjeta;
import unah.lenguajes.proyecto.repositories.TarjetasRepositoy;
import unah.lenguajes.proyecto.services.TarjetasService;

@Service
public class TarjetasServiceImpl implements TarjetasService{

	@Autowired
	private TarjetasRepositoy repoTarjeta;
	
	@Override
	public boolean guardarTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		try {
			repoTarjeta.save(tarjeta);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
			// TODO: handle exception
		}
	}

	@Override
	public Tarjeta mostrarTarjetaid(int id) {
		// TODO Auto-generated method stub
		if(repoTarjeta.existsById(id)) {
			return repoTarjeta.findById(id).get();
		}
		return null;
	}

}
