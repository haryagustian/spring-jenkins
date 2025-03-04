package self.haryaugust.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {
	private static final Logger logger = Logger.getLogger(SpringJenkinsApplication.class.getName());

	public void init ()
	{
		logger.info("Application Started ...");
	}

	public static void main(String[] args) {
		logger.info("Application Executed START ...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		logger.info("Application Executed END ...");
	}

}
