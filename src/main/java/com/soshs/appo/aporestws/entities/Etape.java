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
@Table(name = "ETAPE")
@NamedQueries({
    @NamedQuery(name = "Etape.findAll", query = "SELECT e FROM Etape e"),
    @NamedQuery(name = "Etape.findByCodEtp", query = "SELECT e FROM Etape e WHERE e.codEtp = :codEtp"),
    @NamedQuery(name = "Etape.findByLibEtp", query = "SELECT e FROM Etape e WHERE e.libEtp = :libEtp"),
    @NamedQuery(name = "Etape.findByLicEtp", query = "SELECT e FROM Etape e WHERE e.licEtp = :licEtp"),
    @NamedQuery(name = "Etape.findByNbrMaxIaeAut", query = "SELECT e FROM Etape e WHERE e.nbrMaxIaeAut = :nbrMaxIaeAut"),
    @NamedQuery(name = "Etape.findByTemCouAccTrvEtp", query = "SELECT e FROM Etape e WHERE e.temCouAccTrvEtp = :temCouAccTrvEtp"),
    @NamedQuery(name = "Etape.findByTemOuvDrtSsoEtp", query = "SELECT e FROM Etape e WHERE e.temOuvDrtSsoEtp = :temOuvDrtSsoEtp"),
    @NamedQuery(name = "Etape.findByTemTypOpi", query = "SELECT e FROM Etape e WHERE e.temTypOpi = :temTypOpi"),
    @NamedQuery(name = "Etape.findByNbrMaxInscDeug", query = "SELECT e FROM Etape e WHERE e.nbrMaxInscDeug = :nbrMaxInscDeug"),
    @NamedQuery(name = "Etape.findByLibEtpArb", query = "SELECT e FROM Etape e WHERE e.libEtpArb = :libEtpArb"),
    @NamedQuery(name = "Etape.findByLicEtpArb", query = "SELECT e FROM Etape e WHERE e.licEtpArb = :licEtpArb")})
public class Etape implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "COD_ETP")
    private String codEtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "LIB_ETP")
    private String libEtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LIC_ETP")
    private String licEtp;
    @Column(name = "NBR_MAX_IAE_AUT")
    private Short nbrMaxIaeAut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_COU_ACC_TRV_ETP")
    private String temCouAccTrvEtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_OUV_DRT_SSO_ETP")
    private String temOuvDrtSsoEtp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TYP_OPI")
    private String temTypOpi;
    @Column(name = "NBR_MAX_INSC_DEUG")
    private Short nbrMaxInscDeug;
    @Size(max = 60)
    @Column(name = "LIB_ETP_ARB")
    private String libEtpArb;
    @Size(max = 25)
    @Column(name = "LIC_ETP_ARB")
    private String licEtpArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etape")
    private Collection<VersionEtape> versionEtapeCollection;

    public Etape() {
    }

    public Etape(String codEtp) {
        this.codEtp = codEtp;
    }

    public Etape(String codEtp, String libEtp, String licEtp, String temCouAccTrvEtp, String temOuvDrtSsoEtp, String temTypOpi) {
        this.codEtp = codEtp;
        this.libEtp = libEtp;
        this.licEtp = licEtp;
        this.temCouAccTrvEtp = temCouAccTrvEtp;
        this.temOuvDrtSsoEtp = temOuvDrtSsoEtp;
        this.temTypOpi = temTypOpi;
    }

    public String getCodEtp() {
        return codEtp;
    }

    public void setCodEtp(String codEtp) {
        this.codEtp = codEtp;
    }

    public String getLibEtp() {
        return libEtp;
    }

    public void setLibEtp(String libEtp) {
        this.libEtp = libEtp;
    }

    public String getLicEtp() {
        return licEtp;
    }

    public void setLicEtp(String licEtp) {
        this.licEtp = licEtp;
    }

    public Short getNbrMaxIaeAut() {
        return nbrMaxIaeAut;
    }

    public void setNbrMaxIaeAut(Short nbrMaxIaeAut) {
        this.nbrMaxIaeAut = nbrMaxIaeAut;
    }

    public String getTemCouAccTrvEtp() {
        return temCouAccTrvEtp;
    }

    public void setTemCouAccTrvEtp(String temCouAccTrvEtp) {
        this.temCouAccTrvEtp = temCouAccTrvEtp;
    }

    public String getTemOuvDrtSsoEtp() {
        return temOuvDrtSsoEtp;
    }

    public void setTemOuvDrtSsoEtp(String temOuvDrtSsoEtp) {
        this.temOuvDrtSsoEtp = temOuvDrtSsoEtp;
    }

    public String getTemTypOpi() {
        return temTypOpi;
    }

    public void setTemTypOpi(String temTypOpi) {
        this.temTypOpi = temTypOpi;
    }

    public Short getNbrMaxInscDeug() {
        return nbrMaxInscDeug;
    }

    public void setNbrMaxInscDeug(Short nbrMaxInscDeug) {
        this.nbrMaxInscDeug = nbrMaxInscDeug;
    }

    public String getLibEtpArb() {
        return libEtpArb;
    }

    public void setLibEtpArb(String libEtpArb) {
        this.libEtpArb = libEtpArb;
    }

    public String getLicEtpArb() {
        return licEtpArb;
    }

    public void setLicEtpArb(String licEtpArb) {
        this.licEtpArb = licEtpArb;
    }

    public Collection<VersionEtape> getVersionEtapeCollection() {
        return versionEtapeCollection;
    }

    public void setVersionEtapeCollection(Collection<VersionEtape> versionEtapeCollection) {
        this.versionEtapeCollection = versionEtapeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEtp != null ? codEtp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etape)) {
            return false;
        }
        Etape other = (Etape) object;
        if ((this.codEtp == null && other.codEtp != null) || (this.codEtp != null && !this.codEtp.equals(other.codEtp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.Etape[ codEtp=" + codEtp + " ]";
    }
    
}
