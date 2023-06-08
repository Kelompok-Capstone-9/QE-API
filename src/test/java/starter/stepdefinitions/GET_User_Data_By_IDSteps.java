package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.GET_User_Data_By_ID;

public class GET_User_Data_By_IDSteps {
    @Steps
    GET_User_Data_By_ID get_user_data_by_id;

    @When("admin set valid GET user data by ID endpoint")
    public void adminSetValidGETUserDataByIDEndpoint() {
        get_user_data_by_id.setValidGETUserDataByIDEndpoint();
    }

    @And("admin send GET HTTP request with valid endpoint for user data by ID")
    public void adminSendGETHTTPRequestWithValidEndpointForUserDataByID() {
        get_user_data_by_id.sendGETHTTPRequestWithValidEndpointForUserDataByID();
    }

    @Then("admin received valid GET HTTP response code {int} for user data by ID")
    public void adminReceivedValidGETHTTPResponseCodeForUserDataByID(int arg0) {
        get_user_data_by_id.validateGETHTTPResponseCode200ForUserDatarByID();
    }

    @And("admin received valid user data by ID")
    public void adminReceivedValidUserDataByID() {
        get_user_data_by_id.validateValidUserDataByID();
    }

    @When("admin set invalid GET user data by ID endpoint")
    public void adminSetInvalidGETUserDataByIDEndpoint() {
        get_user_data_by_id.setInvalidGETUserDataByIDEndpoint();
    }

    @And("admin send GET HTTP request with invalid endpoint for user data by ID")
    public void adminSendGETHTTPRequestWithInvalidEndpointForUserDataByID() {
        get_user_data_by_id.sendGETHTTPRequestWithInvalidEndpointForUserDataByID();
    }

    @Then("admin received valid GET HTTP responses code {int} for user data by ID")
    public void adminReceivedValidGETHTTPResponsesCodeForUserDataByID(int arg0) {
        get_user_data_by_id.validateGETHTTPResponsesCode404ForUserDatarByID();
    }

    @And("admin send GET HTTP request with invalid method for user data by ID")
    public void adminSendGETHTTPRequestWithInvalidMethodForUserDataByID() {
        get_user_data_by_id.sendGETHTTPRequestWithInvalidMethodForUserDataByID();
    }

    @When("admin set invalid ID GET user data by ID endpoint")
    public void adminSetInvalidIDGETUserDataByIDEndpoint() {
        get_user_data_by_id.setInvalidIDGETUserDataByIDEndpoint();
    }

    @And("admin send GET HTTP request with invalid ID for user data by ID")
    public void adminSendGETHTTPRequestWithInvalidIDForUserDataByID() {
        get_user_data_by_id.sendGETHTTPRequestWithInvalidIDForUserDataByID();
    }

    @Then("admin received GET HTTP response code {int} for user data by ID")
    public void adminReceivedGETHTTPResponseCodeForUserDataByID(int arg0) {
        get_user_data_by_id.validateGETHTTPResponsesCode400ForUserDataByID();
    }

    @When("user set valid GET user data by ID endpoint")
    public void userSetValidGETUserDataByIDEndpoint() {
        get_user_data_by_id.setValidGETUserDataByIDEndpointAsUser();
    }

    @And("user send GET HTTP request with valid endpoint user data by ID")
    public void userSendGETHTTPRequestWithValidEndpointUserDataByID() {
        get_user_data_by_id.sendGETHTTPRequestWithValidEndpointForUserDataByIDAsUser();
    }

    @Then("user received valid GET HTTP response code {int} OK for user data by ID")
    public void userReceivedValidGETHTTPResponseCodeOKForUserDataByID(int arg0) {
        get_user_data_by_id.validateGETHTTPResponseCode200ForUserDatarByID();
    }

    @When("user set invalid ID GET user data by ID endpoint")
    public void userSetInvalidIDGETUserDataByIDEndpoint() {
        get_user_data_by_id.setInvalidIDGETUserDataByIDEndpointAsUser();
    }

    @And("user send GET HTTP request with invalid ID endpoint user data by ID")
    public void userSendGETHTTPRequestWithInvalidIDEndpointUserDataByID() {
        get_user_data_by_id.sendGETHTTPRequestWithInvalidEndpointForUserDataByIDAsUser();
    }

    @Then("user received valid GET HTTP response code {int} for user data by ID")
    public void userReceivedValidGETHTTPResponseCodeForUserDataByID(int arg0) {
        get_user_data_by_id.validateGETHTTPResponsesCode401ForUserDataByID();
    }
}
