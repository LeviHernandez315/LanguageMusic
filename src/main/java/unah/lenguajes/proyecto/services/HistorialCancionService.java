package unah.lenguajes.proyecto.services;

import java.util.List;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;

public interface HistorialCancionService {

	public boolean crearHistorial(HistorialCancion hc);
	
	public List<Cancion> mostrarHistorialPorUsuario(int idUsuario);
	
	public List<Cancion> ultimasDiez(int idUsuario);
	
	public List<Cancion> obtenercanciones(int idUsuario);
	
}
