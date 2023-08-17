package unah.lenguajes.proyecto.services;

import unah.lenguajes.proyecto.models.Tarjeta;

public interface TarjetasService {
	
	public boolean guardarTarjeta(Tarjeta tarjeta);
	
	public Tarjeta mostrarTarjetaid(int id);
}
