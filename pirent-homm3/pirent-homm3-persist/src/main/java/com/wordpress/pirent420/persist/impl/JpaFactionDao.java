package com.wordpress.pirent420.persist.impl;

import javax.ejb.Local;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.wordpress.pirent420.Faction;
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

}
