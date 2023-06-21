package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Plan.POST_Create_Plan;

public class POST_Create_PlanSteps {
    @Steps
    POST_Create_Plan postCreatePlan;

    public POST_Create_PlanSteps() {
    }

    @When("user set valid POST create plan endpoint")
    public void userSetValidPOSTCreatePlanEndpoint() {
        this.postCreatePlan.setValidPOSTCreateEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for create plan")
    public void userSendPOSTHTTPRequestWithValidEndpointForCreatePlan() {
        this.postCreatePlan.sendPOSTHTTPRequestWithValidEndpointForCreatePlan();
    }

    @Then("user received POST HTTP response code {int} for create plan")
    public void userReceivedPOSTHTTPResponseCodeForCreatePlan(int arg0) {
        this.postCreatePlan.validateHTTPResponseCode201ForCreatePlan();
    }

    @When("user set invalid POST create plan endpoint")
    public void userSetInvalidPOSTCreatePlanEndpoint() {
        this.postCreatePlan.setInvalidPOSTcreateEndpoint();
    }

    @And("user send POST HTTP request with invalid endpoint for create plan")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreatePlan() {
        this.postCreatePlan.sendPOSTHTTPRequestWithInvalidEndpointForCreatePlan();
    }

    @Then("user received POST HTTP responses code {int} for create plan")
    public void userReceivedPOSTHTTPResponsesCodeForCreatePlan(int arg0) {
        this.postCreatePlan.validateHTTPResponseCode404ForCreatePlan();
    }

    @And("user send POST HTTP request with invalid method for create plan")
    public void userSendPOSTHTTPRequestWithInvalidMethodForCreatePlan() {
        this.postCreatePlan.sendPOSTHTTPRequestWithInvalidMethodForCreatePlan();
    }

    @And("user send POST HTTP request with empty request body for create plan")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForCreatePlan() {
        this.postCreatePlan.sendPOSTHTTPRequestWithEmptyRequestBodyForCreatePlan();
    }

    @Then("user received valid POST HTTP response code {int} for create plan")
    public void userReceivedValidPOSTHTTPResponseCodeForCreatePlan(int arg0) {
        this.postCreatePlan.validateHTTPResponseCode400ForCreatePlan();
    }

    @And("user send POST HTTP request with invalid request body for create plan")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreatePlan() {
        this.postCreatePlan.sendPOSTHTTPRequestWithInvalidRequestBodyForCreatePlan();
    }

    @Then("user received valid POST HTTP response code {int} Unauthorized for create plan")
    public void userReceivedValidPOSTHTTPResponseCodeUnauthorizedForCreatePlan(int arg0) {
        this.postCreatePlan.validateHTTPResponseCode401ForCreatePlan();
    }
}
