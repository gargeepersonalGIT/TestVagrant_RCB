package stepDefinitions;

import java.awt.*;
import java.io.IOException;

public class RCBForeignPlayerandWicketKeeperIdentification {
    @Given("RCB Json is launched")
    public void RCBForeignPlayerandWicketKeeperIdentification() throws InterruptedException, ConfigurationException, IOException {
        Thread.sleep(3000);

        home.theUserLaunchTheJson();
    }

    @When("IdentifyCountry")
    public void browsejson() throws InterruptedException {
        Thread.sleep(3000);
        home.IdentifyForeignPlayers();
    }

    @When("IdentifyWicketKeeper")
    public void browsejson() throws InterruptedException {
        Thread.sleep(3000);
        home.IdentifyWicketKeeper();
    }

    @And("TextNotIndia")
    public void checktextasIndia() throws InterruptedException {
        Thread.sleep(3000);
        home.TextNotIndia();
    }

    @And("TextWicketKeeper")
    public void checktextasWicketKeeper() throws InterruptedException {
        Thread.sleep(3000);
        home.TextWicketKeeper();
    }

    @Then("DeclareasForiegnPlayers")
    public void declareforeignplayers() throws InterruptedException, AWTException, ConfigurationException {
        Thread.sleep(3000);
        home.declareforiegnplayers();
    }

    @Then("DeclareasWicketKeeper")
    public void declarewicketkeeper() throws InterruptedException, AWTException, ConfigurationException {
        Thread.sleep(3000);
        home.declarewicketkeeper();
    }

}