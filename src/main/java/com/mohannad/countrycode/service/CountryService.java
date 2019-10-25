package com.mohannad.countrycode.service;


import com.mohannad.countrycode.model.CountryEntity;

/**
 * created by mohannad  on 25/10/19
 */
public interface CountryService {

    CountryEntity getCountry(String code);

}
