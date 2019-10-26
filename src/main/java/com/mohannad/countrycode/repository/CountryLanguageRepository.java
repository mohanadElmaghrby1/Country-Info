package com.mohannad.countrycode.repository;

import com.mohannad.countrycode.model.CountrylanguageEntity;
import com.mohannad.countrycode.model.CountrylanguageEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * created by mohannad  on 25/10/19
 */
public interface CountryLanguageRepository extends JpaRepository<CountrylanguageEntity , CountrylanguageEntityPK> {

    List<CountrylanguageEntity> findByCountrycodeAndIsofficial(String countryCode, boolean isOfficial);
}
