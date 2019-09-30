/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "INS_ADM_ANU")
@NamedQueries({
    @NamedQuery(name = "InsAdmAnu.findAll", query = "SELECT i FROM InsAdmAnu i"),
    @NamedQuery(name = "InsAdmAnu.findByCodAnu", query = "SELECT i FROM InsAdmAnu i WHERE i.insAdmAnuPK.codAnu = :codAnu"),
    @NamedQuery(name = "InsAdmAnu.findByCodInd", query = "SELECT i FROM InsAdmAnu i WHERE i.insAdmAnuPK.codInd = :codInd"),
    @NamedQuery(name = "InsAdmAnu.findByCodPrlChg", query = "SELECT i FROM InsAdmAnu i WHERE i.codPrlChg = :codPrlChg"),
    @NamedQuery(name = "InsAdmAnu.findByCodTpt", query = "SELECT i FROM InsAdmAnu i WHERE i.codTpt = :codTpt"),
    @NamedQuery(name = "InsAdmAnu.findByTemAflSso", query = "SELECT i FROM InsAdmAnu i WHERE i.temAflSso = :temAflSso"),
    @NamedQuery(name = "InsAdmAnu.findByTemTrmSsoIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.temTrmSsoIaa = :temTrmSsoIaa"),
    @NamedQuery(name = "InsAdmAnu.findByNumBrdTrmSsoIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.numBrdTrmSsoIaa = :numBrdTrmSsoIaa"),
    @NamedQuery(name = "InsAdmAnu.findByDatPmtCotSso", query = "SELECT i FROM InsAdmAnu i WHERE i.datPmtCotSso = :datPmtCotSso"),
    @NamedQuery(name = "InsAdmAnu.findByDatTrmSso", query = "SELECT i FROM InsAdmAnu i WHERE i.datTrmSso = :datTrmSso"),
    @NamedQuery(name = "InsAdmAnu.findByDatAflSso", query = "SELECT i FROM InsAdmAnu i WHERE i.datAflSso = :datAflSso"),
    @NamedQuery(name = "InsAdmAnu.findByDaaEtbAntIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.daaEtbAntIaa = :daaEtbAntIaa"),
    @NamedQuery(name = "InsAdmAnu.findByEtaEdtCrt", query = "SELECT i FROM InsAdmAnu i WHERE i.etaEdtCrt = :etaEdtCrt"),
    @NamedQuery(name = "InsAdmAnu.findByDatEdtCrt", query = "SELECT i FROM InsAdmAnu i WHERE i.datEdtCrt = :datEdtCrt"),
    @NamedQuery(name = "InsAdmAnu.findByTemDosIaaInc", query = "SELECT i FROM InsAdmAnu i WHERE i.temDosIaaInc = :temDosIaaInc"),
    @NamedQuery(name = "InsAdmAnu.findByLibMtfDosIaaInc", query = "SELECT i FROM InsAdmAnu i WHERE i.libMtfDosIaaInc = :libMtfDosIaaInc"),
    @NamedQuery(name = "InsAdmAnu.findByDatCreIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.datCreIaa = :datCreIaa"),
    @NamedQuery(name = "InsAdmAnu.findByDatModIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.datModIaa = :datModIaa"),
    @NamedQuery(name = "InsAdmAnu.findByEtaIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.etaIaa = :etaIaa"),
    @NamedQuery(name = "InsAdmAnu.findByTemEtbIaa1", query = "SELECT i FROM InsAdmAnu i WHERE i.temEtbIaa1 = :temEtbIaa1"),
    @NamedQuery(name = "InsAdmAnu.findByTemEtbIaa2", query = "SELECT i FROM InsAdmAnu i WHERE i.temEtbIaa2 = :temEtbIaa2"),
    @NamedQuery(name = "InsAdmAnu.findByTemBrsIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.temBrsIaa = :temBrsIaa"),
    @NamedQuery(name = "InsAdmAnu.findByTemRgmAmgEtuIaa", query = "SELECT i FROM InsAdmAnu i WHERE i.temRgmAmgEtuIaa = :temRgmAmgEtuIaa"),
    @NamedQuery(name = "InsAdmAnu.findByCodPcsMere", query = "SELECT i FROM InsAdmAnu i WHERE i.codPcsMere = :codPcsMere")})
