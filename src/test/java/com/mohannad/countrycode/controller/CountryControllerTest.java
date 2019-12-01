package com.mohannad.countrycode.controller;

import com.mohannad.countrycode.model.CountryEntity;
import com.mohannad.countrycode.model.CountryInfo;
import com.mohannad.countrycode.service.CountryLanguageService;
import com.mohannad.countrycode.service.CountryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CountryControllerTest {


    CountryController countryController;
    @Mock
    CountryLanguageService countryLanguageService;

    @Mock
    CountryService countryService;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        countryController =new CountryController(countryService,countryLanguageService);

    }

    @Test
    void testCountryInfo() {
        CountryEntity countryEntity =new CountryEntity();
        countryEntity.setCode("ABC");
        countryEntity.setName("ABCcountry");
        when(countryService.getCountry(any())).thenReturn(countryEntity);
        CountryInfo afgCountry = countryController.getCountryInfo("AFG");
        //check not null
        assertNotNull(afgCountry);

        //check the returned name
        assertEquals("ABCcountry" ,afgCountry.getName() );
    }


    @Test
    void tesNotExistentCountryInfo() {
        when(countryService.getCountry(any())).thenThrow(new EntityNotFoundException());
        Executable executable = () -> countryController.getCountryInfo("adadaf");
        assertThrows(EntityNotFoundException.class , executable);
    }

}