/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author hslvm
 */
@Embeddable
public class AfiliacionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "usr_id")
    private String usrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cta_tipo")
    private String ctaTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nro_cuenta")
    private String nroCuenta;

    public AfiliacionPK() {
    }

    public AfiliacionPK(String usrId, String ctaTipo, String nroCuenta) {
        this.usrId = usrId;
        this.ctaTipo = ctaTipo;
        this.nroCuenta = nroCuenta;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getCtaTipo() {
        return ctaTipo;
    }

    public void setCtaTipo(String ctaTipo) {
        this.ctaTipo = ctaTipo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (ctaTipo != null ? ctaTipo.hashCode() : 0);
        hash += (nroCuenta != null ? nroCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfiliacionPK)) {
            return false;
        }
        AfiliacionPK other = (AfiliacionPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.ctaTipo == null && other.ctaTipo != null) || (this.ctaTipo != null && !this.ctaTipo.equals(other.ctaTipo))) {
            return false;
        }
        if ((this.nroCuenta == null && other.nroCuenta != null) || (this.nroCuenta != null && !this.nroCuenta.equals(other.nroCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AfiliacionPK[ usrId=" + usrId + ", ctaTipo=" + ctaTipo + ", nroCuenta=" + nroCuenta + " ]";
    }
    
}
