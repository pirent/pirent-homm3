package com.wordpress.pirent420.persist.impl;

import com.wordpress.pirent420.SpecialAbility;
import com.wordpress.pirent420.persist.api.JpaDao;
import com.wordpress.pirent420.persist.api.SpecialAbitilyDao;

public class JpaSpecialAbilityDao extends JpaDao<SpecialAbility> implements
		SpecialAbitilyDao
{

	public JpaSpecialAbilityDao()
	{
		super(SpecialAbility.class);
	}

}
