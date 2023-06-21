package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Plan.DELETE_Plan_By_ID;

public class DELETE_Plan_By_IDSteps {
    @Steps
    DELETE_Plan_By_ID deletePlanById;

    public DELETE_Plan_By_IDSteps() {
    }

    @When("admin set valid DELETE plan by ID endpoint")
    public void adminSetValidDELETEPlanByIDEndpoint() {
        this.deletePlanById.setValidDELETEPlanByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with valid endpoint for plan by ID")
    public void adminSendDELETEHTTPRequestWithValidEndpointForPlanByID() {
        this.deletePlanById.sendDELETEHTTPRequestWithValidEndpointForPlanByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} for plan by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeForPlanByID(int arg0) {
        this.deletePlanById.validateDELETEHTTPResponseCode200ForPlanByID();
    }

    @When("admin set invalid DELETE plan by ID endpoint")
    public void adminSetInvalidDELETEPlanByIDEndpoint() {
        this.deletePlanById.setInvalidDELETEPlanByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid endpoint for plan by ID")
    public void adminSendDELETEHTTPRequestWithInvalidEndpointForPlanByID() {
        this.deletePlanById.sendDELETEHTTPRequestWithInvalidEndpointForPlanByID();
    }

    @Then("admin received valid DELETE HTTP responses code {int} for plan by ID")
    public void adminReceivedValidDELETEHTTPResponsesCodeForPlanByID(int arg0) {
        this.deletePlanById.validateDELETEHTTPResponseCode404ForPlanByID();
    }

    @And("admin send DELETE HTTP request with invalid method for plan by ID")
    public void adminSendDELETEHTTPRequestWithInvalidMethodForPlanByID() {
        this.deletePlanById.sendDELETEHTTPRequestWithInvalidMethodForPlanByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} Bad Request for plan by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeBadRequestForPlanByID(int arg0) {
        this.deletePlanById.validateDELETEHTTPResponseCode400ForPlanByID();
    }

    @When("admin set invalid ID DELETE plan by ID endpoint")
    public void adminSetInvalidIDDELETEPlanByIDEndpoint() {
        this.deletePlanById.setInvalidIDDELETEPlanByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid ID for plan by ID")
    public void adminSendDELETEHTTPRequestWithInvalidIDForPlanByID() {
        this.deletePlanById.sendDELETEHTTPRequestWithInvalidIDForPlanByID();
    }

    @When("user set valid DELETE plan by ID endpoint")
    public void userSetValidDELETEPlanByIDEndpoint() {
        this.deletePlanById.setValidDELETEPlanByIDEndpoint();
    }

    @And("user send DELETE HTTP request for plan by ID")
    public void userSendDELETEHTTPRequestForPlanByID() {
        this.deletePlanById.sendDELETEHTTPRequestForPlanByID();
    }

    @Then("user received valid DELETE HTTP response code {int} for plan by ID")
    public void userReceivedValidDELETEHTTPResponseCodeForPlanByID(int arg0) {
        this.deletePlanById.validateDELETEHTTPResponseCode401ForPlanByID();
    }
}
