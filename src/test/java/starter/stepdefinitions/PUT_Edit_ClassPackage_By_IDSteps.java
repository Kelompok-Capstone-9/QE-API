package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ClassPackages.PUT_Edit_ClassPackages_By_ID;

public class PUT_Edit_ClassPackage_By_IDSteps {
    @Steps
    PUT_Edit_ClassPackages_By_ID putEditClassPackagesById;
    @When("user set valid PUT Edit ClassPackages endpoint")
    public void userSetValidPUTEditClassPackagesEndpoint() {
        putEditClassPackagesById.setValidPUTEditEndpoint();

    }

    @And("user send POST HTTP request with valid endpoint for Edit ClassPackages")
    public void userSendPOSTHTTPRequestWithValidEndpointForEditClassPackages() {
        putEditClassPackagesById.sendPUTHTTPRequestWithValidEndpointForEditClassPackages();
    }

    @Then("user received PUT HTTP response code {int} for Edit ClassPackages")
    public void userReceivedPUTHTTPResponseCodeForEditClassPackages(int arg0) {
        putEditClassPackagesById.validateHTTPResponseCode200ForEditClassPackages();
    }

    @When("user set invalid PUT Edit ClassPackages endpoint")
    public void userSetInvalidPUTEditClassPackagesEndpoint() {
        putEditClassPackagesById.setInvalidPUTEditEndpoint();
    }

    @And("user send PUT HTTP request with invalid endpoint for Edit ClassPackages")
    public void userSendPUTHTTPRequestWithInvalidEndpointForEditClassPackages() {
        putEditClassPackagesById.sendPUTHTTPRequestWithInvalidEndpointForEditClassPackages();
    }

    @Then("user received PUT HTTP responses code {int} for Edit ClassPackages")
    public void userReceivedPUTHTTPResponsesCodeForEditClassPackages(int arg0) {
        putEditClassPackagesById.validateHTTPResponseCode404ForEditClassPackages();
    }

    @And("user send PUT HTTP request with invalid method for Edit ClassPackages")
    public void userSendPUTHTTPRequestWithInvalidMethodForEditClassPackages() {
        putEditClassPackagesById.sendPUTHTTPRequestWithInvalidMethodForEditClassPackages();
    }

    @And("user send PUT HTTP request with empty request body for Edit ClassPackages")
    public void userSendPUTHTTPRequestWithEmptyRequestBodyForEditClassPackages() {
        putEditClassPackagesById.sendPUTHTTPRequestWithEmptyRequestBodyForEditClassPackages();
    }

    @Then("user received PUT POST HTTP response code {int} for Edit ClassPackages")
    public void userReceivedPUTPOSTHTTPResponseCodeForEditClassPackages(int arg0) {
        putEditClassPackagesById.validateHTTPResponseCode400ForEditClassPackages();
    }

    @And("user send PUT HTTP request with invalid request body for Edit ClassPackages")
    public void userSendPUTHTTPRequestWithInvalidRequestBodyForEditClassPackages() {
        putEditClassPackagesById.sendPUTHTTPRequestWithInvalidRequestBodyForEditClassPackagesUser();
    }
}
