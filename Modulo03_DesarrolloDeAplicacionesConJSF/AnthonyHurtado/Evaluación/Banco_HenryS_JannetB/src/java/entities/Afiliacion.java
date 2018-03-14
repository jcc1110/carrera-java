/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hslvm
 */
@Entity
@Table(name = "afiliacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Afiliacion.findAll", query = "SELECT a FROM Afiliacion a")
    , @NamedQuery(name = "Afiliacion.findByUsrId", query = "SELECT a FROM Afiliacion a WHERE a.afiliacionPK.usrId = :usrId")
    , @NamedQuery(name = "Afiliacion.findByCtaTipo", query = "SELECT a FROM Afiliacion a WHERE a.afiliacionPK.ctaTipo = :ctaTipo")
    , @NamedQuery(name = "Afiliacion.findByNroCuenta", query = "SELECT a FROM Afiliacion a WHERE a.afiliacionPK.nroCuenta = :nroCuenta")
    , @NamedQuery(name = "Afiliacion.findByBanco", query = "SELECT a FROM Afiliacion a WHERE a.banco = :banco")
    , @NamedQuery(name = "Afiliacion.findByNombre", query = "SELECT a FROM Afiliacion a WHERE a.nombre = :nombre")})
public class Afiliacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AfiliacionPK afiliacionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "banco")
    private String banco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombre")
    private String nombre;
    private String nro_cuenta;
    private String usr_id;
    private String cta_tipo;

    public String getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(String usr_id) {
        this.usr_id = usr_id;
    }

    public String getCta_tipo() {
        return cta_tipo;
    }

    public void setCta_tipo(String cta_tipo) {
        this.cta_tipo = cta_tipo;
    }

    public String getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(String nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public Afiliacion() {
    }

    public Afiliacion(AfiliacionPK afiliacionPK) {
        this.afiliacionPK = afiliacionPK;
    }

    public Afiliacion(AfiliacionPK afiliacionPK, String banco, String nombre) {
        this.afiliacionPK = afiliacionPK;
        this.banco = banco;
        this.nombre = nombre;
    }

    public Afiliacion(String usrId, String ctaTipo, String nroCuenta) {
        this.afiliacionPK = new AfiliacionPK(usrId, ctaTipo, nroCuenta);
    }

    public AfiliacionPK getAfiliacionPK() {
        return afiliacionPK;
    }

    public void setAfiliacionPK(AfiliacionPK afiliacionPK) {
        this.afiliacionPK = afiliacionPK;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
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
        hash += (afiliacionPK != null ? afiliacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afiliacion)) {
            return false;
        }
        Afiliacion other = (Afiliacion) object;
        if ((this.afiliacionPK == null && other.afiliacionPK != null) || (this.afiliacionPK != null && !this.afiliacionPK.equals(other.afiliacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Afiliacion[ afiliacionPK=" + afiliacionPK + " ]";
    }
    
}
