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
@Table(name = "USERSECURE", catalog = "", schema = "SESAT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usersecure.findAll", query = "SELECT u FROM Usersecure u")
    , @NamedQuery(name = "Usersecure.findById", query = "SELECT u FROM Usersecure u WHERE u.id = :id")
    , @NamedQuery(name = "Usersecure.findByMmbuser", query = "SELECT u FROM Usersecure u WHERE u.mmbuser = :mmbuser")
    , @NamedQuery(name = "Usersecure.findByPass", query = "SELECT u FROM Usersecure u WHERE u.pass = :pass")
    , @NamedQuery(name = "Usersecure.findBySalt", query = "SELECT u FROM Usersecure u WHERE u.salt = :salt")
    , @NamedQuery(name = "Usersecure.findByName", query = "SELECT u FROM Usersecure u WHERE u.name = :name")
    , @NamedQuery(name = "Usersecure.findByTypeDis", query = "SELECT u FROM Usersecure u WHERE u.typeDis = :typeDis")
    , @NamedQuery(name = "Usersecure.findByStatus", query = "SELECT u FROM Usersecure u WHERE u.status = :status")
    , @NamedQuery(name = "Usersecure.findByUserrole", query = "SELECT u FROM Usersecure u WHERE u.userrole = :userrole")
    , @NamedQuery(name = "Usersecure.findByIdP1", query = "SELECT u FROM Usersecure u WHERE u.idP1 = :idP1")
    , @NamedQuery(name = "Usersecure.findByIdP2", query = "SELECT u FROM Usersecure u WHERE u.idP2 = :idP2")
    , @NamedQuery(name = "Usersecure.findByIdP3", query = "SELECT u FROM Usersecure u WHERE u.idP3 = :idP3")
    , @NamedQuery(name = "Usersecure.findByUsuarioCreador", query = "SELECT u FROM Usersecure u WHERE u.usuarioCreador = :usuarioCreador")
    , @NamedQuery(name = "Usersecure.findByFechaCreacion", query = "SELECT u FROM Usersecure u WHERE u.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Usersecure.findByUsuarioModificador", query = "SELECT u FROM Usersecure u WHERE u.usuarioModificador = :usuarioModificador")
    , @NamedQuery(name = "Usersecure.findByFechaModificacion", query = "SELECT u FROM Usersecure u WHERE u.fechaModificacion = :fechaModificacion")})
public class Usersecure implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MMBUSER", nullable = false, length = 50)
    private String mmbuser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PASS", nullable = false, length = 50)
    private String pass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SALT", nullable = false, length = 100)
    private String salt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TYPE_DIS", nullable = false)
    private short typeDis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATUS", nullable = false)
    private short status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERROLE", nullable = false)
    private short userrole;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_P1", nullable = false)
    private long idP1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_P2", nullable = false)
    private long idP2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_P3", nullable = false)
    private long idP3;
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

    public Usersecure() {
    }

    public Usersecure(Long id) {
        this.id = id;
    }

    public Usersecure(Long id, String mmbuser, String pass, String salt, String name, short typeDis, short status, short userrole, long idP1, long idP2, long idP3) {
        this.id = id;
        this.mmbuser = mmbuser;
        this.pass = pass;
        this.salt = salt;
        this.name = name;
        this.typeDis = typeDis;
        this.status = status;
        this.userrole = userrole;
        this.idP1 = idP1;
        this.idP2 = idP2;
        this.idP3 = idP3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMmbuser() {
        return mmbuser;
    }

    public void setMmbuser(String mmbuser) {
        this.mmbuser = mmbuser;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getTypeDis() {
        return typeDis;
    }

    public void setTypeDis(short typeDis) {
        this.typeDis = typeDis;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public short getUserrole() {
        return userrole;
    }

    public void setUserrole(short userrole) {
        this.userrole = userrole;
    }

    public long getIdP1() {
        return idP1;
    }

    public void setIdP1(long idP1) {
        this.idP1 = idP1;
    }

    public long getIdP2() {
        return idP2;
    }

    public void setIdP2(long idP2) {
        this.idP2 = idP2;
    }

    public long getIdP3() {
        return idP3;
    }

    public void setIdP3(long idP3) {
        this.idP3 = idP3;
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
        if (!(object instanceof Usersecure)) {
            return false;
        }
        Usersecure other = (Usersecure) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Usersecure[ id=" + id + " ]";
    }
    
}
