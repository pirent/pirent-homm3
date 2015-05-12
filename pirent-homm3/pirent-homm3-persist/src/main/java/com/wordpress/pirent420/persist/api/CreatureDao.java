package com.wordpress.pirent420.persist.api;

import java.util.Collection;

import com.wordpress.pirent420.Creature;

public interface CreatureDao extends Dao<Creature>
{
	Collection<Creature> getCreatures (Collection<Integer> ids);
	
	Collection<Creature> getCreaturesByFaction (int factionId);
}