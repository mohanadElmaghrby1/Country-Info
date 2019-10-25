package com.mohannad.countrycode.controller;

import com.mohannad.countrycode.model.CountryEntity;
import com.mohannad.countrycode.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by mohannad  on 25/10/19
 */
@RestController
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{code}")
    public CountryEntity getCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }
}
