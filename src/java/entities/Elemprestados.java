/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "ELEMPRESTADOS", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elemprestados.findAll", query = "SELECT e FROM Elemprestados e")
    , @NamedQuery(name = "Elemprestados.findByUserid", query = "SELECT e FROM Elemprestados e WHERE e.userid = :userid")
    , @NamedQuery(name = "Elemprestados.findByElem", query = "SELECT e FROM Elemprestados e WHERE e.elem = :elem")
    , @NamedQuery(name = "Elemprestados.findByDatein", query = "SELECT e FROM Elemprestados e WHERE e.datein = :datein")
    , @NamedQuery(name = "Elemprestados.findByObs", query = "SELECT e FROM Elemprestados e WHERE e.obs = :obs")
    , @NamedQuery(name = "Elemprestados.findByUsuarioCreador", query = "SELECT e FROM Elemprestados e WHERE e.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Elemprestados.findByFechaCreacion", query = "SELECT e FROM Elemprestados e WHERE e.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Elemprestados.findByUsuarioModificador", query = "SELECT e FROM Elemprestados e WHERE e.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Elemprestados.findByFechaModificacion", query = "SELECT e FROM Elemprestados e WHERE e.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "Elemprestados.findByGrupoInformacion", query = "SELECT e FROM Elemprestados e WHERE e.grupoInformacion = :grupoInformacion")
    , @NamedQuery(name = "Elemprestados.findById", query = "SELECT e FROM Elemprestados e WHERE e.id = :id")})
public class Elemprestados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERID", nullable = false)
    private BigInteger userid;
    @Column(name = "ELEM")
    private BigInteger elem;
    @Column(name = "DATEIN")
    @Temporal(TemporalType.DATE)
    private Date datein;
    @Size(max = 4000)
    @Column(name = "OBS", length = 4000)
    private String obs;
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
    @Column(name = "GRUPO_INFORMACION")
    private BigInteger grupoInformacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false, precision = 22)
    private BigDecimal id;

    public Elemprestados() {
    }

    public Elemprestados(BigDecimal id) {
        this.id = id;
    }

    public Elemprestados(BigDecimal id, BigInteger userid) {
        this.id = id;
        this.userid = userid;
    }

    public BigInteger getUserid() {
        return userid;
    }

    public void setUserid(BigInteger userid) {
        this.userid = userid;
    }

    public BigInteger getElem() {
        return elem;
    }

    public void setElem(BigInteger elem) {
        this.elem = elem;
    }

    public Date getDatein() {
        return datein;
    }

    public void setDatein(Date datein) {
        this.datein = datein;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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

    public BigInteger getGrupoInformacion() {
        return grupoInformacion;
    }

    public void setGrupoInformacion(BigInteger grupoInformacion) {
        this.grupoInformacion = grupoInformacion;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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
        if (!(object instanceof Elemprestados)) {
            return false;
        }
        Elemprestados other = (Elemprestados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Elemprestados[ id=" + id + " ]";
    }
    
}
