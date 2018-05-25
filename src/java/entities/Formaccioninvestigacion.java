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
@Table(name = "FORMACCIONINVESTIGACION", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formaccioninvestigacion.findAll", query = "SELECT f FROM Formaccioninvestigacion f")
    , @NamedQuery(name = "Formaccioninvestigacion.findById", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.id = :id")
    , @NamedQuery(name = "Formaccioninvestigacion.findByIdform", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.idform = :idform")
    , @NamedQuery(name = "Formaccioninvestigacion.findByTypetime", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.typetime = :typetime")
    , @NamedQuery(name = "Formaccioninvestigacion.findByPlanaccionprev", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.planaccionprev = :planaccionprev")
    , @NamedQuery(name = "Formaccioninvestigacion.findByPlanaccionres", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.planaccionres = :planaccionres")
    , @NamedQuery(name = "Formaccioninvestigacion.findByPlanacciondateexe", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.planacciondateexe = :planacciondateexe")
    , @NamedQuery(name = "Formaccioninvestigacion.findByPlanaccionrecursos", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.planaccionrecursos = :planaccionrecursos")
    , @NamedQuery(name = "Formaccioninvestigacion.findByPlanaccionrescumplir", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.planaccionrescumplir = :planaccionrescumplir")
    , @NamedQuery(name = "Formaccioninvestigacion.findByPlanacciondateclose", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.planacciondateclose = :planacciondateclose")
    , @NamedQuery(name = "Formaccioninvestigacion.findByUsuarioCreador", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Formaccioninvestigacion.findByFechaCreacion", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Formaccioninvestigacion.findByUsuarioModificador", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Formaccioninvestigacion.findByFechaModificacion", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "Formaccioninvestigacion.findByGrupoInformacion", query = "SELECT f FROM Formaccioninvestigacion f WHERE f.grupoInformacion = :grupoInformacion")})
public class Formaccioninvestigacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false, precision = 22)
    private BigDecimal id;
    @Size(max = 100)
    @Column(name = "IDFORM", length = 100)
    private String idform;
    @Size(max = 100)
    @Column(name = "TYPETIME", length = 100)
    private String typetime;
    @Column(name = "PLANACCIONPREV")
    @Temporal(TemporalType.DATE)
    private Date planaccionprev;
    @Size(max = 100)
    @Column(name = "PLANACCIONRES", length = 100)
    private String planaccionres;
    @Column(name = "PLANACCIONDATEEXE")
    @Temporal(TemporalType.DATE)
    private Date planacciondateexe;
    @Size(max = 100)
    @Column(name = "PLANACCIONRECURSOS", length = 100)
    private String planaccionrecursos;
    @Size(max = 100)
    @Column(name = "PLANACCIONRESCUMPLIR", length = 100)
    private String planaccionrescumplir;
    @Column(name = "PLANACCIONDATECLOSE")
    @Temporal(TemporalType.DATE)
    private Date planacciondateclose;
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

    public Formaccioninvestigacion() {
    }

    public Formaccioninvestigacion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getIdform() {
        return idform;
    }

    public void setIdform(String idform) {
        this.idform = idform;
    }

    public String getTypetime() {
        return typetime;
    }

    public void setTypetime(String typetime) {
        this.typetime = typetime;
    }

    public Date getPlanaccionprev() {
        return planaccionprev;
    }

    public void setPlanaccionprev(Date planaccionprev) {
        this.planaccionprev = planaccionprev;
    }

    public String getPlanaccionres() {
        return planaccionres;
    }

    public void setPlanaccionres(String planaccionres) {
        this.planaccionres = planaccionres;
    }

    public Date getPlanacciondateexe() {
        return planacciondateexe;
    }

    public void setPlanacciondateexe(Date planacciondateexe) {
        this.planacciondateexe = planacciondateexe;
    }

    public String getPlanaccionrecursos() {
        return planaccionrecursos;
    }

    public void setPlanaccionrecursos(String planaccionrecursos) {
        this.planaccionrecursos = planaccionrecursos;
    }

    public String getPlanaccionrescumplir() {
        return planaccionrescumplir;
    }

    public void setPlanaccionrescumplir(String planaccionrescumplir) {
        this.planaccionrescumplir = planaccionrescumplir;
    }

    public Date getPlanacciondateclose() {
        return planacciondateclose;
    }

    public void setPlanacciondateclose(Date planacciondateclose) {
        this.planacciondateclose = planacciondateclose;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formaccioninvestigacion)) {
            return false;
        }
        Formaccioninvestigacion other = (Formaccioninvestigacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Formaccioninvestigacion[ id=" + id + " ]";
    }
    
}
