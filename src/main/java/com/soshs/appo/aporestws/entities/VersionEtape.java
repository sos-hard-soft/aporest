/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author master05
 */
@Entity
@Table(name = "VERSION_ETAPE")
@NamedQueries({
    @NamedQuery(name = "VersionEtape.findAll", query = "SELECT v FROM VersionEtape v"),
    @NamedQuery(name = "VersionEtape.findByCodEtp", query = "SELECT v FROM VersionEtape v WHERE v.versionEtapePK.codEtp = :codEtp"),
    @NamedQuery(name = "VersionEtape.findByCodVrsVet", query = "SELECT v FROM VersionEtape v WHERE v.versionEtapePK.codVrsVet = :codVrsVet"),
    @NamedQuery(name = "VersionEtape.findByLibCmtVet", query = "SELECT v FROM VersionEtape v WHERE v.libCmtVet = :libCmtVet"),
    @NamedQuery(name = "VersionEtape.findByNbrVolHorVet", query = "SELECT v FROM VersionEtape v WHERE v.nbrVolHorVet = :nbrVolHorVet"),
    @NamedQuery(name = "VersionEtape.findByTemTlsVet", query = "SELECT v FROM VersionEtape v WHERE v.temTlsVet = :temTlsVet"),
    @NamedQuery(name = "VersionEtape.findByTemNotVet", query = "SELECT v FROM VersionEtape v WHERE v.temNotVet = :temNotVet"),
    @NamedQuery(name = "VersionEtape.findByBarSaiVet", query = "SELECT v FROM VersionEtape v WHERE v.barSaiVet = :barSaiVet"),
    @NamedQuery(name = "VersionEtape.findByTemPntJurVet", query = "SELECT v FROM VersionEtape v WHERE v.temPntJurVet = :temPntJurVet"),
    @NamedQuery(name = "VersionEtape.findByTemMndVet", query = "SELECT v FROM VersionEtape v WHERE v.temMndVet = :temMndVet"),
    @NamedQuery(name = "VersionEtape.findByTemResVet", query = "SELECT v FROM VersionEtape v WHERE v.temResVet = :temResVet"),
    @NamedQuery(name = "VersionEtape.findByTemJurVet", query = "SELECT v FROM VersionEtape v WHERE v.temJurVet = :temJurVet"),
    @NamedQuery(name = "VersionEtape.findByNbrAdmVet", query = "SELECT v FROM VersionEtape v WHERE v.nbrAdmVet = :nbrAdmVet"),
    @NamedQuery(name = "VersionEtape.findByTemDipVet", query = "SELECT v FROM VersionEtape v WHERE v.temDipVet = :temDipVet"),
    @NamedQuery(name = "VersionEtape.findByTemSesUni", query = "SELECT v FROM VersionEtape v WHERE v.temSesUni = :temSesUni"),
    @NamedQuery(name = "VersionEtape.findByTemAdi", query = "SELECT v FROM VersionEtape v WHERE v.temAdi = :temAdi"),
    @NamedQuery(name = "VersionEtape.findByTemAdo", query = "SELECT v FROM VersionEtape v WHERE v.temAdo = :temAdo"),
    @NamedQuery(name = "VersionEtape.findByLim1Vet", query = "SELECT v FROM VersionEtape v WHERE v.lim1Vet = :lim1Vet"),
    @NamedQuery(name = "VersionEtape.findByLim2Vet", query = "SELECT v FROM VersionEtape v WHERE v.lim2Vet = :lim2Vet"),
    @NamedQuery(name = "VersionEtape.findByLim3Vet", query = "SELECT v FROM VersionEtape v WHERE v.lim3Vet = :lim3Vet"),
    @NamedQuery(name = "VersionEtape.findByDatDebMinVet", query = "SELECT v FROM VersionEtape v WHERE v.datDebMinVet = :datDebMinVet"),
    @NamedQuery(name = "VersionEtape.findByDatFinMinVet", query = "SELECT v FROM VersionEtape v WHERE v.datFinMinVet = :datFinMinVet"),
    @NamedQuery(name = "VersionEtape.findByTemOpiMinVet", query = "SELECT v FROM VersionEtape v WHERE v.temOpiMinVet = :temOpiMinVet"),
    @NamedQuery(name = "VersionEtape.findByLibWebVet", query = "SELECT v FROM VersionEtape v WHERE v.libWebVet = :libWebVet")})
