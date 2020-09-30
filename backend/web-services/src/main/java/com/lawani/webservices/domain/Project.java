package com.lawani.webservices.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Project name cannot be empty")
	private String projectName;
	@NotBlank(message = "Project Identifier cannot be empty")
	@Size(min = 5, max = 7, message = "Please use 5 to 7 characters")
    @Column(updatable = false, unique = true)
	private String projectIdentifier;
	@NotBlank(message = "Project description cannot be empty")

	private String projectDescription;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date projectStartDate;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date projectEndDate;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date projectDateCreated;
	@JsonFormat(pattern = "yyyy-mm-dd")
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
	protected void onCreate() {
		this.projectDateCreated = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.projectDateUpdated = new Date();
	}
}
