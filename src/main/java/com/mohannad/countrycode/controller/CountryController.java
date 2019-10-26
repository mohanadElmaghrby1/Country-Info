package com.mohannad.countrycode.controller;

import com.mohannad.countrycode.model.CountryEntity;
import com.mohannad.countrycode.model.CountryInfo;
import com.mohannad.countrycode.model.CountrylanguageEntity;
import com.mohannad.countrycode.service.CountryLanguageService;
import com.mohannad.countrycode.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
@RestController
public class CountryController {

    private CountryService countryService;
    private CountryLanguageService countryLanguageService;

    public CountryController(CountryService countryService, CountryLanguageService countryLanguageService) {
        this.countryService = countryService;
        this.countryLanguageService = countryLanguageService;
    }

    /***
     *
     * @param code country code
     * @return {@link CountryInfo} with all country official languages
     *
     */
    @GetMapping("/{code}")
    public CountryInfo getCountryInfo(@PathVariable String code){
        //load country info
        CountryEntity country = countryService.getCountry(code);
//        System.out.println("size:"+country.getLangs().size());
        //get all country official languages
        List<CountrylanguageEntity> allCountryLanguages = countryLanguageService.getAllCountryLanguages(code , true);

        //iterate throw languages and get only language
        ArrayList<String> allLangs=new ArrayList<>();
        for (CountrylanguageEntity lang:allCountryLanguages) {
            allLangs.add(lang.getLanguage());
        }
        //create a new CountryInfo contains country data with a list of official languages
        CountryInfo countryInfo = new CountryInfo(country.getName() , country.getContinent(),country.getPopulation()
                ,country.getLifeexpectancy(),allLangs);
        return countryInfo;
    }
}
