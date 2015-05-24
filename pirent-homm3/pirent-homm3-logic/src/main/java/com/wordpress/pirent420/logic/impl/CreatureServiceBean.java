package com.wordpress.pirent420.logic.impl;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.wordpress.pirent420.logic.api.CreatureService;
import com.wordpress.pirent420.model.Creature;
import com.wordpress.pirent420.persist.api.CreatureDao;

@Stateless
@Local(CreatureService.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class CreatureServiceBean implements CreatureService
{
	@EJB
	private CreatureDao creatureDao;
	
	public Creature getCreature(int id)
	{
		return creatureDao.findById(id);
	}

	public Collection<Creature> getCreatures(Collection<Integer> ids)
	{
		return creatureDao.getCreatures(ids);
	}

	public Collection<Creature> getCreaturesByFaction(int factionId, Boolean isUpgraded)
	{
		return creatureDao.getCreaturesByFaction(factionId, isUpgraded);
	}

}
