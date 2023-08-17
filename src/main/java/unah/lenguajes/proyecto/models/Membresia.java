package unah.lenguajes.proyecto.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="membresia")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmembresia")
    private int idMembresia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = true)
    @JsonIgnore
    private Usuario usuario;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "idtipomembresia", referencedColumnName = "idtipomembresia", nullable = true)
    private TipoMembresia tipoMembresia;

    private boolean activa;

    // Constructor, getters y setters

    
    public Membresia(int idMembresia, Usuario usuario, TipoMembresia tipoMembresia, boolean activa) {
    	super();
    	this.idMembresia = idMembresia;
    	this.usuario = usuario;
    	this.tipoMembresia = tipoMembresia;
    	this.activa = activa;
    }
    public Membresia() {}
    
    public int getIdMembresia() {
        return idMembresia;
    }


	public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
