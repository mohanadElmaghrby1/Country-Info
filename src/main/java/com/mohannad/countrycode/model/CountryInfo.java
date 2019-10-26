package com.mohannad.countrycode.model;

import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
public class CountryInfo {
    private String name;
    private String continent;
    private int population;
    private List<String> country_language;

    public CountryInfo(String name, String continent, int population, List<String> country_language) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.country_language = country_language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<String> getCountry_language() {
        return country_language;
    }

    public void setCountry_language(List<String> country_language) {
        this.country_language = country_language;
    }
}
