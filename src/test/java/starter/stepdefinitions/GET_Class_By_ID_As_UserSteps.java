package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.GET_Class_By_ID_As_User;

public class GET_Class_By_ID_As_UserSteps {
    @Steps
    GET_Class_By_ID_As_User get_class_by_id_as_user;

    @Given("user set valid GET class by ID endpoint")
    public void userSetValidGETClassByIDEndpoint() {
        get_class_by_id_as_user.setValidGETClassByIDEndpointAsUser();
    }

    @When("user send GET HTTP request with valid endpoint for class by ID")
    public void userSendGETHTTPRequestWithValidEndpointForClassByID() {
        get_class_by_id_as_user.sendGETHTTPRequestWithValidEndpointForClassByIDAsUser();
    }

    @Then("user received valid GET HTTP response code {int} for class by ID")
    public void userReceivedValidGETHTTPResponseCodeForClassByID(int arg0) {
        get_class_by_id_as_user.validateGETHTTPResponseCode200ForClassByIDAsUser();
    }

    @Given("user set invalid GET class by ID endpoint")
    public void userSetInvalidGETClassByIDEndpoint() {
        get_class_by_id_as_user.setInvalidGETClassByIDEndpointAsUser();
    }

    @When("user send GET HTTP request with invalid endpoint for class by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForClassByID() {
        get_class_by_id_as_user.sendGETHTTPRequestWithInvalidEndpointForClassByIDAsUser();
    }

    @Then("user received GET HTTP response code {int} for class by ID")
    public void userReceivedGETHTTPResponseCodeForClassByID(int arg0) {
        get_class_by_id_as_user.validateGETHTTPResponseCode404ForClassByIDAsUser();
    }

    @When("user send GET HTTP request with invalid method for class by ID")
    public void userSendGETHTTPRequestWithInvalidMethodForClassByID() {
        get_class_by_id_as_user.sendGETHTTPRequestWithInvalidMethodForClassByIDAsUser();
    }

    @Then("user received GET HTTP response code {int} Method Not Allowed for class by ID")
    public void userReceivedGETHTTPResponseCodeMethodNotAllowedForClassByID(int arg0) {
        get_class_by_id_as_user.validateGETHTTPResponseCode405ForClassByIDAsUser();
    }

    @Given("user set valid GET class by ID endpoint with invalid ID")
    public void userSetValidGETClassByIDEndpointWithInvalidID() {
        get_class_by_id_as_user.setValidGETClassByIDEndpointWithInvalidIDAsUser();
    }

    @When("user send GET HTTP request with invalid ID for class by ID")
    public void userSendGETHTTPRequestWithInvalidIDForClassByID() {
        get_class_by_id_as_user.sendGETHTTPRequestWithInvalidIDForClassByIDAsUser();
    }
}
