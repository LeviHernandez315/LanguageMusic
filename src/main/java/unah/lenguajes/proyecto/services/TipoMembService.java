package unah.lenguajes.proyecto.services;

import java.util.Optional;

import unah.lenguajes.proyecto.models.TipoMembresia;

public interface TipoMembService {
	
	public boolean actualizarTipoMembresia(TipoMembresia tpmembresia);
	
	public Optional<TipoMembresia> obtenertipoMembresia(int id);
	
	public TipoMembresia obtenerTodasMembresias();
}
