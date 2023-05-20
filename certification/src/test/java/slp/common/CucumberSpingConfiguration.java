package slp.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import slp.CertificationApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CertificationApplication.class })
public class CucumberSpingConfiguration {}
