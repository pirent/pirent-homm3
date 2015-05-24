package com.wordpress.pirent420.logic.api;

import java.util.Collection;

import com.wordpress.pirent420.model.SpecialAbility;

public interface SpecialAbilityService
{
	Collection<SpecialAbility> getSpecialAbilities(int creatureId);
}
