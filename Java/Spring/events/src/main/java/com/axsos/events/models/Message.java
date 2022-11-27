package com.axsos.events.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="messages")
public class Message {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotEmpty(message="message is required!")
	    @Size(min=3, max=30, message="message  must be between 3 and 30 characters")
	    private String message;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="userCreator_id")
	    
	    private User userCreatorMessage;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="event_id")
	    
	    private User event;
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
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
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public User getUserCreatorMessage() {
			return userCreatorMessage;
		}
		public void setUserCreatorMessage(User userCreatorMessage) {
			this.userCreatorMessage = userCreatorMessage;
		}
		public User getEvent() {
			return event;
		}
		public void setEvent(User event) {
			this.event = event;
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
		public Message() {
			
		}
	    
}
