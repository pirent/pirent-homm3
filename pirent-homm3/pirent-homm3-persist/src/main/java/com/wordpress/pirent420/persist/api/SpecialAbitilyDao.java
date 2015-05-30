package com.wordpress.pirent420.persist.api;

import java.util.Collection;

import com.wordpress.pirent420.model.SpecialAbility;

public interface SpecialAbitilyDao extends Dao<SpecialAbility>
{
	Collection<SpecialAbility> getSpecialAbilities(int creatureId);
}
