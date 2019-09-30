/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.appo.aporestws.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "MENTION")
@NamedQueries({
    @NamedQuery(name = "Mention.findAll", query = "SELECT m FROM Mention m"),
    @NamedQuery(name = "Mention.findByCodMen", query = "SELECT m FROM Mention m WHERE m.codMen = :codMen"),
    @NamedQuery(name = "Mention.findByLicMen", query = "SELECT m FROM Mention m WHERE m.licMen = :licMen"),
    @NamedQuery(name = "Mention.findByLibMen", query = "SELECT m FROM Mention m WHERE m.libMen = :libMen"),
    @NamedQuery(name = "Mention.findByTemEnSveMen", query = "SELECT m FROM Mention m WHERE m.temEnSveMen = :temEnSveMen"),
    @NamedQuery(name = "Mention.findByLibMenArb", query = "SELECT m FROM Mention m WHERE m.libMenArb = :libMenArb"),
    @NamedQuery(name = "Mention.findByCodMenArb", query = "SELECT m FROM Mention m WHERE m.codMenArb = :codMenArb"),
    @NamedQuery(name = "Mention.findByLicMenArb", query = "SELECT m FROM Mention m WHERE m.licMenArb = :licMenArb")})
public class Mention implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_MEN")
    private String codMen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_MEN")
    private String licMen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LIB_MEN")
    private String libMen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_MEN")
    private String temEnSveMen;
    @Size(max = 50)
    @Column(name = "LIB_MEN_ARB")
    private String libMenArb;
    @Size(max = 2)
    @Column(name = "COD_MEN_ARB")
    private String codMenArb;
    @Size(max = 10)
    @Column(name = "LIC_MEN_ARB")
    private String licMenArb;
    @OneToMany(mappedBy = "codMen")
    private Collection<ResultatVdi> resultatVdiCollection;
    @OneToMany(mappedBy = "codMen")
    private Collection<ResultatElp> resultatElpCollection;
    @OneToMany(mappedBy = "codMen")
    private Collection<ResultatVet> resultatVetCollection;

    public Mention() {
    }

    public Mention(String codMen) {
        this.codMen = codMen;
    }

    public Mention(String codMen, String licMen, String libMen, String temEnSveMen) {
        this.codMen = codMen;
        this.licMen = licMen;
        this.libMen = libMen;
        this.temEnSveMen = temEnSveMen;
    }

    public String getCodMen() {
        return codMen;
    }

    public void setCodMen(String codMen) {
        this.codMen = codMen;
    }

    public String getLicMen() {
        return licMen;
    }

    public void setLicMen(String licMen) {
        this.licMen = licMen;
    }

    public String getLibMen() {
        return libMen;
    }

    public void setLibMen(String libMen) {
        this.libMen = libMen;
    }

    public String getTemEnSveMen() {
        return temEnSveMen;
    }

    public void setTemEnSveMen(String temEnSveMen) {
        this.temEnSveMen = temEnSveMen;
    }

    public String getLibMenArb() {
        return libMenArb;
    }

    public void setLibMenArb(String libMenArb) {
        this.libMenArb = libMenArb;
    }

    public String getCodMenArb() {
        return codMenArb;
    }

    public void setCodMenArb(String codMenArb) {
        this.codMenArb = codMenArb;
    }

    public String getLicMenArb() {
        return licMenArb;
    }

    public void setLicMenArb(String licMenArb) {
        this.licMenArb = licMenArb;
    }

    public Collection<ResultatVdi> getResultatVdiCollection() {
        return resultatVdiCollection;
    }

    public void setResultatVdiCollection(Collection<ResultatVdi> resultatVdiCollection) {
        this.resultatVdiCollection = resultatVdiCollection;
    }

    public Collection<ResultatElp> getResultatElpCollection() {
        return resultatElpCollection;
    }

    public void setResultatElpCollection(Collection<ResultatElp> resultatElpCollection) {
        this.resultatElpCollection = resultatElpCollection;
    }

    public Collection<ResultatVet> getResultatVetCollection() {
        return resultatVetCollection;
    }

    public void setResultatVetCollection(Collection<ResultatVet> resultatVetCollection) {
        this.resultatVetCollection = resultatVetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMen != null ? codMen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mention)) {
            return false;
        }
        Mention other = (Mention) object;
        if ((this.codMen == null && other.codMen != null) || (this.codMen != null && !this.codMen.equals(other.codMen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.appo.aporestws.entities.Mention[ codMen=" + codMen + " ]";
    }
    
}
