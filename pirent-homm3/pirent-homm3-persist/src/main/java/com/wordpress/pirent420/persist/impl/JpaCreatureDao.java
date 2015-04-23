package com.wordpress.pirent420.persist.impl;

import com.wordpress.pirent420.Creature;
import com.wordpress.pirent420.persist.api.CreatureDao;
import com.wordpress.pirent420.persist.api.JpaDao;

public class JpaCreatureDao extends JpaDao<Creature> implements CreatureDao
{

	public JpaCreatureDao()
	{
		super(Creature.class);
	}

	// TODO implement entity specific method
}