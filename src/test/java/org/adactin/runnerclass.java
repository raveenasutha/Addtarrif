package org.adactin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Features"},
glue= {"hexa.stepdefinition"},dryRun=true,
		monochrome=true,tags= {"@regression","@smoke"},
		plugin= {"html:target", "rerun:src/test/resources/failed.txt"} )
public class runnerclass {
	


}
