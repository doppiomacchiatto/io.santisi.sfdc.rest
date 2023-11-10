package sfdc.rest.io;

import io.micronaut.configuration.picocli.PicocliRunner;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "RestApi", description = "Salesforce Rest API Micronaut Utility", mixinStandardHelpOptions = true)
@Slf4j
public class RestApiCommand implements Runnable {

	@Option(names = { "-v", "--verbose" }, description = "...") // (3)
	boolean verbose;

	public static void main(String[] args) {
		log.info("Runner: ");
		int exitCode = PicocliRunner.execute(RestApiCommand.class, args);
		log.info("ExitCode: " + exitCode);
		System.exit(exitCode);
	}

	@Override
	public void run() {
		if (verbose) {
			log.info("Hi from CLI");
		}

	}

}