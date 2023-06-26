package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Membership.POST_Create_Membership;

public class POST_Create_MembershipSteps {
    @Steps
    POST_Create_Membership postCreateMembership;
    @When("user set valid POST create Membership endpoint")
    public void userSetValidPOSTCreateMembershipEndpoint() {
        postCreateMembership.setValidPOSTCreateEndpoint();
    }

    @And("user send POST HTTP request with valid endpoint for create Membership")
    public void userSendPOSTHTTPRequestWithValidEndpointForCreateMembership() {
        postCreateMembership.sendPOSTHTTPRequestWithValidEndpointForCreateMembership();
    }

    @Then("user received POST HTTP responses code {int} for create Membership")
    public void userReceivedPOSTHTTPResponsesCodeForCreateMembership(int arg0) {
        postCreateMembership.validateHTTPResponseCode404ForCreateMembership();
    }

    @When("user set invalid POST create Membership endpoint")
    public void userSetInvalidPOSTCreateMembershipEndpoint() {
        postCreateMembership.setInvalidPOSTcreateEndpoint();
    }

    @And("user send POST HTTP request with invalid endpoint for create Membership")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateMembership() {
        postCreateMembership.sendPOSTHTTPRequestWithInvalidEndpointForCreateMembership();
    }

    @And("user send POST HTTP request with invalid method for create Membership")
    public void userSendPOSTHTTPRequestWithInvalidMethodForCreateMembership() {
        postCreateMembership.sendPOSTHTTPRequestWithInvalidMethodForCreateMembership();
    }

    @And("user send POST HTTP request with empty request body for create Membership")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForCreateMembership() {
        postCreateMembership.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateMembership();
    }

    @Then("user received POST HTTP response code {int} for create Membership")
    public void userReceivedPOSTHTTPResponseCodeForCreateMembership(int arg0) {
        postCreateMembership.validateHTTPResponseCode400ForCreateMembership();
    }

    @And("user send POST HTTP request with invalid request body for create Membership")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreateMembership() {
        postCreateMembership.sendPOSTHTTPRequestWithInvalidRequestBodyForCreateMembership();
    }

    @Then("user received valid POST HTTP response code {int} for create Membership")
    public void userReceivedValidPOSTHTTPResponseCodeForCreateMembership(int arg0) {
        postCreateMembership.validateHTTPResponseCode400ForCreateMembership();
    }

    @Then("user received POST HTTP responses code {int} for createMembership")
    public void userReceivedPOSTHTTPResponsesCodeForCreateMembership_(int arg0) {
        postCreateMembership.validateHTTPResponseCode201ForCreateMembership();
    }

    @And("user send POST HTTP request with invalid request body for create Membership User")
    public void userSendPOSTHTTPRequestWithInvalidRequestBodyForCreateMembershipUser() {
        postCreateMembership.sendPOSTHTTPRequestWithInvalidRequestBodyForCreateMembershipsUser();
    }
}
