package unah.lenguajes.proyecto.services;

import java.util.List;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;

public interface CancionesService {

	public boolean guardarCancion(Cancion cancion);
	
	public Cancion eliminarCancionPorId(int idCancion);
	
	public Cancion buscarCancionPorId(int idCancion);
	
	public List<Cancion> buscarCancionPorNombre(String nombreCancion);
	
	public List<Cancion> obtenerCanciones();
	
	public boolean existeCancion(int idCancion);
	
	public boolean esPosibleReproducir(int idIUsuario, int idCancion);
	

	public HistorialCancion guardarEnHistorial(int idCancion, int idUsuario);
}
