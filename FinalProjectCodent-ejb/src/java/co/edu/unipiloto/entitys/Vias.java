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
@Table(name = "VIAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vias.findAll", query = "SELECT v FROM Vias v"),
    @NamedQuery(name = "Vias.findByIdVia", query = "SELECT v FROM Vias v WHERE v.idVia = :idVia"),
    @NamedQuery(name = "Vias.findByNombre", query = "SELECT v FROM Vias v WHERE v.nombre = :nombre")})
public class Vias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_VIA")
    private Integer idVia;
    @Size(max = 200)
    @Column(name = "NOMBRE")
    private String nombre;

    public Vias() {
    }

    public Vias(Integer idVia) {
        this.idVia = idVia;
    }

    public Integer getIdVia() {
        return idVia;
    }

    public void setIdVia(Integer idVia) {
        this.idVia = idVia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVia != null ? idVia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vias)) {
            return false;
        }
        Vias other = (Vias) object;
        if ((this.idVia == null && other.idVia != null) || (this.idVia != null && !this.idVia.equals(other.idVia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.entitys.Vias[ idVia=" + idVia + " ]";
    }
    
}
