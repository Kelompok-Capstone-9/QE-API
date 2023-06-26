package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Membership.GET_Membership_By_ID;

public class GET_Membership_By_IDSteps {
    @Steps
    GET_Membership_By_ID getMembershipById;
    @When("admin set valid GET all Membership by ID endpoint")
    public void adminSetValidGETAllMembershipByIDEndpoint() {
        getMembershipById.setEnpointGetvalid();
    }

    @And("admin send GET HTTP request with valid endpoint for all Membership by ID")
    public void adminSendGETHTTPRequestWithValidEndpointForAllMembershipByID() {
        getMembershipById.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all Membership by ID")
    public void adminReceivedValidGETHTTPResponseCodeForAllMembershipByID(int arg0) {
        getMembershipById.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all Membership by ID endpoint")
    public void adminSetInvalidGETAllMembershipByIDEndpoint() {
        getMembershipById.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all Membership by ID")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllMembershipByID() {
        getMembershipById.sendGetUserInfoInvalid();
    }


    @And("admin send GET HTTP request with invalid method for all Membership by ID")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllMembershipByID() {
        getMembershipById.sendGetUserInfoInvalidMethod();
    }

    @Then("admin received valid GET HTTP responses code {int} all Membership by ID")
    public void adminReceivedValidGETHTTPResponsesCodeAllMembershipByID(int arg0) {
        getMembershipById.UserGetUserInformationStatusCode404();
    }

    @When("admin set invalid ID GET all Membership by ID endpoint")
    public void adminSetInvalidIDGETAllMembershipByIDEndpoint() {
        getMembershipById.sendGetUserInfoInvalidID();
    }

    @And("admin send GET HTTP request with invalid ID for all Membership by ID")
    public void adminSendGETHTTPRequestWithInvalidIDForAllMembershipByID() {
        getMembershipById.sendGetUserInfoInvalidID();
    }
}
