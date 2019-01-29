package be.rbe.tracky;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/be/rbe/tracky/features/"},
        glue = "be.rbe.tracky.steps"
)
public class CucumberRunnerIT {
}
