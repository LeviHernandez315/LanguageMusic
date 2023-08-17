package unah.lenguajes.proyecto.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="albumes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Album {
	
	@Id
	@Column(name="idalbum")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlbum;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="anio")
	private int anio;
	
	
	@OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Cancion> canciones;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idartista", referencedColumnName="idartista")
	private Artista artista;

	
	public Album(int idAlbum, String nombre, int anio, List<Cancion> canciones) {
		super();
		this.idAlbum = idAlbum;
		this.nombre = nombre;
		this.anio = anio;
		this.canciones = canciones;
		
	}
	
	public Album() {}

	
	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public List<Cancion> getCanciones() {
		// TODO Auto-generated method stub
		return this.canciones;
	}

	
	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	
	
}
