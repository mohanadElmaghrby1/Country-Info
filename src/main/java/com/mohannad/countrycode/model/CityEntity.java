package com.mohannad.countrycode.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * created by mohannad  on 25/10/19
 */
@Entity
@Table(name = "city")
public class CityEntity {
    private int id;
    private String name;
    private String countrycode;
    private String district;
    private int population;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "country_code")
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "population")
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntity that = (CityEntity) o;
        return id == that.id &&
                population == that.population &&
                Objects.equals(name, that.name) &&
                Objects.equals(countrycode, that.countrycode) &&
                Objects.equals(district, that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countrycode, district, population);
    }
}
