package com.mohannad.countrycode.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * created by mohannad  on 25/10/19
 */
public class CountrylanguageEntityPK implements Serializable {
    private String countrycode;
    private String language;

    @Column(name = "country_code")
    @Id
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Column(name = "language")
    @Id
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountrylanguageEntityPK that = (CountrylanguageEntityPK) o;
        return Objects.equals(countrycode, that.countrycode) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countrycode, language);
    }
}
