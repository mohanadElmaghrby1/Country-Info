package com.mohannad.countrycode.repository;

import com.mohannad.countrycode.model.CountryEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * created by mohannad  on 25/10/19
 */
public interface CountryRepository extends CrudRepository<CountryEntity,String > {
    CountryEntity findByName(String name);
    CountryEntity findByCode(String code);
}
