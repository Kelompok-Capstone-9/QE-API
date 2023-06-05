package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.POST_Register;

public class POST_RegisterSteps {
    @Steps
    POST_Register post_register;

    @Given("user set valid POST register endpoint")
    public void userSetValidPOSTRegisterEndpoint() {
        post_register.setValidPOSTRegisterEndpoint();
    }

    @When("user send POST HTTP request with valid endpoint for register")
    public void userSendPOSTHTTPRequestWithValidEndpointForRegister() {
        post_register.sendPOSTHTTPRequestWithValidEndpointForRegister();
    }

    @Then("user received POST HTTP response code {int} for register")
    public void userReceivedPOSTHTTPResponseCodeForRegister(int arg0) {
        post_register.validateHTTPResponseCode201ForRegister();
    }

    @Given("user set invalid POST register endpoint")
    public void userSetInvalidPOSTRegisterEndpoint() {
        post_register.setInvalidPOSTRegisterEndpoint();
    }

    @When("user send POST HTTP request with invalid endpoint for register")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForRegister() {
        post_register.sendPOSTHTTPRequestWithInvalidEndpointForRegister();
    }

    @Then("user received POST HTTP responses code {int} for register")
    public void userReceivedPOSTHTTPResponsesCodeForRegister(int arg0) {
        post_register.validateHTTPResponsesCode404ForRegister();
    }

    @When("user send POST HTTP request with empty request body for register")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForRegister() {
        post_register.sendPOSTHTTPRequestWithEmptyRequestBodyForRegister();
    }

    @Then("user received valid POST HTTP response code {int} for register")
    public void userReceivedValidPOSTHTTPResponseCodeForRegister(int arg0) {
        post_register.validateValidHTTPResponseCode400ForRegister();
    }

    @When("user send POST HTTP request with registered email for register")
    public void userSendPOSTHTTPRequestWithRegisteredEmailForRegister() {
        post_register.sendPOSTHTTPRequestWithRegisteredEmailForRegister();
    }

    @Then("user received valid POST HTTP response code {int} Conflict for register")
    public void userReceivedValidPOSTHTTPResponseCodeConflictForRegister(int arg0) {
        post_register.validateValidHTTPResponseCode409ConflictForRegister();
    }

    @When("user send POST HTTP request with invalid request body for register")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForRegister() {
        post_register.sendPOSTHTTPRequestWithInvalidRequestBodyForRegister();
    }

    @When("user send POST HTTP request with invalid method for register")
    public void userSendPOSTHTTPRequestWithInvalidMethodForRegister() {
        post_register.sendPOSTHTTPRequestWithInvalidMethodForRegister();
    }

    @Then("user received POST HTTP response code {int} Method Not Allowed for register")
    public void userReceivedPOSTHTTPResponseCodeMethodNotAllowedForRegister(int arg0) {
        post_register.validateValidHTTPResponseCode405MethodNotAllowedForRegister();
    }
}
