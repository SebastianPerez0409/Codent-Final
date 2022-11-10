/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ingse
 */
@Entity
@Table(name = "SENSORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sensores.findAll", query = "SELECT s FROM Sensores s"),
    @NamedQuery(name = "Sensores.findByIdSensor", query = "SELECT s FROM Sensores s WHERE s.idSensor = :idSensor"),
    @NamedQuery(name = "Sensores.findByUbicacion", query = "SELECT s FROM Sensores s WHERE s.ubicacion = :ubicacion"),
    @NamedQuery(name = "Sensores.findByEstado", query = "SELECT s FROM Sensores s WHERE s.estado = :estado")})
public class Sensores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SENSOR")
    private Integer idSensor;
    @Size(max = 100)
    @Column(name = "UBICACION")
    private String ubicacion;
    @Size(max = 200)
    @Column(name = "ESTADO")
    private String estado;

    public Sensores(Integer idSensor, String ubicacion, String estado) {
        this.idSensor = idSensor;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    
    
    public Sensores() {
    }

    public Sensores(Integer idSensor) {
        this.idSensor = idSensor;
    }

    public Integer getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Integer idSensor) {
        this.idSensor = idSensor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSensor != null ? idSensor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sensores)) {
            return false;
        }
        Sensores other = (Sensores) object;
        if ((this.idSensor == null && other.idSensor != null) || (this.idSensor != null && !this.idSensor.equals(other.idSensor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.entitys.Sensores[ idSensor=" + idSensor + " ]";
    }
    
}
