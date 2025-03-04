package self.haryaugust.jenkins.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class SpringJenkinsApplicationTests {
	private static final Logger logger = Logger.getLogger(SpringJenkinsApplication.class.getName());

	@Test
	void contextLoads() {
		logger.info("Test Case Executed ...");
    Assertions.assertTrue(true);
	}

}
