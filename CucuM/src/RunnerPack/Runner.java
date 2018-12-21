package RunnerPack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java_examples\\Java Basics\\src\\CucuM\\Features\\DemoFe.feature", glue = {"stepPack"})
public class Runner {

}
