package com.wordpress.pirent420.logic.api;

import java.util.Collection;

import com.wordpress.pirent420.Creature;

public interface CreatureService
{
	Creature getCreature(int id);
	
	Collection<Creature> getCreatures(Collection<Integer> ids);
	
	Collection<Creature> getCreaturesByFaction(int factionId);
}
