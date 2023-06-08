package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.DELETE_User_By_ID;

public class DELETE_User_By_IDSteps {
    @Steps
    DELETE_User_By_ID delete_user_by_id;

    @When("admin set valid DELETE user data by ID endpoint")
    public void adminSetValidDELETEUserDataByIDEndpoint() {
        delete_user_by_id.setValidDELETEUserDataByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with valid endpoint for user data by ID")
    public void adminSendDELETEHTTPRequestWithValidEndpointForUserDataByID() {
        delete_user_by_id.sendDELETEHTTPRequestWithValidEndpointForUserDataByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} for user data by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeForUserDataByID(int arg0) {
        delete_user_by_id.validateDELETEHTTPResponseCode200ForUserDataByID();
    }

    @When("admin set invalid DELETE user data by ID endpoint")
    public void adminSetInvalidDELETEUserDataByIDEndpoint() {
        delete_user_by_id.setInvalidDELETEUserDataByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid endpoint for user data by ID")
    public void adminSendDELETEHTTPRequestWithInvalidEndpointForUserDataByID() {
        delete_user_by_id.sendDELETEHTTPRequestWithInvalidEndpointForUserDataByID();
    }

    @Then("admin received valid DELETE HTTP responses code {int} for user data by ID")
    public void adminReceivedValidDELETEHTTPResponsesCodeForUserDataByID(int arg0) {
        delete_user_by_id.validateDELETEHTTPResponseCode404ForUserDataByID();
    }

    @And("admin send DELETE HTTP request with invalid method for user data by ID")
    public void adminSendDELETEHTTPRequestWithInvalidMethodForUserDataByID() {
        delete_user_by_id.sendDELETEHTTPRequestWithInvalidMethodForUserDataByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} Bad Request for user data by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeBadRequestForUserDataByID(int arg0) {
        delete_user_by_id.validateDELETEHTTPResponseCode400ForUserDataByID();
    }

    @When("admin set invalid ID DELETE user data by ID endpoint")
    public void adminSetInvalidIDDELETEUserDataByIDEndpoint() {
        delete_user_by_id.setInvalidIDDELETEUserDataByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid ID for user data by ID")
    public void adminSendDELETEHTTPRequestWithInvalidIDForUserDataByID() {
        delete_user_by_id.sendDELETEHTTPRequestWithInvalidIDForUserDataByID();
    }

    @When("user set valid DELETE user data by ID endpoint")
    public void userSetValidDELETEUserDataByIDEndpoint() {
        delete_user_by_id.setValidDELETEUserDataByIDEndpoint();
    }

    @And("user send DELETE HTTP request for user data by ID")
    public void userSendDELETEHTTPRequestForUserDataByID() {
        delete_user_by_id.sendDELETEHTTPRequestForUserDataByID();
    }

    @Then("user received valid DELETE HTTP response code {int} for user data by ID")
    public void userReceivedValidDELETEHTTPResponseCodeForUserDataByID(int arg0) {
        delete_user_by_id.validateDELETEHTTPResponseCode401ForUserDataByID();
    }
}
