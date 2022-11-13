package com.axsos.quaries.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="countries")
public class Country {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, max = 20)
    private String name;
    @NotNull
    @Size(min = 2, max = 20)
    private String code;
    @NotNull
    private enum continent{
        Asia, Africa, NorthAmerica, SouthAmerica, Antarctica, Europe, Australia
    }
     @NotNull
    private String region;
    @NotNull
    private float surface_area;
    @NotNull
    private int indep_year;
    @NotNull
    private int population;
    @NotNull
    private float life_expectancy;
    @NotNull
    private float gnp;
    @NotNull
    private float gnp_old;
    @NotNull
    private String local_name;
    @NotNull
    private String government_form;
    @NotNull
    private String head_of_state;
    @NotNull
    private int capital;
    @NotNull
    private String code2;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @OneToMany(mappedBy="country", fetch=FetchType.LAZY)
    private List<Language> languages;
    
    @OneToMany(mappedBy="country", fetch=FetchType.LAZY)
    private List<City> cities;


    public Country() {
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	


	


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public float getSurface_area() {
		return surface_area;
	}


	public void setSurface_area(float surface_area) {
		this.surface_area = surface_area;
	}


	public int getIndep_year() {
		return indep_year;
	}


	public void setIndep_year(int indep_year) {
		this.indep_year = indep_year;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public float getLife_expectancy() {
		return life_expectancy;
	}


	public void setLife_expectancy(float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}


	public float getGnp() {
		return gnp;
	}


	public void setGnp(float gnp) {
		this.gnp = gnp;
	}


	public float getGnp_old() {
		return gnp_old;
	}


	public void setGnp_old(float gnp_old) {
		this.gnp_old = gnp_old;
	}


	public String getLocal_name() {
		return local_name;
	}


	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}


	public String getGovernment_form() {
		return government_form;
	}


	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}


	public String getHead_of_state() {
		return head_of_state;
	}


	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}


	public int getCapital() {
		return capital;
	}


	public void setCapital(int capital) {
		this.capital = capital;
	}


	public String getCode2() {
		return code2;
	}


	public void setCode2(String code2) {
		this.code2 = code2;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public List<Language> getLanguages() {
		return languages;
	}


	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}


	public List<City> getCities() {
		return cities;
	}


	public void setCities(List<City> cities) {
		this.cities = cities;
	}
    
}

