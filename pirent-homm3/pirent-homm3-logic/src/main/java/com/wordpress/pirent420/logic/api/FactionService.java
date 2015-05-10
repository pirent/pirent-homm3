package com.wordpress.pirent420.logic.api;

import java.util.Collection;

import com.wordpress.pirent420.Faction;

public interface FactionService
{
	Faction getFaction(int id);
	
	Collection<Faction> getFactions(Collection<Integer> ids);
}
