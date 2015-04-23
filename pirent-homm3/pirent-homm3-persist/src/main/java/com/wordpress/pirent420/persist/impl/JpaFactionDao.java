package com.wordpress.pirent420.persist.impl;

import com.wordpress.pirent420.Faction;
import com.wordpress.pirent420.persist.api.FactionDao;
import com.wordpress.pirent420.persist.api.JpaDao;

public class JpaFactionDao extends JpaDao<Faction> implements FactionDao
{

	public JpaFactionDao()
	{
		super(Faction.class);
	}

}
