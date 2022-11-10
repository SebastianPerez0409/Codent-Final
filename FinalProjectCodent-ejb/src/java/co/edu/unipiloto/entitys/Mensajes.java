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
@Table(name = "MENSAJES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mensajes.findAll", query = "SELECT m FROM Mensajes m"),
    @NamedQuery(name = "Mensajes.findByIdMensajes", query = "SELECT m FROM Mensajes m WHERE m.idMensajes = :idMensajes"),
    @NamedQuery(name = "Mensajes.findByDescripcion", query = "SELECT m FROM Mensajes m WHERE m.descripcion = :descripcion")})
public class Mensajes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MENSAJES")
    private Integer idMensajes;
    @Size(max = 200)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Mensajes(Integer idMensajes, String descripcion) {
        this.idMensajes = idMensajes;
        this.descripcion = descripcion;
    }

    
    public Mensajes() {
    }

    public Mensajes(Integer idMensajes) {
        this.idMensajes = idMensajes;
    }

    public Integer getIdMensajes() {
        return idMensajes;
    }

    public void setIdMensajes(Integer idMensajes) {
        this.idMensajes = idMensajes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMensajes != null ? idMensajes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mensajes)) {
            return false;
        }
        Mensajes other = (Mensajes) object;
        if ((this.idMensajes == null && other.idMensajes != null) || (this.idMensajes != null && !this.idMensajes.equals(other.idMensajes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.entitys.Mensajes[ idMensajes=" + idMensajes + " ]";
    }
    
}
