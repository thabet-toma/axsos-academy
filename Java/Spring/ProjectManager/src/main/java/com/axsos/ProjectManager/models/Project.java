package com.axsos.ProjectManager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="projects")
public class Project {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotEmpty(message="Title is required!")
	    @Size(min=3, max=30, message="Title must be between 3 and 30 characters")
	    private String title;
	    @NotEmpty(message="description is required!")
	    @Size(min=3, max=30, message="discription must be between 3 and 30 characters")
	    private String description ;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date dueDate;
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="userCreator_id")
	    
	    private User userCreator;
	    @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "users_products", 
	        joinColumns = @JoinColumn(name = "product_id"), 
	        inverseJoinColumns = @JoinColumn(name = "user_id")
	    )
	    private List<User> involveUsers;
	   
		public Project() {
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getDueDate() {
			return dueDate;
		}
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}
		public User getUserCreator() {
			return userCreator;
		}
		public void setUserCreator(User userCreator) {
			this.userCreator = userCreator;
		}
		public List<User> getInvolveUsers() {
			return involveUsers;
		}
		public void setInvolveUsers(List<User> involveUsers) {
			this.involveUsers = involveUsers;
		}
		 @PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		    @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }

	    
}
