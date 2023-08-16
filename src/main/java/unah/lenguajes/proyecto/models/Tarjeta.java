package unah.lenguajes.proyecto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="tarjetas")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtarjeta")
    private int idTarjeta;

    @OneToOne(mappedBy = "tarjeta")
    @JsonIgnore
    private Usuario usuario;

    @Column(name="numtarjeta")
    private String numTarjeta;
    private String cvv;
	
    
    public Tarjeta(int idTarjeta, Usuario usuario, String numTarjeta, String cvv) {
		super();
		this.idTarjeta = idTarjeta;
		this.usuario = usuario;
		this.numTarjeta = numTarjeta;
		this.cvv = cvv;
	}

    public Tarjeta() {}
    
	public int getIdTarjeta() {
		return idTarjeta;
	}


	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getNumTarjeta() {
		return numTarjeta;
	}


	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}


	public String getCvv() {
		return cvv;
	}


	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
    
    

    
}
