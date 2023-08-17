package unah.lenguajes.proyecto.services;

import java.util.List;
import java.util.Optional;

import unah.lenguajes.proyecto.models.TipoMembresia;

public interface TipoMembService {
	
	public boolean actualizarTipoMembresia(TipoMembresia tpmembresia);
	
	public TipoMembresia obtenertipoMembresia(int id);
	
	public List<TipoMembresia> obtenerTodasMembresias();
}
