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
@Table(name = "EVENTONOPLANEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventonoplaneado.findAll", query = "SELECT e FROM Eventonoplaneado e"),
    @NamedQuery(name = "Eventonoplaneado.findByIdEvento", query = "SELECT e FROM Eventonoplaneado e WHERE e.idEvento = :idEvento"),
    @NamedQuery(name = "Eventonoplaneado.findByDescripcion", query = "SELECT e FROM Eventonoplaneado e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Eventonoplaneado.findByVia", query = "SELECT e FROM Eventonoplaneado e WHERE e.via = :via"),
    @NamedQuery(name = "Eventonoplaneado.findBySensor", query = "SELECT e FROM Eventonoplaneado e WHERE e.sensor = :sensor")})
public class Eventonoplaneado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EVENTO")
    private Integer idEvento;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 200)
    @Column(name = "VIA")
    private String via;
    @Size(max = 200)
    @Column(name = "SENSOR")
    private String sensor;
    @Size(max = 20)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 20)
    @Column(name = "FECHA")
    private String fecha;

    public Eventonoplaneado(Integer idEvento, String descripcion, String via, String sensor, String estado, String fecha) {
        this.idEvento = idEvento;
        this.descripcion = descripcion;
        this.via = via;
        this.sensor = sensor;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Eventonoplaneado() {
    }

    public Eventonoplaneado(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventonoplaneado)) {
            return false;
        }
        Eventonoplaneado other = (Eventonoplaneado) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.entitys.Eventonoplaneado[ idEvento=" + idEvento + " ]";
    }

}
