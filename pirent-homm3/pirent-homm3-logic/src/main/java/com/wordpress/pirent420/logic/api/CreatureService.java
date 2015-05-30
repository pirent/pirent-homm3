package com.wordpress.pirent420.logic.api;

import java.util.Collection;

import com.wordpress.pirent420.model.Creature;

public interface CreatureService
{
	Creature getCreature(int id);
	
	Creature getCreature(String name);
	
	Collection<Creature> getCreatures(Collection<Integer> ids);
	
	Collection<Creature> getCreaturesByFaction(int factionId, Boolean isUpgraded);
}
