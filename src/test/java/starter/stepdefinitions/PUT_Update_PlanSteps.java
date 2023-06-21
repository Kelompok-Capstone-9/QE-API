package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Plan.PUT_Update_Plan;

public class PUT_Update_PlanSteps {
    @Steps
    PUT_Update_Plan putUpdatePlan;

    public PUT_Update_PlanSteps() {
    }

    @When("user set valid PUT update plan endpoint")
    public void userSetValidPUTUpdatePlanEndpoint() {
        this.putUpdatePlan.setValidPOSTCreateEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for update plan")
    public void userSendPOSTHTTPRequestWithValidEndpointForUpdatePlan() {
        this.putUpdatePlan.sendPUTHTTPRequestWithValidEndpointForUpdatePlan();
    }

    @Then("user received PUT HTTP response code {int} for update plan")
    public void userReceivedPUTHTTPResponseCodeForUpdatePlan(int arg0) {
        this.putUpdatePlan.validateHTTPResponseCode200ForUpdatePlan();
    }

    @When("user set invalid PUT update plan  endpoint")
    public void userSetInvalidPUTUpdatePlanEndpoint() {
        this.putUpdatePlan.setInvalidPUTUpdateEndpoint();
    }

    @And("user send PUT HTTP request with invalid endpoint for update plan")
    public void userSendPUTHTTPRequestWithInvalidEndpointForUpdatePlan() {
        this.putUpdatePlan.sendPUTHTTPRequestWithInvalidEndpointForUpdatePlan();
    }

    @Then("user received PUT HTTP responses code {int} for update plan")
    public void userReceivedPUTHTTPResponsesCodeForUpdatePlan(int arg0) {
        this.putUpdatePlan.validateHTTPResponseCode404ForUpdatePlan();
    }

    @And("user send PUT HTTP request with invalid method for update plan")
    public void userSendPUTHTTPRequestWithInvalidMethodForUpdatePlan() {
        this.putUpdatePlan.sendPUTHTTPRequestWithInvalidMethodForUpdatePlan();
    }

    @And("user send PUT HTTP request with empty request body for update plan")
    public void userSendPUTHTTPRequestWithEmptyRequestBodyForUpdatePlan() {
        this.putUpdatePlan.sendPUTHTTPRequestWithEmptyRequestBodyForUpdatePlan();
    }

    @Then("user received PUT POST HTTP response code {int} for update plan")
    public void userReceivedPUTPOSTHTTPResponseCodeForUpdatePlan(int arg0) {
        this.putUpdatePlan.validateHTTPResponseCode400ForUpdatePlan();
    }

    @And("user send PUT HTTP request with invalid request body for update plan")
    public void userSendPUTHTTPRequestWithInvalidRequestBodyForUpdatePlan() {
        this.putUpdatePlan.sendPUTHTTPRequestWithInvalidRequestBodyForUpdatePlan();
    }

    @Then("user received valid PUT HTTP response code {int} Unauthorized for update plan")
    public void userReceivedValidPUTHTTPResponseCodeUnauthorizedForUpdatePlan(int arg0) {
        this.putUpdatePlan.validateHTTPResponseCode401ForUpdatePlan();
    }
}
