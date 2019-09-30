/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "INS_PEDAGOGI_ANU")
@NamedQueries({
    @NamedQuery(name = "InsPedagogiAnu.findAll", query = "SELECT i FROM InsPedagogiAnu i"),
    @NamedQuery(name = "InsPedagogiAnu.findByCodAnu", query = "SELECT i FROM InsPedagogiAnu i WHERE i.insPedagogiAnuPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsPedagogiAnu.findByCodInd", query = "SELECT i FROM InsPedagogiAnu i WHERE i.insPedagogiAnuPK.codInd = :codInd")})
public class InsPedagogiAnu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsPedagogiAnuPK insPedagogiAnuPK;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insPedagogiAnu")
    private Collection<InsPedagogiEtp> insPedagogiEtpCollection;

    public InsPedagogiAnu() {
    }

    public InsPedagogiAnu(InsPedagogiAnuPK insPedagogiAnuPK) {
        this.insPedagogiAnuPK = insPedagogiAnuPK;
    }

    public InsPedagogiAnu(String codAnu, int codInd) {
        this.insPedagogiAnuPK = new InsPedagogiAnuPK(codAnu, codInd);
    }

    public InsPedagogiAnuPK getInsPedagogiAnuPK() {
        return insPedagogiAnuPK;
    }

    public void setInsPedagogiAnuPK(InsPedagogiAnuPK insPedagogiAnuPK) {
        this.insPedagogiAnuPK = insPedagogiAnuPK;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    public Collection<InsPedagogiEtp> getInsPedagogiEtpCollection() {
        return insPedagogiEtpCollection;
    }

    public void setInsPedagogiEtpCollection(Collection<InsPedagogiEtp> insPedagogiEtpCollection) {
        this.insPedagogiEtpCollection = insPedagogiEtpCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insPedagogiAnuPK != null ? insPedagogiAnuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsPedagogiAnu)) {
            return false;
        }
        InsPedagogiAnu other = (InsPedagogiAnu) object;
        if ((this.insPedagogiAnuPK == null && other.insPedagogiAnuPK != null) || (this.insPedagogiAnuPK != null && !this.insPedagogiAnuPK.equals(other.insPedagogiAnuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.InsPedagogiAnu[ insPedagogiAnuPK=" + insPedagogiAnuPK + " ]";
    }
    
}
