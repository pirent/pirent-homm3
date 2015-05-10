package com.wordpress.pirent420.persist.impl;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

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

	// TODO implement entity specific method
}