package com.wordpress.pirent420.logic.api;

import java.util.Collection;

import com.wordpress.pirent420.model.Faction;

public interface FactionService
{
	Faction getFaction(int id);
	
	Faction getFaction(String name);
	
	Collection<Faction> getFactions(Collection<Integer> ids);
}
