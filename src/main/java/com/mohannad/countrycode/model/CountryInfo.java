package com.mohannad.countrycode.model;

import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
public class CountryInfo {
    private String name;
    private String continent;
    private int population;
    private float life_expectancy;
    private List<String> country_language;

    public CountryInfo(String name, String continent, int population, float life_expectancy, List<String> country_language) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.life_expectancy = life_expectancy;
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

    public float getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(float life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public List<String> getCountry_language() {
        return country_language;
    }

    public void setCountry_language(List<String> country_language) {
        this.country_language = country_language;
    }

    @Override
    public String toString() {
        return "CountryInfo{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", life_expectancy=" + life_expectancy +
                ", country_language=" + country_language +
                '}';
    }
}
