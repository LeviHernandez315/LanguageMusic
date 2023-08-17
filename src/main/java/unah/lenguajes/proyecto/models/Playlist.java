package unah.lenguajes.proyecto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplaylist")
    private int idPlaylist;

    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idususario")
    @JsonIgnore
    private Usuario usuario;

    @Column(name = "nombreplaylist")
    private String nombrePlaylist;
    
    private String descripcion;
    
    
    @ManyToMany
    @JoinTable(name = "playlistcancion",
        joinColumns = @JoinColumn(name = "idplaylist"),
        inverseJoinColumns = @JoinColumn(name = "idcancion"))
    @JsonIgnore
    private List<Cancion> canciones;

    
    
	public Playlist(int idPlaylist, String nombrePlaylist, String descripcion) {
		super();
		this.idPlaylist = idPlaylist;
		this.nombrePlaylist = nombrePlaylist;
		this.descripcion = descripcion;
	}
	
	public Playlist() {}


	public int getIdPlaylist() {
		return idPlaylist;
	}


	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}


	public String getNombrePlaylist() {
		return nombrePlaylist;
	}


	public void setNombrePlaylist(String nombrePlaylist) {
		this.nombrePlaylist = nombrePlaylist;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    // Constructor, getters y setters
    
    
}
