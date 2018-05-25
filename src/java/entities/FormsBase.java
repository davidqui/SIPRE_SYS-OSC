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
@Table(name = "FORMS_BASE", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormsBase.findAll", query = "SELECT f FROM FormsBase f")
    , @NamedQuery(name = "FormsBase.findById", query = "SELECT f FROM FormsBase f WHERE f.id = :id")
    , @NamedQuery(name = "FormsBase.findByBase", query = "SELECT f FROM FormsBase f WHERE f.base = :base")
    , @NamedQuery(name = "FormsBase.findByJsondata", query = "SELECT f FROM FormsBase f WHERE f.jsondata = :jsondata")
    , @NamedQuery(name = "FormsBase.findByStatus", query = "SELECT f FROM FormsBase f WHERE f.status = :status")
    , @NamedQuery(name = "FormsBase.findByUsuarioCreador", query = "SELECT f FROM FormsBase f WHERE f.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "FormsBase.findByFechaCreacion", query = "SELECT f FROM FormsBase f WHERE f.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "FormsBase.findByUsuarioModificador", query = "SELECT f FROM FormsBase f WHERE f.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "FormsBase.findByFechaModificacion", query = "SELECT f FROM FormsBase f WHERE f.fechaModificacion = :fechaModificacion")})
public class FormsBase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "BASE")
    private Long base;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "JSONDATA", nullable = false, length = 4000)
    private String jsondata;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS", nullable = false)
    private long status;
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

    public FormsBase() {
    }

    public FormsBase(Long id) {
        this.id = id;
    }

    public FormsBase(Long id, String jsondata, long status) {
        this.id = id;
        this.jsondata = jsondata;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBase() {
        return base;
    }

    public void setBase(Long base) {
        this.base = base;
    }

    public String getJsondata() {
        return jsondata;
    }

    public void setJsondata(String jsondata) {
        this.jsondata = jsondata;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
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
        if (!(object instanceof FormsBase)) {
            return false;
        }
        FormsBase other = (FormsBase) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FormsBase[ id=" + id + " ]";
    }
    
}
