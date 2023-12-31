package unah.lenguajes.proyecto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.models.HistorialCancion;
import unah.lenguajes.proyecto.models.Membresia;
import unah.lenguajes.proyecto.models.TipoMembresia;
import unah.lenguajes.proyecto.models.Usuario;
import unah.lenguajes.proyecto.repositories.CancionesRepository;
import unah.lenguajes.proyecto.repositories.HistorialCancionRepository;
import unah.lenguajes.proyecto.repositories.UsuariosRepository;
import unah.lenguajes.proyecto.services.CancionesService;

@Service
public class CancionesServiceImpl implements CancionesService {

    @Autowired
    private CancionesRepository repoCancion;
    
    @Autowired
    private UsuariosRepository repoUsuario;
    
    @Autowired
    private HistorialCancionRepository hcr;

    @Override
    public boolean guardarCancion(Cancion cancion) {
        try {
            repoCancion.save(cancion);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public Cancion eliminarCancionPorId(int idCancion) {
        // Implementa la lógica para eliminar la canción por su ID y retorna la canción eliminada
        // Si no se encuentra la canción, podrías retornar null
    	if (repoCancion.existsById(idCancion)) {
    		Cancion cancion = repoCancion.findById(idCancion).get();
    		repoCancion.deleteById(idCancion);
    		return cancion;
    	}
    	
    	
        return null;
    }

    @Override
    public Cancion buscarCancionPorId(int idCancion) {
        return repoCancion.findById(idCancion).orElse(null);
    }

    @Override
    public List<Cancion> buscarCancionPorNombre(String nombreCancion) {
        return repoCancion.findByNombreCancionContainingIgnoreCase(nombreCancion);
    }

    @Override
    public List<Cancion> obtenerCanciones() {
        return (List<Cancion>) repoCancion.findAll();
    }

    @Override
    public boolean existeCancion(int idCancion) {
        return repoCancion.existsById(idCancion);
    }

    @Override
    public boolean esPosibleReproducir(int idUsuario, int idCancion) {
        // Implementa la lógica para verificar si es posible reproducir la canción
        // Puedes verificar si el usuario tiene una membresía válida, si la canción es gratuita, etc.
    	if(repoUsuario.existsById(idUsuario) && repoCancion.existsById(idCancion)) {
    		Usuario user = repoUsuario.findById(idUsuario).get();
    		Cancion cancion = repoCancion.findById(idCancion).get();
    		
    		List<Membresia> membresias = user.getMembresias();
    		int i = membresias.size()-1;
    		
    		TipoMembresia userTipoMembresia = membresias.get(i).getTipoMembresia();
    		TipoMembresia cancionTipoMembresia = cancion.getTipoMembresia();
    		
    		if(userTipoMembresia.getPrecio()>=cancionTipoMembresia.getPrecio()) {
    			return true;
    		}
    		
    		return false;
    		
    	}
    	
        return false;
    }

    @Override
    public HistorialCancion guardarEnHistorial(int idCancion, int idUsuario) {
        // Implementa la lógica para guardar la canción en el historial del usuario
        // Puedes crear una instancia de HistorialCancion y guardarla en la base de datos
    	HistorialCancion hc = null;
    	
    	if(repoUsuario.existsById(idUsuario) && repoCancion.existsById(idCancion)) {
    		hc = new HistorialCancion(repoUsuario.findById(idUsuario).get(), repoCancion.findById(idCancion).get());
    		hcr.save(hc);
    		
    	}
    	
    	
        return hc;
    }
}
