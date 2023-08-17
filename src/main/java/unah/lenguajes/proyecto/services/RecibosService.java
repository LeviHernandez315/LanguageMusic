package unah.lenguajes.proyecto.services;

import unah.lenguajes.proyecto.models.Recibo;

public interface RecibosService {
	
	public boolean guardarRecibo(Recibo recibo);
	
	public Recibo obtnerreciboId(int id);
}
