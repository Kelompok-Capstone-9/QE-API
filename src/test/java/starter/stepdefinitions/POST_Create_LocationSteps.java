package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Locations.POST_Create_Location;

public class POST_Create_LocationSteps {
    @Steps
    POST_Create_Location postCreateLocation;
    @When("user set valid POST create Location endpoint")
    public void userSetValidPOSTCreateLocationEndpoint() {
        postCreateLocation.setValidPOSTCreateEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for create Location")
    public void userSendPOSTHTTPRequestWithValidEndpointForCreateLocation() {
        postCreateLocation.sendPOSTHTTPRequestWithValidEndpointForCreateLocation();
    }

    @Then("user received POST HTTP response code {int} for create Location")
    public void userReceivedPOSTHTTPResponseCodeForCreateLocation(int arg0) {
        postCreateLocation.validateHTTPResponseCode400ForCreateLocation();
    }

    @When("user set invalid POST create Location endpoint")
    public void userSetInvalidPOSTCreateLocationEndpoint() {
        postCreateLocation.setInvalidPOSTcreateEndpoint();
    }

    @And("user send POST HTTP request with invalid endpoint for create Location")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateLocation() {
        postCreateLocation.sendPOSTHTTPRequestWithInvalidEndpointForCreateLocation();
    }

    @Then("user received POST HTTP responses code {int} for create Location")
    public void userReceivedPOSTHTTPResponsesCodeForCreateLocation(int arg0) {
        postCreateLocation.validateHTTPResponseCode404ForCreateLocation();

    }

    @And("user send POST HTTP request with invalid method for create Location")
    public void userSendPOSTHTTPRequestWithInvalidMethodForCreateLocation() {
        postCreateLocation.sendPOSTHTTPRequestWithInvalidMethodForCreateLocation();
    }

    @And("user send POST HTTP request with empty request body for create Location")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForCreateLocation() {
        postCreateLocation.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateLocation();
    }

    @And("user send POST HTTP request with invalid request body for create Location")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocation() {
        postCreateLocation.sendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocation();
    }

    @Then("user received valid POST HTTP response code {int} for create Location")
    public void userReceivedValidPOSTHTTPResponseCodeForCreateLocation(int arg0) {
        postCreateLocation.validateHTTPResponseCode400ForCreateLocation();
    }

    @Then("user received POST HTTP responses code {int} for createLocation")
    public void userReceivedPOSTHTTPResponsesCodeForCreateLocation_(int arg0) {
        postCreateLocation.validateHTTPResponseCode201ForCreateLocation();
    }


    @And("user send POST HTTP request with invalid request body for create Locations")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocations() {
        postCreateLocation.sendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocationUser();
    }
}
