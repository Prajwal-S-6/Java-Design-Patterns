package com.company.intersegregation.after.service;

import com.company.intersegregation.after.entity.Entity;

import java.util.List;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
}
