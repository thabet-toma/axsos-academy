package com.axsos.Language.servises;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.Language.models.language;
import com.axsos.Language.repositories.LanguageRepository;

@Service

public class LanguageServise {
	private final LanguageRepository languageRepository;

	
	
	public LanguageServise(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}
	public List<language> allLanguage(){
		return languageRepository.findAll();
	}
	public language createExpense(language t) {
	return languageRepository.save(t);}
	public language findTravel(Long id) {
		Optional <language>optionalTravel=languageRepository.findById(id);
		if(optionalTravel.isPresent()) {
			return optionalTravel.get();}
			else {
				return null;
			}
		}
	public language update(language t) {
		Optional <language>optionalTravel=languageRepository.findById(t.getId());
		if(optionalTravel.isPresent()) {
			language a=optionalTravel.get();
			a=t;
			return languageRepository.save(a);}
		
		else {
			return null;
		}
		}
	public void deleteTravel(Long id) {
		Optional <language>optionalTravel=languageRepository.findById(id);
		if(optionalTravel.isPresent()) {
			languageRepository.delete(optionalTravel.get());
		}
	}

}
