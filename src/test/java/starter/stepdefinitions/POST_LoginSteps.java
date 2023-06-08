package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.POST_Login;

public class POST_LoginSteps {
    @Steps
    POST_Login post_login;

    @Given("user set valid POST login endpoint")
    public void userSetValidPOSTLoginEndpoint() {
        post_login.setValidPOSTLoginEndpoint();
    }

    @When("user send POST HTTP request with valid endpoint for login")
    public void userSendPOSTHTTPRequestWithValidEndpointForLogin() {
        post_login.sendPOSTHTTPRequestWithValidEndpointForLogin();
    }

    @Then("user received POST HTTP response code {int} for login")
    public void userReceivedPOSTHTTPResponseCodeForLogin(int arg0) {
        post_login.validateHTTPResponseCode200ForLogin();
    }

    @Given("user set invalid POST login endpoint")
    public void userSetInvalidPOSTLoginEndpoint() {
        post_login.setInvalidPOSTLoginEndpoint();
    }

    @When("user send POST HTTP request with invalid endpoint for login")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForLogin() {
        post_login.sendPOSTHTTPRequestWithInvalidEndpointForLogin();
    }

    @Then("user received POST HTTP responses code {int} for login")
    public void userReceivedPOSTHTTPResponsesCodeForLogin(int arg0) {
        post_login.validateHTTPResponseCode404ForLogin();
    }

    @When("user send POST HTTP request with invalid method for login")
    public void userSendPOSTHTTPRequestWithInvalidMethodForLogin() {
        post_login.sendPOSTHTTPRequestWithInvalidMethodForLogin();
    }

    @Then("user received POST HTTP response code {int} Method Not Allowed for login")
    public void userReceivedPOSTHTTPResponseCodeMethodNotAllowedForLogin(int arg0) {
        post_login.validateHTTPResponseCode405MethodNotAllowedForLogin();
    }

    @When("user send POST HTTP request with empty request body for login")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForLogin() {
        post_login.sendPOSTHTTPRequestWithEmptyRequestBodyForLogin();
    }

    @Then("user received valid POST HTTP response code {int} for login")
    public void userReceivedValidPOSTHTTPResponseCodeForLogin(int arg0) {
        post_login.validateHTTPResponseCode400ForLogin();
    }

    @When("user send POST HTTP request with invalid request body for login")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForLogin() {
        post_login.sendPOSTHTTPRequestWithInvalidRequestBodyForLogin();
    }

    @When("user send POST HTTP request with invalid email for login")
    public void userSendPOSTHTTPRequestWithInvalidEmailForLogin() {
        post_login.sendPOSTHTTPRequestWithInvalidEmailForLogin();
    }

    @Then("user received valid POST HTTP response code {int} Unauthorized for login")
    public void userReceivedValidPOSTHTTPResponseCodeUnauthorizedForLogin(int arg0) {
        post_login.validateHTTPResponseCode401ForLogin();
    }
}
