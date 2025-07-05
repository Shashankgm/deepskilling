package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Fetching 'IN' -> " + countryService.findCountryByCode("IN"));

        countryService.addCountry(new Country("XY", "Xyland"));
        System.out.println("Added XY");

        countryService.updateCountry("XY", "Xylophone Land");
        System.out.println("Updated XY");

        List<Country> countries = countryService.findCountriesByName("land");
        countries.forEach(System.out::println);

        countryService.deleteCountry("XY");
        System.out.println("Deleted XY");
    }
}