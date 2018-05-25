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
@Table(name = "QUIZ", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quiz.findAll", query = "SELECT q FROM Quiz q")
    , @NamedQuery(name = "Quiz.findById", query = "SELECT q FROM Quiz q WHERE q.id = :id")
    , @NamedQuery(name = "Quiz.findByTitle", query = "SELECT q FROM Quiz q WHERE q.title = :title")
    , @NamedQuery(name = "Quiz.findByStatus", query = "SELECT q FROM Quiz q WHERE q.status = :status")
    , @NamedQuery(name = "Quiz.findByUsuarioCreador", query = "SELECT q FROM Quiz q WHERE q.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Quiz.findByFechaCreacion", query = "SELECT q FROM Quiz q WHERE q.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Quiz.findByUsuarioModificador", query = "SELECT q FROM Quiz q WHERE q.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Quiz.findByFechaModificacion", query = "SELECT q FROM Quiz q WHERE q.fechaModificacion = :fechaModificacion")})
public class Quiz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "TITLE", nullable = false, length = 300)
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS", nullable = false)
    private short status;
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

    public Quiz() {
    }

    public Quiz(Long id) {
        this.id = id;
    }

    public Quiz(Long id, String title, short status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
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
        if (!(object instanceof Quiz)) {
            return false;
        }
        Quiz other = (Quiz) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Quiz[ id=" + id + " ]";
    }
    
}
