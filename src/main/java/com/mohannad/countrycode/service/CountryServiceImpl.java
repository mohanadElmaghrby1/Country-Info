package com.mohannad.countrycode.service;

import com.mohannad.countrycode.model.CountryEntity;
import com.mohannad.countrycode.model.CountrylanguageEntity;
import com.mohannad.countrycode.repository.CountryLanguageRepository;
import com.mohannad.countrycode.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public CountryEntity getCountry(String code) {
        return countryRepository.findByCode(code);
    }

}
