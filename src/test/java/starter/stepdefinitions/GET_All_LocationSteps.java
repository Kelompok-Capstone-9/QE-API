package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Locations.GET_All_Location;

public class GET_All_LocationSteps {
    @Steps
    GET_All_Location getAllLocation;
    @When("admin set valid GET all Location endpoint")
    public void adminSetValidGETAllLocationEndpoint() {
        getAllLocation.setEnpointGetvalid();

    }

    @And("admin send GET HTTP request with valid endpoint for all Location")
    public void adminSendGETHTTPRequestWithValidEndpointForAllLocation() {
        getAllLocation.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all Location")
    public void adminReceivedValidGETHTTPResponseCodeForAllLocation(int arg0) {
        getAllLocation.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all Location endpoint")
    public void adminSetInvalidGETAllLocationEndpoint() {
        getAllLocation.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all Location")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllLocation() {
        getAllLocation.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} for all Location")
    public void adminReceivedValidGETHTTPResponsesCodeForAllLocation(int arg0) {
        getAllLocation.UserGetUserInformationStatusCode404();
    }

    @And("admin send GET HTTP request with invalid method for all Location")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllLocation() {
        getAllLocation.sendGetUserInfoInvalidMethod();
    }
}
