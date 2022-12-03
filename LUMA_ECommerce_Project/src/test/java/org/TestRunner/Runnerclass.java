package org.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="Features/Luma.feature",
		         glue="org.stepdefinition",
		         monochrome=true,
		         dryRun=false,
		         plugin={"html:report/WebReport","json:report/jsonreport.json"}
		         
		         )
public class Runnerclass {
                 
}