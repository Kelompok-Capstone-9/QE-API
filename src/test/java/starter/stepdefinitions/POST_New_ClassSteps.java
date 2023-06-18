package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.POST_New_Class;

public class POST_New_ClassSteps {
    @Steps
    POST_New_Class post_new_class;

    @When("admin set valid POST new class endpoint")
    public void adminSetValidPOSTNewClassEndpoint() {
        post_new_class.setValidPOSTNewClassEndpoint();
    }

    @And("admin send POST HTTP request with valid endpoint for new class")
    public void adminSendPOSTHTTPRequestWithValidEndpointForNewClass() {
        post_new_class.sendPOSTHTTPRequestWithValidEndpointForNewClass();
    }

    @Then("admin received valid POST HTTP response code {int} for new class")
    public void adminReceivedValidPOSTHTTPResponseCodeForNewClass(int arg0) {
        post_new_class.validateHTTPResponseCode201ForNewClass();
    }

    @When("admin set invalid POST new class endpoint")
    public void adminSetInvalidPOSTNewClassEndpoint() {
        post_new_class.setInvalidPOSTNewClassEndpoint();
    }

    @And("admin send POST HTTP request with invalid endpoint for new class")
    public void adminSendPOSTHTTPRequestWithInvalidEndpointForNewClass() {
        post_new_class.sendPOSTHTTPRequestWithInvalidEndpointForNewClass();
    }

    @Then("admin received POST HTTP response code {int} for new class")
    public void adminReceivedPOSTHTTPResponseCodeForNewClass(int arg0) {
        post_new_class.validateHTTPResponseCode404ForNewClass();
    }

    @And("admin send POST HTTP request with empty request body for new class")
    public void adminSendPOSTHTTPRequestWithEmptyRequestBodyForNewClass() {
        post_new_class.sendPOSTHTTPRequestWithEmptyRequestBodyForNewClass();
    }

    @Then("admin received POST HTTP response code {int} Bad Request for new class")
    public void adminReceivedPOSTHTTPResponseCodeBadRequestForNewClass(int arg0) {
        post_new_class.validateHTTPResponseCode400ForNewClass();
    }

    @And("admin send POST HTTP request with invalid request body for new class")
    public void adminSendPOSTHTTPRequestWithInvalidRequestBodyForNewClass() {
        post_new_class.sendPOSTHTTPRequestWithInvalidRequestBodyForNewClass();
    }

    @And("admin send POST HTTP request with invalid method for new class")
    public void adminSendPOSTHTTPRequestWithInvalidMethodForNewClass() {
        post_new_class.sendPOSTHTTPRequestWithInvalidMethodForNewClass();
    }
}
