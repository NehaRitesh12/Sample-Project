package Runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = "src\\test\\resources\\Features\\GoogleSearchPage.feature",
		glue = {"StefDefs"},
		monochrome = true
)
public class GooglePageRunner extends AbstractTestNGCucumberTests {
   
  }