public class InsAdmAnu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsAdmAnuPK insAdmAnuPK;
    @Size(max = 1)
    @Column(name = "COD_PRL_CHG")
    private String codPrlChg;
    @Size(max = 1)
    @Column(name = "COD_TPT")
    private String codTpt;
    @Size(max = 1)
    @Column(name = "TEM_AFL_SSO")
    private String temAflSso;
    @Size(max = 1)
    @Column(name = "TEM_TRM_SSO_IAA")
    private String temTrmSsoIaa;
    @Column(name = "NUM_BRD_TRM_SSO_IAA")
    private Short numBrdTrmSsoIaa;
    @Column(name = "DAT_PMT_COT_SSO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datPmtCotSso;
    @Column(name = "DAT_TRM_SSO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datTrmSso;
    @Column(name = "DAT_AFL_SSO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datAflSso;
    @Size(max = 4)
    @Column(name = "DAA_ETB_ANT_IAA")
    private String daaEtbAntIaa;
    @Size(max = 1)
    @Column(name = "ETA_EDT_CRT")
    private String etaEdtCrt;
    @Column(name = "DAT_EDT_CRT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datEdtCrt;
    @Size(max = 1)
    @Column(name = "TEM_DOS_IAA_INC")
    private String temDosIaaInc;
    @Size(max = 40)
    @Column(name = "LIB_MTF_DOS_IAA_INC")
    private String libMtfDosIaaInc;
    @Column(name = "DAT_CRE_IAA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreIaa;
    @Column(name = "DAT_MOD_IAA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModIaa;
    @Size(max = 1)
    @Column(name = "ETA_IAA")
    private String etaIaa;
    @Size(max = 1)
    @Column(name = "TEM_ETB_IAA_1")
    private String temEtbIaa1;
    @Size(max = 1)
    @Column(name = "TEM_ETB_IAA_2")
    private String temEtbIaa2;
    @Size(max = 1)
    @Column(name = "TEM_BRS_IAA")
    private String temBrsIaa;
    @Size(max = 1)
    @Column(name = "TEM_RGM_AMG_ETU_IAA")
    private String temRgmAmgEtuIaa;
    @Size(max = 2)
    @Column(name = "COD_PCS_MERE")
    private String codPcsMere;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "insAdmAnu")
    private Collection<InsAdmEtp> insAdmEtpCollection;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;

    public InsAdmAnu() {
    }

    public InsAdmAnu(InsAdmAnuPK insAdmAnuPK) {
        this.insAdmAnuPK = insAdmAnuPK;
    }

    public InsAdmAnu(String codAnu, int codInd) {
        this.insAdmAnuPK = new InsAdmAnuPK(codAnu, codInd);
    }

    public InsAdmAnuPK getInsAdmAnuPK() {
        return insAdmAnuPK;
    }

    public void setInsAdmAnuPK(InsAdmAnuPK insAdmAnuPK) {
        this.insAdmAnuPK = insAdmAnuPK;
    }

    public String getCodPrlChg() {
        return codPrlChg;
    }

    public void setCodPrlChg(String codPrlChg) {
        this.codPrlChg = codPrlChg;
    }

    public String getCodTpt() {
        return codTpt;
    }

    public void setCodTpt(String codTpt) {
        this.codTpt = codTpt;
    }

    public String getTemAflSso() {
        return temAflSso;
    }

    public void setTemAflSso(String temAflSso) {
        this.temAflSso = temAflSso;
    }

    public String getTemTrmSsoIaa() {
        return temTrmSsoIaa;
    }

    public void setTemTrmSsoIaa(String temTrmSsoIaa) {
        this.temTrmSsoIaa = temTrmSsoIaa;
    }

    public Short getNumBrdTrmSsoIaa() {
        return numBrdTrmSsoIaa;
    }

    public void setNumBrdTrmSsoIaa(Short numBrdTrmSsoIaa) {
        this.numBrdTrmSsoIaa = numBrdTrmSsoIaa;
    }

    public Date getDatPmtCotSso() {
        return datPmtCotSso;
    }

    public void setDatPmtCotSso(Date datPmtCotSso) {
        this.datPmtCotSso = datPmtCotSso;
    }

    public Date getDatTrmSso() {
        return datTrmSso;
    }

    public void setDatTrmSso(Date datTrmSso) {
        this.datTrmSso = datTrmSso;
    }

    public Date getDatAflSso() {
        return datAflSso;
    }

    public void setDatAflSso(Date datAflSso) {
        this.datAflSso = datAflSso;
    }

    public String getDaaEtbAntIaa() {
        return daaEtbAntIaa;
    }

    public void setDaaEtbAntIaa(String daaEtbAntIaa) {
        this.daaEtbAntIaa = daaEtbAntIaa;
    }

    public String getEtaEdtCrt() {
        return etaEdtCrt;
    }

    public void setEtaEdtCrt(String etaEdtCrt) {
        this.etaEdtCrt = etaEdtCrt;
    }

    public Date getDatEdtCrt() {
        return datEdtCrt;
    }

    public void setDatEdtCrt(Date datEdtCrt) {
        this.datEdtCrt = datEdtCrt;
    }

    public String getTemDosIaaInc() {
        return temDosIaaInc;
    }

    public void setTemDosIaaInc(String temDosIaaInc) {
        this.temDosIaaInc = temDosIaaInc;
    }

    public String getLibMtfDosIaaInc() {
        return libMtfDosIaaInc;
    }

    public void setLibMtfDosIaaInc(String libMtfDosIaaInc) {
        this.libMtfDosIaaInc = libMtfDosIaaInc;
    }

    public Date getDatCreIaa() {
        return datCreIaa;
    }

    public void setDatCreIaa(Date datCreIaa) {
        this.datCreIaa = datCreIaa;
    }

    public Date getDatModIaa() {
        return datModIaa;
    }

    public void setDatModIaa(Date datModIaa) {
        this.datModIaa = datModIaa;
    }

    public String getEtaIaa() {
        return etaIaa;
    }

    public void setEtaIaa(String etaIaa) {
        this.etaIaa = etaIaa;
    }

    public String getTemEtbIaa1() {
        return temEtbIaa1;
    }

    public void setTemEtbIaa1(String temEtbIaa1) {
        this.temEtbIaa1 = temEtbIaa1;
    }

    public String getTemEtbIaa2() {
        return temEtbIaa2;
    }

    public void setTemEtbIaa2(String temEtbIaa2) {
        this.temEtbIaa2 = temEtbIaa2;
    }

    public String getTemBrsIaa() {
        return temBrsIaa;
    }

    public void setTemBrsIaa(String temBrsIaa) {
        this.temBrsIaa = temBrsIaa;
    }

    public String getTemRgmAmgEtuIaa() {
        return temRgmAmgEtuIaa;
    }

    public void setTemRgmAmgEtuIaa(String temRgmAmgEtuIaa) {
        this.temRgmAmgEtuIaa = temRgmAmgEtuIaa;
    }

    public String getCodPcsMere() {
        return codPcsMere;
    }

    public void setCodPcsMere(String codPcsMere) {
        this.codPcsMere = codPcsMere;
    }

    public Collection<InsAdmEtp> getInsAdmEtpCollection() {
        return insAdmEtpCollection;
    }

    public void setInsAdmEtpCollection(Collection<InsAdmEtp> insAdmEtpCollection) {
        this.insAdmEtpCollection = insAdmEtpCollection;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insAdmAnuPK != null ? insAdmAnuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsAdmAnu)) {
            return false;
        }
        InsAdmAnu other = (InsAdmAnu) object;
        if ((this.insAdmAnuPK == null && other.insAdmAnuPK != null) || (this.insAdmAnuPK != null && !this.insAdmAnuPK.equals(other.insAdmAnuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.InsAdmAnu[ insAdmAnuPK=" + insAdmAnuPK + " ]";
    }
    
}
