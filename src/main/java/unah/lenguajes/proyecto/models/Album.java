package unah.lenguajes.proyecto.models;

import java.util.List;

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
	
	private String nombre;
	
	private int año;
	
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name="idartista", referencedColumnName="idartista", nullable =true)
	private Artista artista;
	
	@OneToMany(mappedBy = "album")
	private List<Cancion> canciones;
	

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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	
	
}