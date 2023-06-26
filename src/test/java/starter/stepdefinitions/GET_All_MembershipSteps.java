package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Membership.GET_All_Membership;

public class GET_All_MembershipSteps {
    @Steps
    GET_All_Membership getAllMembership;
    @When("admin set valid GET all Membership endpoint")
    public void adminSetValidGETAllMembershipEndpoint() {
        getAllMembership.setEnpointGetvalid();
    }

    @And("admin send GET HTTP request with valid endpoint for all Membership")
    public void adminSendGETHTTPRequestWithValidEndpointForAllMembership() {
        getAllMembership.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all Membership")
    public void adminReceivedValidGETHTTPResponseCodeForAllMembership(int arg0) {
        getAllMembership.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all Membership endpoint")
    public void adminSetInvalidGETAllMembershipEndpoint() {
        getAllMembership.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all Membership")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllMembership() {
        getAllMembership.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} forall Membership")
    public void adminReceivedValidGETHTTPResponsesCodeForallMembership(int arg0) {
        getAllMembership.UserGetUserInformationStatusCode400();
    }

    @And("admin send GET HTTP request with invalid method for all Membership")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllMembership() {
        getAllMembership.sendGetUserInfoInvalidMethod();
    }

    @Then("admin received valid GET HTTP responses code {int} for all Membership")
    public void adminReceivedValidGETHTTPResponsesCodeForAllMembership(int arg0) {
        getAllMembership.UserGetUserInformationStatusCode404();
    }
}
