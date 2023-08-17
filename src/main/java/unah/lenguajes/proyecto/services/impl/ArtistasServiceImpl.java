package unah.lenguajes.proyecto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.lenguajes.proyecto.models.Album;
import unah.lenguajes.proyecto.models.Artista;
import unah.lenguajes.proyecto.models.Cancion;
import unah.lenguajes.proyecto.repositories.ArtistasRepository;
import unah.lenguajes.proyecto.services.ArtistasService;

@Service
public class ArtistasServiceImpl implements ArtistasService {

    @Autowired
    private ArtistasRepository artistaRepo;

    @Override
    public boolean guardarArtista(Artista artista) {
        try {
            artistaRepo.save(artista);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public Artista buscarArtistaPorId(int idArtista) {
        return artistaRepo.findById(idArtista).orElse(null);
    }

    @Override
    public boolean actualizarArtista(Artista artista) {
        try {
            artistaRepo.save(artista);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public List<Artista> buscarArtistaPorNombre(String str) {
        return artistaRepo.findByNombreContainingIgnoreCase(str);
    }

    @Override
    public List<Artista> mostrarArtistas() {
        return (List<Artista>) artistaRepo.findAll();
    }

    @Override
    public boolean existeArtistaConId(int idArtista) {
        return artistaRepo.existsById(idArtista);
    }

    @Override
    public List<Cancion> mostrarCancionesArtista(int idArtista) {
        Artista artista = artistaRepo.findById(idArtista).orElse(null);
        if (artista != null) {
            return artista.getCanciones();
        }
        return null;
    }

    @Override
    public List<Album> MostrarAlbunes(int idArtista) {
        Artista artista = artistaRepo.findById(idArtista).orElse(null);
        if (artista != null) {
            return artista.getAlbum();
        }
        return null;
    }
}
