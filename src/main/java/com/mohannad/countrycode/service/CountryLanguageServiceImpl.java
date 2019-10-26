package com.mohannad.countrycode.service;

import com.mohannad.countrycode.model.CountrylanguageEntity;
import com.mohannad.countrycode.repository.CountryLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
@Service
public class CountryLanguageServiceImpl implements CountryLanguageService {

    private CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageServiceImpl(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    @Override
    public List<CountrylanguageEntity> getAllCountryLanguages(String countryCode , boolean isOfficial) {
        return countryLanguageRepository.findByCountrycodeAndIsofficial(countryCode,isOfficial);
    }
}
