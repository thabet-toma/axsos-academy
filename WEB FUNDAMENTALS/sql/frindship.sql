-- 1
SELECT countries.name ,languages.language, languages.percentage from countries join languages 
on countries.id=languages.country_id where languages.language="Slovene" ORDER BY percentage DESC;
-- 2 
SELECT countries.name ,count(cities.id) cities FROM countries join cities on countries.id=cities.country_id
 group by countries.id
 order by count(cities.id) DESC;
 -- 3

 SELECT cities.name ,cities.population,countries.id from countries
 join cities on countries.id= country_id where countries.name="Mexico" and cities.population>500000
 order by population desc;
 -- 4
 SELECT countries.name lang