package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.GET_All_Classes_As_User;

public class GET_All_Classes_As_UserSteps {
    @Steps
    GET_All_Classes_As_User get_all_classes_for_user;

    @Given("user set valid GET all classes endpoint")
    public void userSetValidGETAllClassesEndpoint() {
        get_all_classes_for_user.setValidGETAllClassesEndpointAsUser();
    }

    @When("user send GET HTTP request with valid endpoint for all classes")
    public void userSendGETHTTPRequestWithValidEndpointForAllClasses() {
        get_all_classes_for_user.sendGETHTTPRequestWithValidEndpointForAllClassesAsUser();
    }

    @Then("user received valid GET HTTP response code {int} for all classes")
    public void userReceivedValidGETHTTPResponseCodeForAllClasses(int arg0) {
        get_all_classes_for_user.validateGETHTTPResponseCode200ForAllClassesAsUser();
    }

    @Given("user set invalid GET all classes endpoint")
    public void userSetInvalidGETAllClassesEndpoint() {
        get_all_classes_for_user.setInvalidGETAllClassesEndpointAsUser();
    }

    @When("user send GET HTTP request with invalid endpoint for all classes")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllClasses() {
        get_all_classes_for_user.sendGETHTTPRequestWithInvalidEndpointForAllClassesAsUser();
    }

    @Then("user received GET HTTP response code {int} for all classes")
    public void userReceivedGETHTTPResponseCodeForAllClasses(int arg0) {
        get_all_classes_for_user.validateGETHTTPResponseCode404ForAllClassesAsUser();
    }

    @When("user send GET HTTP request with invalid method for all classes")
    public void userSendGETHTTPRequestWithInvalidMethodForAllClasses() {
        get_all_classes_for_user.sendGETHTTPRequestWithInvalidMethodForAllClassesAsUser();
    }

    @Then("user received GET HTTP response code {int} Method Not Allowed for all classes")
    public void userReceivedGETHTTPResponseCodeMethodNotAllowedForAllClasses(int arg0) {
        get_all_classes_for_user.validateGETHTTPResponseCode405ForAllClassesAsUser();
    }
}
