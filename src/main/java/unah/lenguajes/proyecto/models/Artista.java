package unah.lenguajes.proyecto.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="artistas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Artista {
	
	@Id
	@Column(name="idartista")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idArtista;
	
	@Column(name="nombreartista")
	private String nombreArtista;
	
	@OneToMany(mappedBy="artista")
	private List<Album> album;
	
	@OneToMany(mappedBy = "artista")
	private List<Cancion> cancion;
	

	public int getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public List<Album> getAlbum() {
		return album;
	}

	public void setAlbum(List<Album> album) {
		this.album = album;
	}
	
}
