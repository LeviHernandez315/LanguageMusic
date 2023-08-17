package unah.lenguajes.proyecto.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;
import unah.lenguajes.proyecto.repositories.HistorialCancionRepository;
import unah.lenguajes.proyecto.repositories.UsuariosRepository;
import unah.lenguajes.proyecto.services.HistorialCancionService;

@Service
public class HistorialCancionServiceImpl  implements HistorialCancionService{

	@Autowired
	private HistorialCancionRepository repoHistorial;
	
	@Autowired
	private UsuariosRepository usuarioRepo; 
	
	@Override
	public boolean crearHistorial(HistorialCancion hc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HistorialCancion> mostrarHistorialPorUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		List<HistorialCancion> result = new ArrayList<HistorialCancion>();
		if(usuarioRepo.existsById(idUsuario)){
			List<HistorialCancion> historial = (List<HistorialCancion>) repoHistorial.findAll();
			int index = historial.size();
			
			for(int i = index-1; i>=0; i--) {
				
				if(historial.get(i).getUsuario().getIdUsuario() == idUsuario ) {
					result.add(historial.get(i));
				}
			
			}
			return result;
		}
		return null;
	}

	@Override
	public List<Cancion> ultimasDiez(int idUsuario) {
		// TODO Auto-generated method stub
		List<Cancion> canciones = new ArrayList<Cancion>();
		if(usuarioRepo.existsById(idUsuario)){
			List<HistorialCancion> historial = (List<HistorialCancion>) repoHistorial.findAll();
			int index = historial.size();
			int count = 0;
			
			for(int i = index-1; i>=0; i--) {
				
				if(historial.get(i).getUsuario().getIdUsuario() == idUsuario && count <=10) {
					canciones.add(historial.get(i).getCancion());
				}
				count ++;
			}
			return canciones;
		}
		
		return null;
	}

	@Override
	public List<Cancion> obtenercanciones(int idUsuario) {
		// TODO Auto-generated method stub
		List<Cancion> canciones = new ArrayList<Cancion>();
		if(usuarioRepo.existsById(idUsuario)){
			List<HistorialCancion> historial = (List<HistorialCancion>) repoHistorial.findAll();
			int index = historial.size();
			
			for(int i = index-1; i>=0; i--) {
				if(historial.get(i).getUsuario().getIdUsuario() == idUsuario) {
					canciones.add(historial.get(i).getCancion());
				}
			}
			return canciones;
		}else {
			return null;
		}
	}

}
