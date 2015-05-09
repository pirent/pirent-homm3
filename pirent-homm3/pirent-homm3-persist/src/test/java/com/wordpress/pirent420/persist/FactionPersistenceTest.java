package com.wordpress.pirent420.persist;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.ejb.EJB;

import junit.framework.Assert;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.wordpress.pirent420.Faction;
import com.wordpress.pirent420.persist.api.FactionDao;
import com.wordpress.pirent420.persist.impl.JpaFactionDao;

@RunWith(Arquillian.class)
public class FactionPersistenceTest
{

	@Deployment
	public static Archive<?> createDeployment()
	{
		WebArchive archive = ShrinkWrap
				.create(WebArchive.class, "faction_persistence_test.war")
				.addPackages(false, Faction.class.getPackage(),
						FactionDao.class.getPackage(),
						JpaFactionDao.class.getPackage())
				.addAsResource("test-persistence.xml",
						"META-INF/persistence.xml")
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");

		System.out.println(archive.toString(true));
		return archive;
	}

	private static final String[] FACTION_SAMPLES =
	{ "Castle", "Rampart", "Fortress", "Stronghold", "Tower", "Necropolis",
			"Inferno", "Conflux", "Dungeon" };

	@Before
	public void preparePersistenceTest()
	{
		clearData();
		insertData();
	}

	@EJB
	private FactionDao factionDao;

	@Test
	public void test()
	{
		String fetchAllFactionInJpql = "SELECT f FROM "
				+ Faction.class.getSimpleName() + " f";
		System.out.println("Selecting (using JPQL)");
		Collection<Faction> factions = factionDao
				.queryUsingJpql(fetchAllFactionInJpql);

		System.out.println("Found " + factions.size()
				+ " factions (using JPQL)");
		Assert.assertEquals(
				"Database entries number is not the same as sample size",
				FACTION_SAMPLES.length, factions.size());

		final Set<String> retrievedFactionNames = new HashSet<String>();
		for (Faction f : factions)
		{
			System.out.println("Retrieved: " + f);
			retrievedFactionNames.add(f.getName());
		}
		Assert.assertTrue("Database entries do not contain all faction names",
				retrievedFactionNames.containsAll(Arrays
						.asList(FACTION_SAMPLES)));
	}

	private void insertData()
	{
		System.out.println(">>> Insert sample data");
		System.out.println("--- Inserting records...");
		for (String name : FACTION_SAMPLES)
		{
			Faction f = new Faction(name);
			factionDao.persist(f);
		}
		System.out.println("<<< Insert sample data");
	}

	private void clearData()
	{
		System.out.println(">>> Purge sample data");
		factionDao.purge();
		System.out.println("<<< Purge sample data");
	}
}
