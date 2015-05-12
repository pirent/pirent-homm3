package com.wordpress.pirent420.persist.impl;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.Query;

import com.wordpress.pirent420.Creature;
import com.wordpress.pirent420.persist.api.CreatureDao;
import com.wordpress.pirent420.persist.api.JpaDao;

@Singleton
@Local(CreatureDao.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JpaCreatureDao extends JpaDao<Creature> implements CreatureDao
{

	public JpaCreatureDao()
	{
		super(Creature.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Creature> getCreatures(Collection<Integer> ids)
	{
		StringBuilder sb = new StringBuilder("SELECT c FROM ").append(
				Creature.class.getSimpleName()).append(
				" c WHERE c.id IN (:creatureIds)");

		Query query = em.createQuery(sb.toString());
		query.setParameter("creatureIds", ids);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Creature> getCreaturesByFaction(int factionId)
	{
		StringBuilder jqlString = new StringBuilder("SELECT c FROM ").append(
				Creature.class.getSimpleName()).append(
				" c WHERE c.faction.id = :factionId");

		Query query = em.createQuery(jqlString.toString());
		query.setParameter("factionId", factionId);

		return query.getResultList();
	}

}