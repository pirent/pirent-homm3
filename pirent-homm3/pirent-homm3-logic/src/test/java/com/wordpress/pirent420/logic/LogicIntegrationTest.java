package com.wordpress.pirent420.logic;

import java.io.File;
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
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.wordpress.pirent420.logic.api.CreatureService;
import com.wordpress.pirent420.logic.api.FactionService;
import com.wordpress.pirent420.logic.impl.CreatureServiceBean;
import com.wordpress.pirent420.model.Creature;
import com.wordpress.pirent420.model.Faction;
import com.wordpress.pirent420.persist.api.CreatureDao;
import com.wordpress.pirent420.persist.impl.JpaCreatureDao;

@RunWith(Arquillian.class)
public class LogicIntegrationTest
{

	private static final String FACTION_NAME = "Necropolis";

	private static final String[] NECROPOLIS_CREATURE_NAMES =
	{ "Skeleton", "Walking Dead", "Wight", "Vampire", "Lich", "Black Knight",
			"Bone Dragon" };

//	private static final String[] DEPLOYMENT_LIBS =
//	{ "com.wordpress.pirent420:pirent-homm3-model:1.0-SNAPSHOT",
//			"com.wordpress.pirent420:pirent-homm3-persist:1.0-SNAPSHOT" };

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
		deployment.addAsResource("persistence.xml", "META-INF/persistence.xml");

//		File[] libs = Maven.configureResolver().withClassPathResolution(false)
//				.resolve(DEPLOYMENT_LIBS).withoutTransitivity().asFile();
//		for (File f : libs)
//		{
//			deployment.addAsLibrary(f);
//		}

		System.out.println(deployment.toString(true));
		return deployment;
	}

	@EJB(mappedName = "java:app/logic_integration_test/JpaFactionDao!com.wordpress.pirent420.persist.api.FactionDao")
	private CreatureService creatureService;

	@EJB(mappedName = "java:app/logic_integration_test/FactionServiceBean!com.wordpress.pirent420.logic.api.FactionService")
	private FactionService factionService;

	@Test
	public void testGetCreaturesByFaction()
	{
		Faction f = factionService.getFaction(FACTION_NAME);
		Assert.assertEquals("Name of faction is not the same", FACTION_NAME,
				f.getName());

		Collection<Creature> unUpgradedNecroCreatures = creatureService
				.getCreaturesByFaction(f.getId(), Boolean.FALSE);

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
}
