/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "INS_INFO_ANU")
@NamedQueries({
    @NamedQuery(name = "InsInfoAnu.findAll", query = "SELECT i FROM InsInfoAnu i"),
    @NamedQuery(name = "InsInfoAnu.findByCodAnu", query = "SELECT i FROM InsInfoAnu i WHERE i.insInfoAnuPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsInfoAnu.findByCodInd", query = "SELECT i FROM InsInfoAnu i WHERE i.insInfoAnuPK.codInd = :codInd")})
public class InsInfoAnu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsInfoAnuPK insInfoAnuPK;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;
    @OneToOne(mappedBy = "insInfoAnu")
    private Adresse adresse;

    public InsInfoAnu() {
    }

    public InsInfoAnu(InsInfoAnuPK insInfoAnuPK) {
        this.insInfoAnuPK = insInfoAnuPK;
    }

    public InsInfoAnu(String codAnu, int codInd) {
        this.insInfoAnuPK = new InsInfoAnuPK(codAnu, codInd);
    }

    public InsInfoAnuPK getInsInfoAnuPK() {
        return insInfoAnuPK;
    }

    public void setInsInfoAnuPK(InsInfoAnuPK insInfoAnuPK) {
        this.insInfoAnuPK = insInfoAnuPK;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insInfoAnuPK != null ? insInfoAnuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsInfoAnu)) {
            return false;
        }
        InsInfoAnu other = (InsInfoAnu) object;
        if ((this.insInfoAnuPK == null && other.insInfoAnuPK != null) || (this.insInfoAnuPK != null && !this.insInfoAnuPK.equals(other.insInfoAnuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.InsInfoAnu[ insInfoAnuPK=" + insInfoAnuPK + " ]";
    }
    
}
