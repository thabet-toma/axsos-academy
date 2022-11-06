package com.axsos.SaveTravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.SaveTravels.models.Travel;
import com.axsos.SaveTravels.reopsitories.TravelRepository;

@Service

public class TravelService {
private final TravelRepository travelRepository;

public TravelService(TravelRepository travelRepository) {
	
	this.travelRepository = travelRepository;
}
public List<Travel> allExpence(){
	return travelRepository.findAll();
}
public Travel createExpense(Travel t) {
return travelRepository.save(t);}



}
