package com.wordpress.pirent420.persist.impl;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.Query;

import com.wordpress.pirent420.model.Creature;
import com.wordpress.pirent420.model.SpecialAbility;
import com.wordpress.pirent420.persist.api.JpaDao;
import com.wordpress.pirent420.persist.api.SpecialAbitilyDao;

@Singleton
@Local(SpecialAbitilyDao.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JpaSpecialAbilityDao extends JpaDao<SpecialAbility> implements
		SpecialAbitilyDao
{

	public JpaSpecialAbilityDao()
	{
		super(SpecialAbility.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<SpecialAbility> getSpecialAbilities(int creatureId)
	{
		StringBuilder jpql = new StringBuilder(
				"SELECT c.specialAbilities FROM ").append(
				Creature.class.getSimpleName()).append(" c WHERE c.id = :id");

		Query query = em.createQuery(jpql.toString());
		query.setParameter("id", creatureId);
		
		return query.getResultList();
	}

}
