package com.wordpress.pirent420.persist.api;

import java.io.Serializable;

public interface Dao<E> {

	void persist(E entity);

	void remove(E entity);

	E findById(Serializable id);
}