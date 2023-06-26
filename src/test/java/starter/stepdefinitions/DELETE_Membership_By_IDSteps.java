package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Membership.DELETE_Membership_By_ID;

public class DELETE_Membership_By_IDSteps {
    @Steps
    DELETE_Membership_By_ID deleteMembershipById;
    @When("admin set valid DELETE Membership by ID endpoint")
    public void adminSetValidDELETEMembershipByIDEndpoint() {
        deleteMembershipById.setValidDELETEClassPackagesByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with valid endpoint for Membership by ID")
    public void adminSendDELETEHTTPRequestWithValidEndpointForMembershipByID() {
        deleteMembershipById.sendDELETEHTTPRequestWithValidEndpointForMembershipByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} for Membership by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeForMembershipByID(int arg0) {
        deleteMembershipById.validateDELETEHTTPResponseCode200ForMembershipByID();
    }

    @When("admin set invalid DELETE Membership by ID endpoint")
    public void adminSetInvalidDELETEMembershipByIDEndpoint() {
        deleteMembershipById.setInvalidDELETEClassPackagesByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid endpoint for Membership by ID")
    public void adminSendDELETEHTTPRequestWithInvalidEndpointForMembershipByID() {
        deleteMembershipById.sendDELETEHTTPRequestWithInvalidEndpointForMembershipByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} Bad Request for Membership by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeBadRequestForMembershipByID(int arg0) {
        deleteMembershipById.validateDELETEHTTPResponseCode400ForMembershipByID();
    }

    @And("admin send DELETE HTTP request with invalid method for Membership by ID")
    public void adminSendDELETEHTTPRequestWithInvalidMethodForMembershipByID() {
        deleteMembershipById.sendDELETEHTTPRequestWithInvalidMethodForMembershipByID();
    }

    @Then("admin received valid DELETE HTTP responses code {int} for Membership by ID")
    public void adminReceivedValidDELETEHTTPResponsesCodeForMembershipByID(int arg0) {
        deleteMembershipById.validateDELETEHTTPResponseCode404ForMembershipByID();
    }

    @When("admin set invalid ID DELETE Membership by ID endpoint")
    public void adminSetInvalidIDDELETEMembershipByIDEndpoint() {
        deleteMembershipById.setInvalidIDDELETEClassPackagesByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid ID for Membership by ID")
    public void adminSendDELETEHTTPRequestWithInvalidIDForMembershipByID() {
        deleteMembershipById.sendDELETEHTTPRequestWithInvalidIDForMembershipByID();
    }

    @When("user set valid DELETE Membership by ID endpoint")
    public void userSetValidDELETEMembershipByIDEndpoint() {
        deleteMembershipById.setValidDELETEClassPackagesByIDEndpoint();
    }

    @And("user send DELETE HTTP request for Membership by ID")
    public void userSendDELETEHTTPRequestForMembershipByID() {
        deleteMembershipById.sendDELETEHTTPRequestForMembershipByID();
    }
}
