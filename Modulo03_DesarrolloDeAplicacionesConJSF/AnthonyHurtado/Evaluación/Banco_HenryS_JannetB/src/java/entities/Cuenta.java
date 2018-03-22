/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hslvm
 */
@Entity
@Table(name = "cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")
    , @NamedQuery(name = "Cuenta.findByCtaTipo", query = "SELECT c FROM Cuenta c WHERE c.ctaTipo = :ctaTipo")
    , @NamedQuery(name = "Cuenta.findByCtaNombre", query = "SELECT c FROM Cuenta c WHERE c.ctaNombre = :ctaNombre")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cta_tipo")
    private String ctaTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "cta_nombre")
    private String ctaNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuenta")
    private Collection<Movimiento> movimientoCollection;

    public Cuenta() {
    }

    public Cuenta(String ctaTipo) {
        this.ctaTipo = ctaTipo;
    }

    public Cuenta(String ctaTipo, String ctaNombre) {
        this.ctaTipo = ctaTipo;
        this.ctaNombre = ctaNombre;
    }

    public String getCtaTipo() {
        return ctaTipo;
    }

    public void setCtaTipo(String ctaTipo) {
        this.ctaTipo = ctaTipo;
    }

    public String getCtaNombre() {
        return ctaNombre;
    }

    public void setCtaNombre(String ctaNombre) {
        this.ctaNombre = ctaNombre;
    }

    @XmlTransient
    public Collection<Movimiento> getMovimientoCollection() {
        return movimientoCollection;
    }

    public void setMovimientoCollection(Collection<Movimiento> movimientoCollection) {
        this.movimientoCollection = movimientoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ctaTipo != null ? ctaTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.ctaTipo == null && other.ctaTipo != null) || (this.ctaTipo != null && !this.ctaTipo.equals(other.ctaTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cuenta[ ctaTipo=" + ctaTipo + " ]";
    }
    
}
