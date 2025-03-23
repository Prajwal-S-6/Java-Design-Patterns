package com.company.intersegregation.before.service;

import java.util.List;

import com.company.intersegregation.before.entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);


	// lets say we created another service called OrderPersistenceService which implements this interface
	// then we are forcing that class to provide implementation for this method, but there is no name in Order
	// this fails interface segregation
	public List<T> findByName(String name);
}
