package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ClassPackages.POST_Create_New_ClassPackages;

public class POST_Create_New_ClassPackagesSteps {
    @Steps
    POST_Create_New_ClassPackages postCreateNewClassPackages;
    @When("user set valid POST create New ClassPackages endpoint")
    public void userSetValidPOSTCreateNewClassPackagesEndpoint() {
        postCreateNewClassPackages.setValidPOSTCreateEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for create New ClassPackages")
    public void userSendPOSTHTTPRequestWithValidEndpointForCreateNewClassPackages() {
        postCreateNewClassPackages.sendPOSTHTTPRequestWithValidEndpointForCreateClassPackages();
    }

    @Then("user received POST HTTP responses code {int} for create New ClassPackages")
    public void userReceivedPOSTHTTPResponsesCodeForCreateNewClassPackages(int arg0) {
        postCreateNewClassPackages.validateHTTPResponseCode404ForCreateClassPackages();
    }

    @When("user set invalid POST create New ClassPackages endpoint")
    public void userSetInvalidPOSTCreateNewClassPackagesEndpoint() {
        postCreateNewClassPackages.setInvalidPOSTcreateEndpoint();
    }

    @And("user send POST HTTP request with invalid endpoint for create New ClassPackages")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateNewClassPackages() {
        postCreateNewClassPackages.sendPOSTHTTPRequestWithInvalidEndpointForCreateClassPackages();
    }

    @And("user send POST HTTP request with invalid method for create New ClassPackages")
    public void userSendPOSTHTTPRequestWithInvalidMethodForCreateNewClassPackages() {
        postCreateNewClassPackages.sendPOSTHTTPRequestWithInvalidMethodForCreateClassPackages();
    }

    @And("user send POST HTTP request with empty request body for create New ClassPackages")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForCreateNewClassPackages() {
        postCreateNewClassPackages.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateClassPackages();
    }

    @Then("user received POST HTTP response code {int} for create New ClassPackages")
    public void userReceivedPOSTHTTPResponseCodeForCreateNewClassPackages(int arg0) {
        postCreateNewClassPackages.validateHTTPResponseCode400ForCreateClassPackages();
    }

    @And("user send POST HTTP request with invalid request body for create New ClassPackages")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreateNewClassPackages() {
        postCreateNewClassPackages.sendPOSTHTTPRequestWithInvalidRequestBodyForCreateClassPackagesUser();
    }

    @Then("user received valid POST HTTP response code {int} for create New ClassPackages")
    public void userReceivedValidPOSTHTTPResponseCodeForCreateNewClassPackages(int arg0) {
        postCreateNewClassPackages.validateHTTPResponseCode400ForCreateClassPackages();
    }

    @Then("user received POST HTTP responses code {int} for create NewClassPackages")
    public void userReceivedPOSTHTTPResponsesCodeForCreateNewClassPackages_(int arg0) {
        postCreateNewClassPackages.validateHTTPResponseCode201ForCreateClassPackages();
    }
}
