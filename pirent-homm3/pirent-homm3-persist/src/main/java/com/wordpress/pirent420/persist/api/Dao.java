package com.wordpress.pirent420.persist.api;

import java.io.Serializable;
import java.util.Collection;

public interface Dao<E>
{

	void persist(E entity);

	void remove(E entity);

	E findById(Serializable id);

	/**
	 * Purge all entities of one kind.
	 */
	void purge();
	
	Collection<E> queryUsingJpql(String sqlString);
}