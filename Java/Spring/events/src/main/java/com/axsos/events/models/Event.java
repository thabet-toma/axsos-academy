package com.axsos.events.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="events")
public class Event {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotEmpty(message="Event Name is required!")
	    @Size(min=3, max=30, message="Event name  must be between 3 and 30 characters")
	    private String name;
	   
	    private String location;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date date;
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
	        name = "users_events", 
	        joinColumns = @JoinColumn(name = "event_id"), 
	        inverseJoinColumns = @JoinColumn(name = "user_id")
	    )
	    private List<User> involveUsers;
	    @OneToMany(mappedBy="event",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Message> message;
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
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
		public List<Message> getMessage() {
			return message;
		}
		public void setMessage(List<Message> message) {
			this.message = message;
		}
		public Event() {
			
		}
	    
}
