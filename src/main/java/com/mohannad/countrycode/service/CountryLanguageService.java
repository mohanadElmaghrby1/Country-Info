package com.mohannad.countrycode.service;

import com.mohannad.countrycode.model.CountrylanguageEntity;

import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
public interface CountryLanguageService {
    List<CountrylanguageEntity> getAllCountryLanguages(String countryCode,boolean isOfficial);
}
