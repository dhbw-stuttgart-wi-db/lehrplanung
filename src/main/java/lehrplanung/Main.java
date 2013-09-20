package lehrplanung;

import java.sql.SQLException;

import jdbc.JdbcAccess;
import lehrplanung.api.Lehrplanung;
import lehrplanung.api.Studiengang;
import lehrplanung.api.impl.LehrplanungImpl;
import logging.LoggingConfiguration;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.slf4j.LoggerFactory;

public class Main {
	static org.slf4j.Logger log;

	static {
		LoggingConfiguration.configureLog4JFromClasspath();
	}

	public static void main(String[] args) {
		log = LoggerFactory.getLogger(Main.class);
		final CommandLineOptions options = parseCmdLineOptions(args);
		LoggingConfiguration.setLog4RootLogLevel(options);
		log.debug("Startup");

		try {
			log.debug("Connecting to {} as {}", options.databaseJdbcUrl, options.databaseUsername);

			JdbcAccess mySql = new JdbcAccess(options.databaseJdbcUrl, options.databaseUsername,
					options.databasePassword);

			mySql.connect();
			Lehrplanung lehrplanung = new LehrplanungImpl(mySql);

			for (Studiengang s : lehrplanung.getStudiengaenge())
				log.info("Studiengang: {} ({})", s.getName(), s.getKurzbezeichnung());

			mySql.disconnect();

		} catch (SQLException ex) {
			log.error("SQLException: " + ex, ex.getMessage());
			log.error("SQLState: " + ex, ex.getSQLState());
			log.error("VendorError: " + ex, ex.getErrorCode());

		} catch (Exception ex) {
			log.error("Exception: " + ex, ex.getMessage());
		}

		log.debug("Shutdown");
	}

	private static CommandLineOptions parseCmdLineOptions(final String[] args) {
		CommandLineOptions options = new CommandLineOptions();
		CmdLineParser parser = new CmdLineParser(options);

		try {
			parser.parseArgument(args);
			if (options.help)
				printHelpAndExit(parser);
		} catch (CmdLineException e) {
			System.err.println(e.getMessage());
			printHelpAndExit(parser);
		}

		return options;
	}

	private static void printHelpAndExit(CmdLineParser parser) {
		System.err.print("Usage: java " + Main.class.getCanonicalName());
		parser.printSingleLineUsage(System.err);
		System.err.println();
		parser.printUsage(System.err);
		System.exit(1);
	}

}
