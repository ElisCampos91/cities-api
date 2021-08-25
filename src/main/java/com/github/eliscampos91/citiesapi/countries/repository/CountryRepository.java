package com.github.eliscampos91.citiesapi.countries.repository;

import com.github.eliscampos91.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
