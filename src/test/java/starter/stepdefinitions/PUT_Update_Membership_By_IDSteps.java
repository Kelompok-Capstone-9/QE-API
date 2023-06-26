package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Membership.PUT_Update_Membership_By_ID;

public class PUT_Update_Membership_By_IDSteps {
    @Steps
    PUT_Update_Membership_By_ID putUpdateMembershipById;
    @When("user set valid PUT Update Membership endpoint")
    public void userSetValidPUTUpdateMembershipEndpoint() {
        putUpdateMembershipById.setValidPUTEditEndpoint();

    }

    @And("user send POST HTTP request with valid endpoint for Update Membership")
    public void userSendPOSTHTTPRequestWithValidEndpointForUpdateMembership() {
        putUpdateMembershipById.sendPUTHTTPRequestWithValidEndpointForEditMembership();
    }

    @Then("user received PUT HTTP response code {int} for Update Membership")
    public void userReceivedPUTHTTPResponseCodeForUpdateMembership(int arg0) {
        putUpdateMembershipById.validateHTTPResponseCode200ForEditMembership();
    }

    @When("user set invalid PUT Update Membership endpoint")
    public void userSetInvalidPUTUpdateMembershipEndpoint() {
        putUpdateMembershipById.setInvalidPUTEditEndpoint();
    }

    @And("user send PUT HTTP request with invalid endpoint for Update Membership")
    public void userSendPUTHTTPRequestWithInvalidEndpointForUpdateMembership() {
        putUpdateMembershipById.sendPUTHTTPRequestWithInvalidEndpointForEditMembership();
    }

    @Then("user received PUT POST HTTP response code {int} for Update Membership")
    public void userReceivedPUTPOSTHTTPResponseCodeForUpdateMembership(int arg0) {
        putUpdateMembershipById.validateHTTPResponseCode400ForEditMembership();
    }

    @And("user send PUT HTTP request with invalid method for Update Membership")
    public void userSendPUTHTTPRequestWithInvalidMethodForUpdateMembership() {
        putUpdateMembershipById.sendPUTHTTPRequestWithInvalidMethodForEditMembership();
    }

    @Then("user received PUT HTTP responses code {int} for Update Membership")
    public void userReceivedPUTHTTPResponsesCodeForUpdateMembership(int arg0) {
        putUpdateMembershipById.validateHTTPResponseCode404ForEditMembership();
    }

    @And("user send PUT HTTP request with empty request body for Update Membership")
    public void userSendPUTHTTPRequestWithEmptyRequestBodyForUpdateMembership() {
        putUpdateMembershipById.sendPUTHTTPRequestWithEmptyRequestBodyForEditMembership();
    }

    @When("user set valid PUT Update Memberships endpoint")
    public void userSetValidPUTUpdateMembershipsEndpoint() {
        putUpdateMembershipById.sendPUTHTTPRequestWithValidEndpointForEditMembership();
    }

    @And("user send PUT HTTP request with invalid request body for Update Membership")
    public void userSendPUTHTTPRequestWithInvalidRequestBodyForUpdateMembership() {
        putUpdateMembershipById.sendPUTHTTPRequestWithInvalidRequestBodyForEditMembership();
    }

    @And("user send PUT HTTP request with invalid request body for Update Membership User")
    public void userSendPUTHTTPRequestWithInvalidRequestBodyForUpdateMembershipUser() {
        putUpdateMembershipById.sendPUTHTTPRequestWithInvalidRequestBodyForEditMembershipsUser();
    }
}
