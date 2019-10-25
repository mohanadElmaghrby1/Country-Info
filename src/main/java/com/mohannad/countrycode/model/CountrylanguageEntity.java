package com.mohannad.countrycode.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * created by mohannad  on 25/10/19
 */
@Entity
@Table(name = "countrylanguage")
@IdClass(CountrylanguageEntityPK.class)
public class CountrylanguageEntity {
    private String countrycode;
    private String language;
    private boolean isofficial;
    private float percentage;

    @Id
    @Column(name = "country_code")
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Id
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "is_official")
    public boolean isIsofficial() {
        return isofficial;
    }

    public void setIsofficial(boolean isofficial) {
        this.isofficial = isofficial;
    }

    @Basic
    @Column(name = "percentage")
    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountrylanguageEntity that = (CountrylanguageEntity) o;
        return isofficial == that.isofficial &&
                Float.compare(that.percentage, percentage) == 0 &&
                Objects.equals(countrycode, that.countrycode) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countrycode, language, isofficial, percentage);
    }
}
