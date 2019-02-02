package be.rbe.tracky.hooks;

import be.rbe.tracky.database.TestRepository;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
    @Before
    public void beforeScenario() {
        TestRepository.init();
    }

    @After
    public void afterScenario() {
        TestRepository.clear();
    }
}
