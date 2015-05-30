package com.wordpress.pirent420.logic.impl;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import com.wordpress.pirent420.logic.api.SpecialAbilityService;
import com.wordpress.pirent420.model.SpecialAbility;
import com.wordpress.pirent420.persist.api.SpecialAbitilyDao;

@Stateless
@Local(SpecialAbilityService.class)
public class SpecialAbilityServiceBean implements SpecialAbilityService
{
	@EJB
	private SpecialAbitilyDao specialAbilityDao;

	@Override
	public Collection<SpecialAbility> getSpecialAbilities(int creatureId)
	{
		return specialAbilityDao.getSpecialAbilities(creatureId);
	}

}
