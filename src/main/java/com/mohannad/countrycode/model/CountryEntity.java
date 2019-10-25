package com.mohannad.countrycode.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * created by mohannad  on 25/10/19
 */
@Entity
@Table(name = "country")
public class CountryEntity {
    private String code;
    private String name;
    private String continent;
    private String region;
    private float surfacearea;
    private Short indepyear;
    private int population;
    private Float lifeexpectancy;
    private BigDecimal gnp;
    private BigDecimal gnpold;
    private String localname;
    private String governmentform;
    private String headofstate;
    private String code2;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "continent")
    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "surface_area")
    public float getSurfacearea() {
        return surfacearea;
    }

    public void setSurfacearea(float surfacearea) {
        this.surfacearea = surfacearea;
    }

    @Basic
    @Column(name = "indep_year")
    public Short getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(Short indepyear) {
        this.indepyear = indepyear;
    }

    @Basic
    @Column(name = "population")
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Basic
    @Column(name = "life_expectancy")
    public Float getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(Float lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    @Basic
    @Column(name = "gnp")
    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    @Basic
    @Column(name = "gnp_old")
    public BigDecimal getGnpold() {
        return gnpold;
    }

    public void setGnpold(BigDecimal gnpold) {
        this.gnpold = gnpold;
    }

    @Basic
    @Column(name = "local_name")
    public String getLocalname() {
        return localname;
    }

    public void setLocalname(String localname) {
        this.localname = localname;
    }

    @Basic
    @Column(name = "government_form")
    public String getGovernmentform() {
        return governmentform;
    }

    public void setGovernmentform(String governmentform) {
        this.governmentform = governmentform;
    }

    @Basic
    @Column(name = "head_of_state")
    public String getHeadofstate() {
        return headofstate;
    }

    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate;
    }

    @Basic
    @Column(name = "code2")
    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return Float.compare(that.surfacearea, surfacearea) == 0 &&
                population == that.population &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(continent, that.continent) &&
                Objects.equals(region, that.region) &&
                Objects.equals(indepyear, that.indepyear) &&
                Objects.equals(lifeexpectancy, that.lifeexpectancy) &&
                Objects.equals(gnp, that.gnp) &&
                Objects.equals(gnpold, that.gnpold) &&
                Objects.equals(localname, that.localname) &&
                Objects.equals(governmentform, that.governmentform) &&
                Objects.equals(headofstate, that.headofstate) &&
                Objects.equals(code2, that.code2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, code2);
    }
}
