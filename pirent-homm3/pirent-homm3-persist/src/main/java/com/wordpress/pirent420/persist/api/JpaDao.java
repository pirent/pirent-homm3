package com.wordpress.pirent420.persist.api;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class JpaDao<E> implements Dao<E>
{

	protected Class<E> entityClass;

	@PersistenceContext
	protected EntityManager em;

	public JpaDao(Class<E> entityClass)
	{
		this.entityClass = entityClass;
	}

	@Override
	public void persist(E entity)
	{
		em.persist(entity);
	}

	@Override
	public void remove(E entity)
	{
		em.remove(entity);
	}

	@Override
	public E findById(Serializable id)
	{
		return (E) em.find(entityClass, id);
	}

	@Override
	public void purge()
	{
		em.createQuery("DELETE FROM " + entityClass.getSimpleName())
				.executeUpdate();
	}

	@Override
	public Collection<E> queryUsingJpql(String sqlString)
	{
		return em.createQuery(sqlString, entityClass).getResultList();
	}

}