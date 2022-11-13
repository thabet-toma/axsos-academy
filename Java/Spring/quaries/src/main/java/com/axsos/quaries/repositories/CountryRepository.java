package com.axsos.quaries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.quaries.models.Country;
@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
      @Query(value = "select countries.name as Country, languages.language as Language,languages.percentage as Percentage from countries join languages on countries.id=languages.country_id WHERE languages.language = ?1 ORDER BY percentage DESC",nativeQuery = true)
    List<Object[]>findCountryByLanguage(String language);
    
@Query(value="select countries.name , count(cities.name) as cities from countries join cities on countries.id = cities.country_id  group by countries.id order by count(cities.name) desc ",nativeQuery = true)
List<Object[]>findCountryCityNumber();


@Query(value="select cities.name ,cities.population as cities from cities join countries on countries.id = cities.country_id  where cities.population>500000 and countries.name='Mexico' order by cities.population DESC ",nativeQuery = true)
 List<Object[]> population();
 @Query(value="select countries.name ,languages.language,languages.percentage from countries join languages on countries.id = languages.country_id  where languages.percentage>89  order by languages.percentage DESC ",nativeQuery = true)
 List<Object[]> per();
 @Query(value="select countries.name ,countries.surface_area ,countries.population  from countries  where countries.population>100000 and countries.surface_area<501  order by countries.population DESC ",nativeQuery = true)
 List<Object[]> sur();
 @Query(value="select countries.name ,countries.life_expectancy ,countries.surface_area  from countries  where countries.surface_area>200 and countries.life_expectancy<75 and government_form='Constitutional Monarchy'",nativeQuery = true)
 List<Object[]> life();
 @Query(value="select countries.name as country ,cities.name ,cities.district,cities.population  from countries join cities on countries.id = cities.country_id where countries.name='Argentina' and cities.district='Buenos Aires' and cities.population>500000 ",nativeQuery = true)
 List<Object[]> dis();
 @Query(value="select countries.region as region, count(countries.name)  from countries group by region order by count(countries.name)  ",nativeQuery = true)
 List<Object[]> num();

 
}



