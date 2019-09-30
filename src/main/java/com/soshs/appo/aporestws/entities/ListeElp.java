/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.entities;

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

/**
 *
 * @author master05
 */
@Entity
@Table(name = "LISTE_ELP")
@NamedQueries({
    @NamedQuery(name = "ListeElp.findAll", query = "SELECT l FROM ListeElp l"),
    @NamedQuery(name = "ListeElp.findByCodLse", query = "SELECT l FROM ListeElp l WHERE l.codLse = :codLse"),
    @NamedQuery(name = "ListeElp.findByCodTypLse", query = "SELECT l FROM ListeElp l WHERE l.codTypLse = :codTypLse"),
    @NamedQuery(name = "ListeElp.findByEtaLse", query = "SELECT l FROM ListeElp l WHERE l.etaLse = :etaLse"),
    @NamedQuery(name = "ListeElp.findByLicLse", query = "SELECT l FROM ListeElp l WHERE l.licLse = :licLse"),
    @NamedQuery(name = "ListeElp.findByLibLse", query = "SELECT l FROM ListeElp l WHERE l.libLse = :libLse"),
    @NamedQuery(name = "ListeElp.findByLicLseArb", query = "SELECT l FROM ListeElp l WHERE l.licLseArb = :licLseArb"),
    @NamedQuery(name = "ListeElp.findByLibLseArb", query = "SELECT l FROM ListeElp l WHERE l.libLseArb = :libLseArb")})
public class ListeElp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_LSE")
    private String codLse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_TYP_LSE")
    private String codTypLse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_LSE")
    private String etaLse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_LSE")
    private String licLse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_LSE")
    private String libLse;
    @Size(max = 25)
    @Column(name = "LIC_LSE_ARB")
    private String licLseArb;
    @Size(max = 60)
    @Column(name = "LIB_LSE_ARB")
    private String libLseArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeElp")
    private Collection<LseRegroupeElp> lseRegroupeElpCollection;

    public ListeElp() {
    }

    public ListeElp(String codLse) {
        this.codLse = codLse;
    }

    public ListeElp(String codLse, String codTypLse, String etaLse, String licLse, String libLse) {
        this.codLse = codLse;
        this.codTypLse = codTypLse;
        this.etaLse = etaLse;
        this.licLse = licLse;
        this.libLse = libLse;
    }

    public String getCodLse() {
        return codLse;
    }

    public void setCodLse(String codLse) {
        this.codLse = codLse;
    }

    public String getCodTypLse() {
        return codTypLse;
    }

    public void setCodTypLse(String codTypLse) {
        this.codTypLse = codTypLse;
    }

    public String getEtaLse() {
        return etaLse;
    }

    public void setEtaLse(String etaLse) {
        this.etaLse = etaLse;
    }

    public String getLicLse() {
        return licLse;
    }

    public void setLicLse(String licLse) {
        this.licLse = licLse;
    }

    public String getLibLse() {
        return libLse;
    }

    public void setLibLse(String libLse) {
        this.libLse = libLse;
    }

    public String getLicLseArb() {
        return licLseArb;
    }

    public void setLicLseArb(String licLseArb) {
        this.licLseArb = licLseArb;
    }

    public String getLibLseArb() {
        return libLseArb;
    }

    public void setLibLseArb(String libLseArb) {
        this.libLseArb = libLseArb;
    }

    public Collection<LseRegroupeElp> getLseRegroupeElpCollection() {
        return lseRegroupeElpCollection;
    }

    public void setLseRegroupeElpCollection(Collection<LseRegroupeElp> lseRegroupeElpCollection) {
        this.lseRegroupeElpCollection = lseRegroupeElpCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLse != null ? codLse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeElp)) {
            return false;
        }
        ListeElp other = (ListeElp) object;
        if ((this.codLse == null && other.codLse != null) || (this.codLse != null && !this.codLse.equals(other.codLse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.ListeElp[ codLse=" + codLse + " ]";
    }
    
}
