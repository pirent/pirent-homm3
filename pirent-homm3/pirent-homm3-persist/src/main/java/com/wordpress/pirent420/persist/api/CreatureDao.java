package com.wordpress.pirent420.persist.api;

import java.util.Collection;

import com.wordpress.pirent420.model.Creature;

public interface CreatureDao extends Dao<Creature>
{
	Creature getCreature(String name);
	
	Collection<Creature> getCreatures (Collection<Integer> ids);
	
	Collection<Creature> getCreaturesByFaction (Integer factionId, Boolean isUpgraded);
}