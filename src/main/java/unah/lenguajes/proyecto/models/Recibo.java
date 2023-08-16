package unah.lenguajes.proyecto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

@Entity
@Table(name="recibos")
public class Recibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrecibo")
    private int idRecibo;

    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario", nullable = true)
    @JsonIgnore
    private Usuario usuario;

    @Column(name="frchapago")
    private Date fechaPago;

    @ManyToOne
    @JoinColumn(name = "idmembresia", referencedColumnName = "idmembresia", nullable = true)
    private Membresia membresia;

    // Constructor, getters y setters
    
    public Recibo(int idRecibo, Usuario usuario, Date fechaPago, Membresia membresia) {
    	super();
    	this.idRecibo = idRecibo;
    	this.usuario = usuario;
    	this.fechaPago = fechaPago;
    	this.membresia = membresia;
    }
    
    public Recibo() {}
    
    public int getIdRecibo() {
        return idRecibo;
    }


	public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
