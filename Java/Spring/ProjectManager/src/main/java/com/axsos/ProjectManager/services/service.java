package com.axsos.ProjectManager.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;


import com.axsos.ProjectManager.models.LoginUser;
import com.axsos.ProjectManager.models.Project;
import com.axsos.ProjectManager.models.User;
import com.axsos.ProjectManager.repositories.ProjectRepository;
import com.axsos.ProjectManager.repositories.UserRepository;




@Service
public class service {
	
    private final UserRepository userRepo;
	
	private final ProjectRepository projectRepo;
	
    
    public service(UserRepository userRepo, ProjectRepository projectRepo) {
		super();
		this.userRepo = userRepo;
		this.projectRepo = projectRepo;
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
        public Project create(Project b ) {
        	
       	
       	return projectRepo.save(b);
       	
       }
       public List<Project> AllProjects(){
       	return projectRepo.findAll();
      }
       public Project findProject(Long id) {
       	Optional <Project> optional= projectRepo.findById(id);
        	if(optional.isPresent()) {
       	return optional.get();}
       	else {
       		return null;
       	}
       }

   public void updateProject( Project p) {
   	// TODO Auto-generated method stub
   	Optional <Project> optional=projectRepo.findById(p.getId());
	if(optional.isPresent()) {
   	Project a=optional.get();
   	p.setInvolveUsers(a.getInvolveUsers());
   	a=p;
   	projectRepo.save(a);}
   	
   }
   public void delete(Long id) {
	  
	    projectRepo.deleteById(id);
   	
	
   }
   public List <Project> ProectsNotJoined(User user){
	   return projectRepo.findByinvolveUsersNotContains(user);
   }
   public void leave(Project p,User user) {
	  Optional <User> user1=userRepo.findById(user.getId());
	  p.getInvolveUsers().remove(user1.get());
	  projectRepo.save(p);
	   
	   
   }
   public User findUserById(Long id) {
		Optional <User> optional=userRepo.findById(id);
		if( optional.isPresent()) {
		return optional.get();}
		else {
			return null;
		}
		
	}
  
}
    
    
