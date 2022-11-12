package com.axsos.ProjectManager.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.ProjectManager.models.Project;
import com.axsos.ProjectManager.models.User;
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	public List <Project> findAll();
    public List<Project> findByinvolveUsersNotContains(User user);
}
