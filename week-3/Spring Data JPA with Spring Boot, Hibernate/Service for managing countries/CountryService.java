package com.cognizant.ormlearn.service;

import java.util.List;
import com.cognizant.ormlearn.model.Country;

public interface CountryService {
    Country findCountryByCode(String code);
    void addCountry(Country country);
    void updateCountry(String code, String newName);
    void deleteCountry(String code);
    List<Country> findCountriesByName(String partialName);
}