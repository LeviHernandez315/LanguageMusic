package unah.lenguajes.proyecto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.Album;
import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.repositories.AlbumesRepository;
import unah.lenguajes.proyecto.services.AlbumesService;

@Service
public class AlbumesServiceImpl implements AlbumesService {

    @Autowired
    private AlbumesRepository alrepo;

    @Override
    public boolean guardarAlbum(Album album) {
        try {
            alrepo.save(album);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public Album buscarAlbumPorId(int id) {
        return alrepo.findById(id).orElse(null);
    }

    @Override
    public boolean actualizarAlbum(Album album) {
        if (existeAlbumConId(album.getIdAlbum())) {
            alrepo.save(album);
            return true;
        }
        return false;
    }

    @Override
    public Album eliminarAlbum(int id) {
        Album album = buscarAlbumPorId(id);
        if (album != null) {
            alrepo.delete(album);
        }
        return album;
    }

    @Override
    public List<Album> mostrarAlbumes() {
        return (List<Album>) alrepo.findAll();
    }

    @Override
    public List<Album> buscarAlbumNombre(String text) {
        List<Album> albunes = alrepo.findByNombreContaining(text);
        return albunes;
    }

    @Override
    public boolean existeAlbumConId(int id) {
        return alrepo.existsById(id);
    }

    @Override
    public List<Cancion> obtenerCancionesDeAlbumId(int id) {
        Album album = buscarAlbumPorId(id);
        if (album != null) {
            return album.getCanciones();
        }
        return null;
    }
}
