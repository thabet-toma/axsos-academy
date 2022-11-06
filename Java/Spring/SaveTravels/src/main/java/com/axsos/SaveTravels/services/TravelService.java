package com.axsos.SaveTravels.services;

import java.util.List;
import java.util.Optional;

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
public Travel findTravel(Long id) {
	Optional <Travel>optionalTravel=travelRepository.findById(id);
	if(optionalTravel.isPresent()) {
		return optionalTravel.get();}
		else {
			return null;
		}
	}
public Travel update(Travel t) {
	Optional <Travel>optionalTravel=travelRepository.findById(t.getId());
	if(optionalTravel.isPresent()) {
		Travel a=optionalTravel.get();
		a=t;
		return travelRepository.save(a);}
	
	else {
		return null;
	}
	}
public void deleteTravel(Long id) {
	Optional <Travel>optionalTravel=travelRepository.findById(id);
	if(optionalTravel.isPresent()) {
		travelRepository.delete(optionalTravel.get());
	}
}

}





