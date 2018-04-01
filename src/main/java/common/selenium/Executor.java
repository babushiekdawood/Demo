package common.selenium;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by in.Babushaik on 4/17/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Test1.feature",tags={"@done"},format = {"pretty", "html:target/Destination"})

public class Executor {

    }


