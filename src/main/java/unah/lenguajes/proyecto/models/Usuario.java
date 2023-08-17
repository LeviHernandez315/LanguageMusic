package unah.lenguajes.proyecto.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private int idUsuario;

    private String nombre;
    private String apellido;
    private String email;
    private String password;
    
    
    @OneToMany(mappedBy = "usuario")
    private List<Membresia> membresias;
    
    @OneToMany(mappedBy = "usuario")
    private List<Recibo> recibos;
    
    @OneToMany(mappedBy = "usuario")
    private List<Playlist> playlists;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="idtarjeta", referencedColumnName = "idtarjeta")
    public Tarjeta tarjeta;
    
    
    
    // Constructor, getters y setters

    public Usuario(int idUsuario, String nombre, String apellido, String email, String password) {
    	
    	this.idUsuario = idUsuario;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.email = email;
    	this.password = password;
    }
    
    public Usuario() {}
    
    public List<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<Recibo> recibos) {
		this.recibos = recibos;
	}

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void addMemebresia(Membresia membresia) {
    	this.membresias.add(membresia);
    }
    
    public void addRecibo(Recibo recibo) {
    	this.recibos.add(recibo);
    }
    
	public List<Membresia> getMembresias() {
		return membresias;
	}

	public void setMembresias(List<Membresia> membresias) {
		this.membresias = membresias;
	}

	public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addPlaylist(Playlist pl) {
    	this.playlists.add(pl);
    }
}
