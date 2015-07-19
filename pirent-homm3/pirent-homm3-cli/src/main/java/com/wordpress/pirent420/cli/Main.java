package com.wordpress.pirent420.cli;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.wordpress.pirent420.logic.api.RemoteCreatureService;
import com.wordpress.pirent420.logic.impl.CreatureServiceBean;
import com.wordpress.pirent420.model.Creature;

public class Main
{
	private static final String CML_SYNTAX = "java -jar pirent-homm3.jar [-OPTION]";

	public static void main(String[] args)
	{
		final CommandLineParser parser = new DefaultParser();
		final Options options = constructOptions();

		if (args.length < 1)
		{
			printUsage(CML_SYNTAX, options);
		}

		CommandLine cl = null;
		try
		{
			cl = parser.parse(options, args);
		}
		catch (ParseException e)
		{
			// FIXME
			System.err.println("Parsing got exception: " + e);
			System.exit(1);
		}

		processCommandLine(cl);

	}

	private static Options constructOptions()
	{
		final Options options = new Options();

		Option factionOpt = new Option("f", "faction", true,
				"Name of a specific faction");
		Option creatureOpt = new Option("c", "creature", true,
				"Name of a specific creature");

		options.addOption(factionOpt);
		options.addOption(creatureOpt);

		return options;
	}

	private static void printUsage(final String syntax, final Options options)
	{
		final HelpFormatter usageFormatter = new HelpFormatter();
		usageFormatter.printHelp(syntax, options);
	}

	private static void processCommandLine(final CommandLine cl)
			throws IllegalArgumentException
	{
		if (cl.hasOption("f") || cl.hasOption("faction"))
		{
			// TODO
			System.out.println("Got f");
		}
		if (cl.hasOption("c") || cl.hasOption("creature"))
		{
			// TODO
			System.out.println("@--- Got c");
			RemoteCreatureService creatureService = null;
			try
			{
				creatureService = lookupCreatureService();
			}
			catch (NamingException e)
			{
				System.err.println("Failed to lookup creature service: " + e);
				return;
			}
			
			if (creatureService == null) {
				System.err.println("Failed to lookup creature service!");
				return;
			}

			String unitName = cl.getOptionValue('c');
			Creature creature = creatureService.getCreature(unitName);
			if (creature == null) {
				System.out.println("@--- Creature " + unitName + " is not found");
			} else {
				System.out.println("@--- Found creature: " + creature);
			}
		}
	}
	
	private static RemoteCreatureService lookupCreatureService() throws NamingException {
		Properties properties = new Properties();
		properties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		final Context context = new InitialContext(properties);
		
		// TODO: make these things configurable
		// The ear name without suffix, could also be overridden in application.xml file
		final String appName = "pirent-homm3";
		// The jar name of EJB deployment
		final String moduleName = "pirent-homm3-logic-1.0-SNAPSHOT";
		// Each deployment could have distinct name
		final String distinctName = "";
		// The simple class name of bean implementation class
		final String beanName = CreatureServiceBean.class.getSimpleName();
		// The remote view fully qualified class name
		final String viewClassName = RemoteCreatureService.class.getName();
		
		// Do the lookup
		final String lookupName = "ejb:" + appName + "/" + moduleName + "/"
				+ distinctName + "/" + beanName + "!" + viewClassName;
		System.out.println("Abouting looking up: " + lookupName);

		return (RemoteCreatureService) context.lookup(lookupName);
	}
}
