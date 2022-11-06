package com.axsos.Language.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="travel")
public class language {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 20)
	    private String name;
	   
	    @NotNull
	    @Size(min = 2, max = 20)
	    private String creator;
	    @NotNull
	   
	    private Double currentVersion;
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
		public language() {
			
		}
		public language(Long id, String name,
				 String creator, Double currentVersion) {
			
			this.id = id;
			this.name = name;
			this.creator = creator;
			this.currentVersion = currentVersion;
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
		public String getCreator() {
			return creator;
		}
		public void setCreator(String creator) {
			this.creator = creator;
		}
		public Double getCurrentVersion() {
			return currentVersion;
		}
		public void setCurrentVersion(Double currentVersion) {
			this.currentVersion = currentVersion;
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