public class VersionEtape implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VersionEtapePK versionEtapePK;
    @Size(max = 2000)
    @Column(name = "LIB_CMT_VET")
    private String libCmtVet;
    @Column(name = "NBR_VOL_HOR_VET")
    private Short nbrVolHorVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TLS_VET")
    private String temTlsVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_VET")
    private String temNotVet;
    @Column(name = "BAR_SAI_VET")
    private Integer barSaiVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PNT_JUR_VET")
    private String temPntJurVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_MND_VET")
    private String temMndVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_VET")
    private String temResVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_JUR_VET")
    private String temJurVet;
    @Column(name = "NBR_ADM_VET")
    private Short nbrAdmVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DIP_VET")
    private String temDipVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SES_UNI")
    private String temSesUni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADI")
    private String temAdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ADO")
    private String temAdo;
    @Size(max = 35)
    @Column(name = "LIM1_VET")
    private String lim1Vet;
    @Size(max = 35)
    @Column(name = "LIM2_VET")
    private String lim2Vet;
    @Size(max = 35)
    @Column(name = "LIM3_VET")
    private String lim3Vet;
    @Column(name = "DAT_DEB_MIN_VET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datDebMinVet;
    @Column(name = "DAT_FIN_MIN_VET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datFinMinVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_OPI_MIN_VET")
    private String temOpiMinVet;
    @Size(max = 120)
    @Column(name = "LIB_WEB_VET")
    private String libWebVet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "versionEtape")
    private Collection<InsAdmEtp> insAdmEtpCollection;
    @JoinColumn(name = "COD_ETP", referencedColumnName = "COD_ETP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etape etape;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "versionEtape")
    private Collection<InsPedagogiEtp> insPedagogiEtpCollection;

    public VersionEtape() {
    }

    public VersionEtape(VersionEtapePK versionEtapePK) {
        this.versionEtapePK = versionEtapePK;
    }

    public VersionEtape(VersionEtapePK versionEtapePK, String temTlsVet, String temNotVet, String temPntJurVet, String temMndVet, String temResVet, String temJurVet, String temDipVet, String temSesUni, String temAdi, String temAdo, String temOpiMinVet) {
        this.versionEtapePK = versionEtapePK;
        this.temTlsVet = temTlsVet;
        this.temNotVet = temNotVet;
        this.temPntJurVet = temPntJurVet;
        this.temMndVet = temMndVet;
        this.temResVet = temResVet;
        this.temJurVet = temJurVet;
        this.temDipVet = temDipVet;
        this.temSesUni = temSesUni;
        this.temAdi = temAdi;
        this.temAdo = temAdo;
        this.temOpiMinVet = temOpiMinVet;
    }

    public VersionEtape(String codEtp, short codVrsVet) {
        this.versionEtapePK = new VersionEtapePK(codEtp, codVrsVet);
    }

    public VersionEtapePK getVersionEtapePK() {
        return versionEtapePK;
    }

    public void setVersionEtapePK(VersionEtapePK versionEtapePK) {
        this.versionEtapePK = versionEtapePK;
    }

    public String getLibCmtVet() {
        return libCmtVet;
    }

    public void setLibCmtVet(String libCmtVet) {
        this.libCmtVet = libCmtVet;
    }

    public Short getNbrVolHorVet() {
        return nbrVolHorVet;
    }

    public void setNbrVolHorVet(Short nbrVolHorVet) {
        this.nbrVolHorVet = nbrVolHorVet;
    }

    public String getTemTlsVet() {
        return temTlsVet;
    }

    public void setTemTlsVet(String temTlsVet) {
        this.temTlsVet = temTlsVet;
    }

    public String getTemNotVet() {
        return temNotVet;
    }

    public void setTemNotVet(String temNotVet) {
        this.temNotVet = temNotVet;
    }

    public Integer getBarSaiVet() {
        return barSaiVet;
    }

    public void setBarSaiVet(Integer barSaiVet) {
        this.barSaiVet = barSaiVet;
    }

    public String getTemPntJurVet() {
        return temPntJurVet;
    }

    public void setTemPntJurVet(String temPntJurVet) {
        this.temPntJurVet = temPntJurVet;
    }

    public String getTemMndVet() {
        return temMndVet;
    }

    public void setTemMndVet(String temMndVet) {
        this.temMndVet = temMndVet;
    }

    public String getTemResVet() {
        return temResVet;
    }

    public void setTemResVet(String temResVet) {
        this.temResVet = temResVet;
    }

    public String getTemJurVet() {
        return temJurVet;
    }

    public void setTemJurVet(String temJurVet) {
        this.temJurVet = temJurVet;
    }

    public Short getNbrAdmVet() {
        return nbrAdmVet;
    }

    public void setNbrAdmVet(Short nbrAdmVet) {
        this.nbrAdmVet = nbrAdmVet;
    }

    public String getTemDipVet() {
        return temDipVet;
    }

    public void setTemDipVet(String temDipVet) {
        this.temDipVet = temDipVet;
    }

    public String getTemSesUni() {
        return temSesUni;
    }

    public void setTemSesUni(String temSesUni) {
        this.temSesUni = temSesUni;
    }

    public String getTemAdi() {
        return temAdi;
    }

    public void setTemAdi(String temAdi) {
        this.temAdi = temAdi;
    }

    public String getTemAdo() {
        return temAdo;
    }

    public void setTemAdo(String temAdo) {
        this.temAdo = temAdo;
    }

    public String getLim1Vet() {
        return lim1Vet;
    }

    public void setLim1Vet(String lim1Vet) {
        this.lim1Vet = lim1Vet;
    }

    public String getLim2Vet() {
        return lim2Vet;
    }

    public void setLim2Vet(String lim2Vet) {
        this.lim2Vet = lim2Vet;
    }

    public String getLim3Vet() {
        return lim3Vet;
    }

    public void setLim3Vet(String lim3Vet) {
        this.lim3Vet = lim3Vet;
    }

    public Date getDatDebMinVet() {
        return datDebMinVet;
    }

    public void setDatDebMinVet(Date datDebMinVet) {
        this.datDebMinVet = datDebMinVet;
    }

    public Date getDatFinMinVet() {
        return datFinMinVet;
    }

    public void setDatFinMinVet(Date datFinMinVet) {
        this.datFinMinVet = datFinMinVet;
    }

    public String getTemOpiMinVet() {
        return temOpiMinVet;
    }

    public void setTemOpiMinVet(String temOpiMinVet) {
        this.temOpiMinVet = temOpiMinVet;
    }

    public String getLibWebVet() {
        return libWebVet;
    }

    public void setLibWebVet(String libWebVet) {
        this.libWebVet = libWebVet;
    }

    public Collection<InsAdmEtp> getInsAdmEtpCollection() {
        return insAdmEtpCollection;
    }

    public void setInsAdmEtpCollection(Collection<InsAdmEtp> insAdmEtpCollection) {
        this.insAdmEtpCollection = insAdmEtpCollection;
    }

    public Etape getEtape() {
        return etape;
    }

    public void setEtape(Etape etape) {
        this.etape = etape;
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
        hash += (versionEtapePK != null ? versionEtapePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VersionEtape)) {
            return false;
        }
        VersionEtape other = (VersionEtape) object;
        if ((this.versionEtapePK == null && other.versionEtapePK != null) || (this.versionEtapePK != null && !this.versionEtapePK.equals(other.versionEtapePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.VersionEtape[ versionEtapePK=" + versionEtapePK + " ]";
    }
    
}
