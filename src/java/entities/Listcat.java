/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dquijanor
 */
@Entity
@Table(name = "LISTCAT", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listcat.findAll", query = "SELECT l FROM Listcat l")
    , @NamedQuery(name = "Listcat.findById", query = "SELECT l FROM Listcat l WHERE l.id = :id")
    , @NamedQuery(name = "Listcat.findByNamecat", query = "SELECT l FROM Listcat l WHERE l.namecat = :namecat")
    , @NamedQuery(name = "Listcat.findByIdentifier", query = "SELECT l FROM Listcat l WHERE l.identifier = :identifier")
    , @NamedQuery(name = "Listcat.findByStatus", query = "SELECT l FROM Listcat l WHERE l.status = :status")
    , @NamedQuery(name = "Listcat.findByUsuarioCreador", query = "SELECT l FROM Listcat l WHERE l.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Listcat.findByFechaCreacion", query = "SELECT l FROM Listcat l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Listcat.findByUsuarioModificador", query = "SELECT l FROM Listcat l WHERE l.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Listcat.findByFechaModificacion", query = "SELECT l FROM Listcat l WHERE l.fechaModificacion = :fechaModificacion")})
public class Listcat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false)
    private Long id;
    @Size(max = 100)
    @Column(name = "NAMECAT", length = 100)
    private String namecat;
    @Size(max = 200)
    @Column(name = "IDENTIFIER", length = 200)
    private String identifier;
    @Column(name = "STATUS")
    private Short status;
    @Size(max = 4000)
    @Column(name = "USUARIO_CREADOR", length = 4000)
    private String usuarioCreador;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Size(max = 4000)
    @Column(name = "USUARIO_MODIFICADOR", length = 4000)
    private String usuarioModificador;
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

    public Listcat() {
    }

    public Listcat(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamecat() {
        return namecat;
    }

    public void setNamecat(String namecat) {
        this.namecat = namecat;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioModificador() {
        return usuarioModificador;
    }

    public void setUsuarioModificador(String usuarioModificador) {
        this.usuarioModificador = usuarioModificador;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listcat)) {
            return false;
        }
        Listcat other = (Listcat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Listcat[ id=" + id + " ]";
    }
    
}
