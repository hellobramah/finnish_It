package com.lawani.webservices.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String projectName;
    private String projectIdentifier;
    private String projectDescription;
    private Date projectStartDate;
    private Date projectEndDate;

    private Date projectDateCreated;
    private Date projectDateUpdated;
    
    
    
    
    public Project() {
	
	}

    
    
    
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}




	public String getProjectIdentifier() {
		return projectIdentifier;
	}




	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}




	public String getProjectDescription() {
		return projectDescription;
	}




	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}




	public Date getProjectStartDate() {
		return projectStartDate;
	}




	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}




	public Date getProjectEndDate() {
		return projectEndDate;
	}




	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}




	public Date getProjectDateCreated() {
		return projectDateCreated;
	}




	public void setProjectDateCreated(Date projectDateCreated) {
		this.projectDateCreated = projectDateCreated;
	}




	public Date getProjectDateUpdated() {
		return projectDateUpdated;
	}




	public void setProjectDateUpdated(Date projectDateUpdated) {
		this.projectDateUpdated = projectDateUpdated;
	}




	@PrePersist
    protected void onCreate(){
        this.projectDateCreated = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.projectDateUpdated = new Date();
    }
}
