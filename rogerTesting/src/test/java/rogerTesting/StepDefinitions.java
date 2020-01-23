package rogerTesting;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;


class IsItFriday {
    static String isItFriday(String today) {
        return "Nope";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;
    private String expectedAnswer;

    @Given("workspace is prepped")
    public void workspace_is_prepped() {
        today = "Friday";
        //throw new io.cucumber.java.PendingException();
    }

    @When("Master and Slave are on same number")
    public void master_and_Slave_are_on_same_number() {
        actualAnswer = IsItFriday.isItFriday(today);
        //throw new io.cucumber.java.PendingException();
    }

    @Then("replication is complete")
    public void replication_is_complete() {
        expectedAnswer = "Nope";
        System.out.println(expectedAnswer);
        assertEquals(expectedAnswer, actualAnswer);
    }

}


