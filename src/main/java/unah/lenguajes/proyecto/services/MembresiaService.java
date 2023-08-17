package unah.lenguajes.proyecto.services;

import java.util.List;

import unah.lenguajes.proyecto.models.Membresia;
import unah.lenguajes.proyecto.models.Usuario;

public interface MembresiaService {

    Membresia buscarMembresiaPorId(int idMembresia);
    
    List<Membresia> mostrarTodasLasMembresias();
    
    boolean existeMembresiaConId(int idMembresia);
    
    Usuario obtenerUsuarioDeMembresia(int idMembresia);
    
    
}
