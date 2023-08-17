package unah.lenguajes.proyecto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;
import unah.lenguajes.proyecto.repositories.HistorialCancionRepository;
import unah.lenguajes.proyecto.services.HistorialCancionService;

public class HistorialCancionServiceImpl  implements HistorialCancionService{

	@Autowired
	private HistorialCancionRepository repoHistorial;
	
	@Override
	public boolean crearHistorial(HistorialCancion hc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cancion> mostrarHistorialPorUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancion> ultimasDiez(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancion> obtenercanciones(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
