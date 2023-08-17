package unah.lenguajes.proyecto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "historialcancion")
public class HistorialCancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhistorial")
    private int idHistorial;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "idcancion")
    private Cancion cancion;

    public HistorialCancion() {}
    
    
    
	public HistorialCancion(int idHistorial, Usuario usuario, Cancion cancion) {
		super();
		this.idHistorial = idHistorial;
		this.usuario = usuario;
		this.cancion = cancion;
	}



	public int getIdHistorial() {
		return idHistorial;
	}

	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

    // Constructor, getters y setters
    
    
}
