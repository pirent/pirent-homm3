package com.wordpress.pirent420.persist.impl;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.Query;

import com.wordpress.pirent420.model.Faction;
import com.wordpress.pirent420.persist.api.FactionDao;
import com.wordpress.pirent420.persist.api.JpaDao;

@Singleton
@Local(FactionDao.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JpaFactionDao extends JpaDao<Faction> implements FactionDao
{

	public JpaFactionDao()
	{
		super(Faction.class);
	}

	@Override
	public Faction getFactionByName(String name)
	{
		StringBuilder jpql = new StringBuilder("SELECT f FROM ").append(
				Faction.class.getSimpleName())
				.append(" f WHERE f.name = :name");
		
		Query query = em.createQuery(jpql.toString(), Faction.class);
		query.setParameter("name", name);
		
		return (Faction) query.getSingleResult();
	}

}
