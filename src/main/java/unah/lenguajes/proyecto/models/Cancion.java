package unah.lenguajes.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="canciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cancion {
	private int idCancion;
	
	private int nombreCancion;
	
	private int duracion;
	
	private int url;
	
	private int reproducciones;
	
	private int idAlbum;
	
	private int idArtista;
	
	
}
