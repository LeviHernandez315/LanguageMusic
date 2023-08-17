package unah.lenguajes.proyecto.models;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "tipomembresia")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoMembresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipomembresia")
    private int idTipoMembresia;

    private String nombre;
    private String descripcion;
    private float precio;

    @OneToOne(mappedBy = "tipoMembresia")
    private Membresia membresia;
    
    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JsonIgnore
    private List<Cancion> canciones;
    
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
