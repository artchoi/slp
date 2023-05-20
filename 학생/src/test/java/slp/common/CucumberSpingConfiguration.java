package slp.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import slp.학생Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 학생Application.class })
public class CucumberSpingConfiguration {}
