package com.wordpress.pirent420.persist.impl;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.wordpress.pirent420.Faction;
import com.wordpress.pirent420.persist.api.FactionDao;
import com.wordpress.pirent420.persist.api.JpaDao;

@Stateless
@Local(FactionDao.class)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class JpaFactionDao extends JpaDao<Faction> implements FactionDao
{

	public JpaFactionDao()
	{
		super(Faction.class);
	}

}
