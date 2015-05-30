package com.wordpress.pirent420.persist.api;

import java.util.Collection;

import com.wordpress.pirent420.model.Faction;

public interface FactionDao extends Dao<Faction>
{
	Faction getFactionByName(String name);
	
	Collection<Faction> getAll();
}
