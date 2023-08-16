package unah.lenguajes.proyecto.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class TipoMembresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipomembresia")
    private int idTipoMembresia;

    private String nombre;
    private String descripcion;

    @OneToOne(mappedBy = "tipomembresia")
    @JsonIgnore
    private Membresia membresia;
    
    
    // Constructor, getters y setters

    public TipoMembresia(int idTipoMembresia, String nombre, String descripcion) {
    	
    	this.idTipoMembresia = idTipoMembresia;
    	this.nombre = nombre;
    	this.descripcion = descripcion;
    }
    
    public TipoMembresia() {}
    
    public int getIdTipoMembresia() {
        return idTipoMembresia;
    }


	public void setIdTipoMembresia(int idTipoMembresia) {
        this.idTipoMembresia = idTipoMembresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
