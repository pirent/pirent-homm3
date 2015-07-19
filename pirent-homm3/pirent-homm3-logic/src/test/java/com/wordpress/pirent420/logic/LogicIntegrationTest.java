package com.wordpress.pirent420.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;

import junit.framework.Assert;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.wordpress.pirent420.logic.api.CreatureService;
import com.wordpress.pirent420.logic.api.FactionService;
import com.wordpress.pirent420.logic.api.SpecialAbilityService;
import com.wordpress.pirent420.logic.impl.CreatureServiceBean;
import com.wordpress.pirent420.model.Creature;
import com.wordpress.pirent420.model.Faction;
import com.wordpress.pirent420.model.SpecialAbility;
import com.wordpress.pirent420.persist.api.CreatureDao;
import com.wordpress.pirent420.persist.impl.JpaCreatureDao;

@RunWith(Arquillian.class)
public class LogicIntegrationTest
{

	private static final String FACTION_NAME = "Necropolis";

	private static final String[] NECROPOLIS_CREATURE_NAMES =
	{ "Skeleton", "Walking Dead", "Wight", "Vampire", "Lich", "Black Knight",
			"Bone Dragon" };

	private static final String[] FACTION_NAMES =
	{ "Castle", "Conflux", "Rampart", "Necropolis", "Stronghold", "Fortress",
			"Tower", "Inferno", "Dungeon" };

	@Deployment
	public static Archive<?> createDeployment()
	{

		WebArchive deployment = ShrinkWrap.create(WebArchive.class,
				"logic_integration_test.war");
		deployment.addPackages(false, CreatureService.class.getPackage(),
				CreatureServiceBean.class.getPackage(),
				Creature.class.getPackage(), CreatureDao.class.getPackage(),
				JpaCreatureDao.class.getPackage());
		deployment.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
		deployment.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml");

		System.out.println(deployment.toString(true));
		return deployment;
	}

	@EJB(mappedName = "java:module/CreatureServiceBean")
	private CreatureService creatureService;

	@EJB(mappedName = "java:app/logic_integration_test/FactionServiceBean!com.wordpress.pirent420.logic.api.FactionService")
	private FactionService factionService;
	
	@EJB(mappedName = "java:module/SpecialAbilityServiceBean")
	private SpecialAbilityService specialAbilityService;

	@Test
	public void testGetCreaturesByFaction()
	{
		Collection<Creature> unUpgradedNecroCreatures = getCreature(
				FACTION_NAME, Boolean.FALSE);

		Assert.assertEquals("The creature quantity must be the same",
				NECROPOLIS_CREATURE_NAMES.length,
				unUpgradedNecroCreatures.size());

		List<String> names = new ArrayList<String>();
		for (Creature c : unUpgradedNecroCreatures)
		{
			names.add(c.getName());
		}
		Assert.assertTrue("Must contain all creatures",
				names.containsAll(Arrays.asList(NECROPOLIS_CREATURE_NAMES)));
	}

	@Test
	public void testGetCreaturesById()
	{
		Collection<Creature> unUpgradedNecroCreatures = getCreature(
				FACTION_NAME, Boolean.FALSE);

		List<Integer> ids = new ArrayList<Integer>();
		for (Creature c : unUpgradedNecroCreatures)
		{
			ids.add(c.getId());
		}

		Collection<Creature> roundtrip = creatureService.getCreatures(ids);
		Assert.assertTrue("The creatures get back by ID should be the same",
				unUpgradedNecroCreatures.containsAll(roundtrip));
	}

	@Test
	public void testGetAllFactions()
	{
		Collection<Faction> factions = factionService.getAll();
		Assert.assertEquals("The faction size must be the same",
				FACTION_NAMES.length, factions.size());
	}
	
	@Test
	public void testGetSpecialAbilitiesByCreature()
	{
		final String griffinName = "Griffin";
		final String pikemanName = "Pikeman";
		
		Creature griffin = creatureService.getCreature(griffinName);
		Creature pikeman = creatureService.getCreature(pikemanName);
		
		Assert.assertNotNull("Griffin must be found", griffin);
		Assert.assertNotNull("Pikeman must be found", pikeman);
		
		Collection<SpecialAbility> griffinAbilities = specialAbilityService.getSpecialAbilities(griffin.getId());
		Collection<SpecialAbility> pikemanAbilities = specialAbilityService.getSpecialAbilities(pikeman.getId());
		
		Assert.assertTrue("Griffin must have special ability", !griffinAbilities.isEmpty());
		Assert.assertTrue("Pikeman must not have any special ability", pikemanAbilities.isEmpty());
	}

	/**
	 * Get the creatures of a specific faction.
	 * 
	 * @param factionName
	 *            name of faction
	 * @param isUpgraded
	 *            true to select upgraded creatures and vice versa. Leave it
	 *            NULL to select all.
	 * @return
	 */
	private Collection<Creature> getCreature(String factionName,
			Boolean isUpgraded)
	{
		Faction f = factionService.getFaction(FACTION_NAME);
		Assert.assertEquals("Name of faction is not the same", factionName,
				f.getName());

		Collection<Creature> creatures = creatureService.getCreaturesByFaction(
				f.getId(), isUpgraded);

		return creatures;
	}
}
