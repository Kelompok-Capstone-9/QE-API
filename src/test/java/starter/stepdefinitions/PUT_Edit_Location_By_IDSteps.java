package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Locations.PUT_Edit_Location_By_ID;

public class PUT_Edit_Location_By_IDSteps {
    @Steps
    PUT_Edit_Location_By_ID putEditLocationById;
    @When("user set valid PUT Edit Location endpoint")
    public void userSetValidPUTEditLocationEndpoint() {
        putEditLocationById.setValidPUTEditEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for Edit Location")
    public void userSendPOSTHTTPRequestWithValidEndpointForEditLocation() {
        putEditLocationById.sendPUTHTTPRequestWithValidEndpointForEditlocation();
    }

    @Then("user received PUT HTTP response code {int} for Edit Location")
    public void userReceivedPUTHTTPResponseCodeForEditLocation(int arg0) {
        putEditLocationById.validateHTTPResponseCode200ForEditlocation();
    }

    @When("user set invalid PUT Edit Location endpoint")
    public void userSetInvalidPUTEditLocationEndpoint() {
        putEditLocationById.setInvalidPUTEditEndpoint();
    }

    @And("user send PUT HTTP request with invalid endpoint for Edit Location")
    public void userSendPUTHTTPRequestWithInvalidEndpointForEditLocation() {
        putEditLocationById.sendPUTHTTPRequestWithInvalidEndpointForEditlocation();
    }

    @Then("user received PUT HTTP responses code {int} for Edit Location")
    public void userReceivedPUTHTTPResponsesCodeForEditLocation(int arg0) {
        putEditLocationById.validateHTTPResponseCode404ForEditlocation();
    }

    @And("user send PUT HTTP request with invalid method for Edit Location")
    public void userSendPUTHTTPRequestWithInvalidMethodForEditLocation() {
        putEditLocationById.sendPUTHTTPRequestWithInvalidMethodForEditlocation();
    }

    @And("user send PUT HTTP request with empty request body for Edit Location")
    public void userSendPUTHTTPRequestWithEmptyRequestBodyForEditLocation() {
        putEditLocationById.sendPUTHTTPRequestWithEmptyRequestBodyForEditlocation();
    }

    @And("user send PUT HTTP request with invalid request body for Edit Location")
    public void userSendPUTHTTPRequestWithInvalidRequestBodyForEditLocation() {
        putEditLocationById.sendPUTHTTPRequestWithInvalidRequestBodyForEditlocation();

    }

    @Then("user received PUT POST HTTP response code {int} for Edit Location")
    public void userReceivedPUTPOSTHTTPResponseCodeForEditLocation(int arg0) {
        putEditLocationById.validateHTTPResponseCode400ForEditlocation();
    }

    @And("user send POST HTTP request with invalid request body for create Locations User")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocationsUser() {
        putEditLocationById.sendPUTHTTPRequestWithInvalidRequestBodyForEditlocationUser();
    }
}
