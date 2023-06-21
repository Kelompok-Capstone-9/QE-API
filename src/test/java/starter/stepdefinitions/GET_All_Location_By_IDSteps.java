package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Locations.GET_All_Location_By_ID;


public class GET_All_Location_By_IDSteps {
    @Steps
    GET_All_Location_By_ID getAllLocationById;
    @When("admin set valid GET all Location by ID endpoint")
    public void adminSetValidGETAllLocationByIDEndpoint() {
        getAllLocationById.setEnpointGetvalid();

    }

    @And("admin send GET HTTP request with valid endpoint for all Location by ID")
    public void adminSendGETHTTPRequestWithValidEndpointForAllLocationByID() {
        getAllLocationById.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all Location by ID")
    public void adminReceivedValidGETHTTPResponseCodeForAllLocationByID(int arg0) {
        getAllLocationById.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all Location by ID endpoint")
    public void adminSetInvalidGETAllLocationByIDEndpoint() {
        getAllLocationById.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all Location by ID")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllLocationByID() {
        getAllLocationById.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} for all Location by ID")
    public void adminReceivedValidGETHTTPResponsesCodeForAllLocationByID(int arg0) {
        getAllLocationById.UserGetUserInformationStatusCode404();
    }

    @And("admin send GET HTTP request with invalid method for all Location by ID")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllLocationByID() {
        getAllLocationById.sendGetUserInfoInvalidMethod();
    }

    @When("admin set invalid ID GET all Location by ID endpoint")
    public void adminSetInvalidIDGETAllLocationByIDEndpoint() {
        getAllLocationById.setEnpointGetInvalidID();
    }

    @And("admin send GET HTTP request with invalid ID for all Location by ID")
    public void adminSendGETHTTPRequestWithInvalidIDForAllLocationByID() {
        getAllLocationById.sendGetUserInfoInvalidID();
    }

    @Then("admin received valid GET HTTP responses code {int} all Location by ID")
    public void adminReceivedValidGETHTTPResponsesCodeAllLocationByID(int arg0) {
        getAllLocationById.UserGetUserInformationStatusCode405();
    }
}
