package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Plan.GET_All_Plan;

public class GET_All_PlanSteps {
    @Steps
    GET_All_Plan getAllPlan;

    public GET_All_PlanSteps() {
    }

    @When("admin set valid GET all plan endpoint")
    public void adminSetValidGETAllPlanEndpoint() {
        this.getAllPlan.setEnpointGetvalid();
    }

    @And("admin send GET HTTP request with valid endpoint for all plan")
    public void adminSendGETHTTPRequestWithValidEndpointForAllPlan() {
        this.getAllPlan.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all plan")
    public void adminReceivedValidGETHTTPResponseCodeForAllPlan(int arg0) {
        this.getAllPlan.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all plan endpoint")
    public void adminSetInvalidGETAllPlanEndpoint() {
        this.getAllPlan.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all plan")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllPlan() {
        this.getAllPlan.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} for all plan")
    public void adminReceivedValidGETHTTPResponsesCodeForAllPlan(int arg0) {
        this.getAllPlan.UserGetUserInformationStatusCode404();
    }

    @And("admin send GET HTTP request with invalid method for all plan")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllPlan() {
        this.getAllPlan.sendGetUserInfoInvalidMethod();
    }
}
