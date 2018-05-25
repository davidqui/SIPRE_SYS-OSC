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
@Table(name = "LISTITEM", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listitem.findAll", query = "SELECT l FROM Listitem l")
    , @NamedQuery(name = "Listitem.findById", query = "SELECT l FROM Listitem l WHERE l.id = :id")
    , @NamedQuery(name = "Listitem.findByIdListcat", query = "SELECT l FROM Listitem l WHERE l.idListcat = :idListcat")
    , @NamedQuery(name = "Listitem.findByNameitem", query = "SELECT l FROM Listitem l WHERE l.nameitem = :nameitem")
    , @NamedQuery(name = "Listitem.findByValue", query = "SELECT l FROM Listitem l WHERE l.value = :value")
    , @NamedQuery(name = "Listitem.findByUsuarioCreador", query = "SELECT l FROM Listitem l WHERE l.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Listitem.findByFechaCreacion", query = "SELECT l FROM Listitem l WHERE l.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Listitem.findByUsuarioModificador", query = "SELECT l FROM Listitem l WHERE l.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Listitem.findByFechaModificacion", query = "SELECT l FROM Listitem l WHERE l.fechaModificacion = :fechaModificacion")})
public class Listitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ID_LISTCAT")
    private Long idListcat;
    @Size(max = 200)
    @Column(name = "NAMEITEM", length = 200)
    private String nameitem;
    @Column(name = "VALUE")
    private Long value;
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

    public Listitem() {
    }

    public Listitem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdListcat() {
        return idListcat;
    }

    public void setIdListcat(Long idListcat) {
        this.idListcat = idListcat;
    }

    public String getNameitem() {
        return nameitem;
    }

    public void setNameitem(String nameitem) {
        this.nameitem = nameitem;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
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
        if (!(object instanceof Listitem)) {
            return false;
        }
        Listitem other = (Listitem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Listitem[ id=" + id + " ]";
    }
    
}
