package com.axsos.SaveTravels.reopsitories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.SaveTravels.models.Travel;
@Repository
public interface TravelRepository extends CrudRepository<Travel, Long> {
public List <Travel> findAll();
}
