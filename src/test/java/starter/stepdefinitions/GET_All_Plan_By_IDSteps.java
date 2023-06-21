package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Plan.GET_All_Plan_By_ID;

public class GET_All_Plan_By_IDSteps {
    @Steps
    GET_All_Plan_By_ID getAllPlanById;

    public GET_All_Plan_By_IDSteps() {
    }

    @When("admin set valid GET all plan by ID endpoint")
    public void adminSetValidGETAllPlanByIDEndpoint() {
        this.getAllPlanById.setEnpointGetvalid();
    }

    @And("admin send GET HTTP request with valid endpoint for all plan by ID")
    public void adminSendGETHTTPRequestWithValidEndpointForAllPlanByID() {
        this.getAllPlanById.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all plan by ID")
    public void adminReceivedValidGETHTTPResponseCodeForAllPlanByID(int arg0) {
        this.getAllPlanById.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all plan by ID endpoint")
    public void adminSetInvalidGETAllPlanByIDEndpoint() {
        this.getAllPlanById.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all plan by ID")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllPlanByID() {
        this.getAllPlanById.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} for all plan by ID")
    public void adminReceivedValidGETHTTPResponsesCodeForAllPlanByID(int arg0) {
        this.getAllPlanById.UserGetUserInformationStatusCode404();
    }

    @And("admin send GET HTTP request with invalid method for all plan by ID")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllPlanByID() {
        this.getAllPlanById.sendGetUserInfoInvalidMethod();
    }

    @When("admin set invalid ID GET all planby ID endpoint")
    public void adminSetInvalidIDGETAllPlanbyIDEndpoint() {
        this.getAllPlanById.setEnpointGetInvalidID();
    }

    @And("admin send GET HTTP request with invalid ID for all plan by ID")
    public void adminSendGETHTTPRequestWithInvalidIDForAllPlanByID() {
        this.getAllPlanById.setEnpointGetInvalidID();
    }
}
