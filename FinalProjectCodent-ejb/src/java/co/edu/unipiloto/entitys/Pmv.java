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
@Table(name = "PMV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pmv.findAll", query = "SELECT p FROM Pmv p"),
    @NamedQuery(name = "Pmv.findByIdPmv", query = "SELECT p FROM Pmv p WHERE p.idPmv = :idPmv"),
    @NamedQuery(name = "Pmv.findByUbicacion", query = "SELECT p FROM Pmv p WHERE p.ubicacion = :ubicacion"),
    @NamedQuery(name = "Pmv.findByMensaje", query = "SELECT p FROM Pmv p WHERE p.mensaje = :mensaje"),
    @NamedQuery(name = "Pmv.findByEstado", query = "SELECT p FROM Pmv p WHERE p.estado = :estado")})
public class Pmv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PMV")
    private Integer idPmv;
    @Size(max = 100)
    @Column(name = "UBICACION")
    private String ubicacion;
    @Size(max = 200)
    @Column(name = "MENSAJE")
    private String mensaje;
    @Column(name = "ESTADO")
    private Boolean estado;

    public Pmv(Integer idPmv, String ubicacion, String mensaje, Boolean estado) {
        this.idPmv = idPmv;
        this.ubicacion = ubicacion;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    
    
    public Pmv() {
    }

    public Pmv(Integer idPmv) {
        this.idPmv = idPmv;
    }

    public Integer getIdPmv() {
        return idPmv;
    }

    public void setIdPmv(Integer idPmv) {
        this.idPmv = idPmv;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPmv != null ? idPmv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pmv)) {
            return false;
        }
        Pmv other = (Pmv) object;
        if ((this.idPmv == null && other.idPmv != null) || (this.idPmv != null && !this.idPmv.equals(other.idPmv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.entitys.Pmv[ idPmv=" + idPmv + " ]";
    }
    
}
