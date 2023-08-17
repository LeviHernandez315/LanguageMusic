package unah.lenguajes.proyecto.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
@Table(name="canciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcancion")
    private int idCancion;

    @Column(name = "nombrecancion")
    private String nombreCancion;
    private int duracion;
    private String url;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipomembresia", referencedColumnName ="idtipomembresia")
    private TipoMembresia tipoMembresia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idalbum", referencedColumnName = "idalbum")
    @JsonIgnore
    private Album album;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idartista", referencedColumnName = "idartista")
    @JsonIgnore
    private Artista artista;
    
    @ManyToMany(mappedBy = "canciones")
    private List<Playlist> playlists;

    
    @OneToMany(mappedBy = "cancion")
    private List<HistorialCancion> historialCanciones;
    
    private int reproducciones;


    // Constructor, getters y setters
    public Cancion(int idCancion, String nombreCancion, int duracion, String url, Album album, Artista artista,
    		int reproducciones) {
    	super();
    	this.idCancion = idCancion;
    	this.nombreCancion = nombreCancion;
    	this.duracion = duracion;
    	this.url = url;
    	this.album = album;
    	this.artista = artista;
    	this.reproducciones = reproducciones;
    }
    
    public Cancion() {}

	public int getIdCancion() {
		return idCancion;
	}

	public void setIdCancion(int idCancion) {
		this.idCancion = idCancion;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	public TipoMembresia getTipoMembresia() {
		// TODO Auto-generated method stub
		return this.tipoMembresia;
	}
    
    
}
