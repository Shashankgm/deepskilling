package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code)
            .orElseThrow(() -> new RuntimeException("Country not found with code: " + code));
    }

    @Override
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Override
    public void updateCountry(String code, String newName) {
        Country country = findCountryByCode(code);
        country.setName(newName);
        countryRepository.save(country);
    }

    @Override
    public void deleteCountry(String code) {
        Country country = findCountryByCode(code);
        countryRepository.delete(country);
    }

    @Override
    public List<Country> findCountriesByName(String partialName) {
        return countryRepository.findByNameContainingIgnoreCase(partialName);
    }
}