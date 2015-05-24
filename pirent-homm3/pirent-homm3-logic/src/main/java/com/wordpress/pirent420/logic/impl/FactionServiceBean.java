package com.wordpress.pirent420.logic.impl;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.wordpress.pirent420.logic.api.FactionService;
import com.wordpress.pirent420.model.Faction;
import com.wordpress.pirent420.persist.api.FactionDao;

@Stateless
@Local(FactionService.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FactionServiceBean implements FactionService
{

	@EJB
	private FactionDao factionDao;
	
	@Override
	public Faction getFaction(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Faction getFaction(String name)
	{
		return factionDao.getFactionByName(name);
	}

	@Override
	public Collection<Faction> getFactions(Collection<Integer> ids)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
