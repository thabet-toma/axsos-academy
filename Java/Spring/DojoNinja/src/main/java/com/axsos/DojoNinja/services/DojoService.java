package com.axsos.DojoNinja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.DojoNinja.models.Dojo;
import com.axsos.DojoNinja.models.Ninja;
import com.axsos.DojoNinja.repositories.DojoRepository;
import com.axsos.DojoNinja.repositories.NinjaRepository;

@Service
public class DojoService {
private final DojoRepository dojoRepository;
private final NinjaRepository ninjaRepository;


public DojoService(DojoRepository dojoRepository, NinjaRepository ninjaRepository) {
	super();
	this.dojoRepository = dojoRepository;
	this.ninjaRepository = ninjaRepository;
}
public List<Dojo> allDojos(){
	return dojoRepository.findAll();
}
public Dojo createDojo(Dojo t) {
return dojoRepository.save(t);}
public Dojo findDojo(Long id) {
	Optional <Dojo>optionalTravel=dojoRepository.findById(id);
	if(optionalTravel.isPresent()) {
		return optionalTravel.get();}
		else {
			return null;
		}
	}
public List<Ninja> allNinjas(){
	return ninjaRepository.findAll();
}
public Ninja createNinja(Ninja t) {
return ninjaRepository.save(t);}
public Ninja findNinja(Long id) {
	Optional <Ninja>optionalTravel=ninjaRepository.findById(id);
	if(optionalTravel.isPresent()) {
		return optionalTravel.get();}
		else {
			return null;
		}
	}
//public Travel update(Travel t) {
//	Optional <Travel>optionalTravel=travelRepository.findById(t.getId());
//	if(optionalTravel.isPresent()) {
//		Travel a=optionalTravel.get();
//		a=t;
//		return travelRepository.save(a);}
//	
//	else {
//		return null;
//	}
//	}
//public void deleteTravel(Long id) {
//	Optional <Travel>optionalTravel=travelRepository.findById(id);
//	if(optionalTravel.isPresent()) {
//		travelRepository.delete(optionalTravel.get());
//	}
}



