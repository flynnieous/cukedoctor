package com.github.cukedoctor.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by pestano on 28/02/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/calc.feature",
        format = {"json:target/calc.json"} )
public class CalcBdd {
}
