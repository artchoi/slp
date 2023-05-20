package slp.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import slp.CourseApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CourseApplication.class })
public class CucumberSpingConfiguration {}
