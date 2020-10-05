package com.lawani.webservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawani.webservices.domain.Project;
import com.lawani.webservices.exceptions.ProjectIdentifierException;
import com.lawani.webservices.repositories.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

    try {
    	project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
    	return projectRepository.save(project);
    }catch(Exception exception) {
    	throw new ProjectIdentifierException("The Project with ID '"+project.getProjectIdentifier().toUpperCase()+"' already exists");
    }

    }
    
    
    public Project findByProjectIdentifier(String projectIdentifier) {
    	Project project = projectRepository.findByProjectIdentifier(projectIdentifier);
    	if (project == null) {
        	throw new ProjectIdentifierException("The Project with ID '"+projectIdentifier.toUpperCase()+"' does not exist");
		}
    	return project;
    }
    
    public Iterable<Project> findAllProjects(){
    	return projectRepository.findAll();
    }

}

