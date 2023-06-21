package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Locations.DELETE_Location_By_ID;

public class DELETE_Location_By_IDSteps {
    @Steps
    DELETE_Location_By_ID deleteLocationById;
    @When("admin set valid DELETE Location by ID endpoint")
    public void adminSetValidDELETELocationByIDEndpoint() {
        deleteLocationById.setValidDELETELocationByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with valid endpoint for Location by ID")
    public void adminSendDELETEHTTPRequestWithValidEndpointForLocationByID() {
        deleteLocationById.sendDELETEHTTPRequestWithValidEndpointForLocationByID();

    }

    @Then("admin received valid DELETE HTTP response code {int} for Location by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeForLocationByID(int arg0) {
        deleteLocationById.validateDELETEHTTPResponseCode200ForLocationByID();
    }

    @When("admin set invalid DELETE Location by ID endpoint")
    public void adminSetInvalidDELETELocationByIDEndpoint() {
        deleteLocationById.setInvalidIDDELETELocationnByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid endpoint for Location by ID")
    public void adminSendDELETEHTTPRequestWithInvalidEndpointForLocationByID() {
        deleteLocationById.sendDELETEHTTPRequestWithInvalidEndpointForLocationByID();
    }

    @Then("admin received valid DELETE HTTP responses code {int} for Location by ID")
    public void adminReceivedValidDELETEHTTPResponsesCodeForLocationByID(int arg0) {
        deleteLocationById.validateDELETEHTTPResponseCode404ForLocationByID();
    }

    @And("admin send DELETE HTTP request with invalid method for Location by ID")
    public void adminSendDELETEHTTPRequestWithInvalidMethodForLocationByID() {
        deleteLocationById.sendDELETEHTTPRequestWithInvalidMethodForLocationByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} Bad Request for Location by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeBadRequestForLocationByID(int arg0) {
        deleteLocationById.validateDELETEHTTPResponseCode400ForLocationByID();
    }

    @When("admin set invalid ID DELETE Location by ID endpoint")
    public void adminSetInvalidIDDELETELocationByIDEndpoint() {
        deleteLocationById.setInvalidDELETELocationByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid ID for Location by ID")
    public void adminSendDELETEHTTPRequestWithInvalidIDForLocationByID() {
        deleteLocationById.sendDELETEHTTPRequestWithInvalidIDForLocationByID();
    }

    @When("user set valid DELETE Location by ID endpoint")
    public void userSetValidDELETELocationByIDEndpoint() {
        deleteLocationById.setValidDELETELocationByIDEndpoint();
    }

    @And("user send DELETE HTTP request for Location by ID")
    public void userSendDELETEHTTPRequestForLocationByID() {
        deleteLocationById.sendDELETEHTTPRequestForLocationByID();
    }

}
