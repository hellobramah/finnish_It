package com.lawani.webservices.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.lawani.webservices.domain.Project;
import com.lawani.webservices.repositories.ProjectRepository;

public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project saveOrUpdateProject(Project project) {

		return projectRepository.save(project);
	}
}
