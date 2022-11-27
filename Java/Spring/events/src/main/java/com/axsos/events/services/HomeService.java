package com.axsos.events.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.events.models.Event;
import com.axsos.events.models.LoginUser;
import com.axsos.events.models.User;
import com.axsos.events.repositories.EventRepository;
import com.axsos.events.repositories.UserRepository;




@Service
public class HomeService {
	 private final UserRepository userRepo;
	 private final EventRepository eventRepo;
	 
	public HomeService(UserRepository userRepo, EventRepository eventRepo) {
		
		this.userRepo = userRepo;
		this.eventRepo = eventRepo;
	}

	public User register(User newUser, BindingResult result) { 
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            return userRepo.save(newUser);
        }
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Unknown email!");
            return null;
        }
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }}
    public User findUserById(Long id) {
		Optional <User> optional=userRepo.findById(id);
		if( optional.isPresent()) {
		return optional.get();}
		else {
			return null;
		}}
		public List<Event> EventMyloc(String str){
			return eventRepo.findBylocation(str);
		}
		public List<Event> EventNotloc(String str){
			return eventRepo.findBylocationNotContains(str);
		}
		public Event createEvent(Event event) {
			return eventRepo.save(event);
		}
		public Event findProject(Long id) {
			Optional <Event> optional=eventRepo.findById(id);
			if( optional.isPresent()) {
			return optional.get();}
			else {
				return null;
			}}

		}
	

