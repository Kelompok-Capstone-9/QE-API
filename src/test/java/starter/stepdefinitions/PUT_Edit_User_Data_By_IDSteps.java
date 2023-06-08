package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.PUT_Edit_User_Data_By_ID;

public class PUT_Edit_User_Data_By_IDSteps {
    @Steps
    PUT_Edit_User_Data_By_ID put_edit_user_data_by_id;

    @When("user set valid PUT user data by ID endpoint")
    public void userSetValidPUTUserDataByIDEndpoint() {
        put_edit_user_data_by_id.setValidPUTUserDataByIDEndpoint();
    }

    @And("user send PUT HTTP request with valid endpoint for user data by ID")
    public void userSendPUTHTTPRequestWithValidEndpointForUserDataByID() {
        put_edit_user_data_by_id.sendPUTHTTPRequestWithValidEndpointForUserDataByID();
    }

    @Then("user received valid PUT HTTP response code {int} for user data by ID")
    public void userReceivedValidPUTHTTPResponseCodeForUserDataByID(int arg0) {
        put_edit_user_data_by_id.validateValidPUTHTTPResponseCode200ForUserDataByID();
    }

    @And("user received valid user data by ID")
    public void userReceivedValidUserDataByID() {
        put_edit_user_data_by_id.validateValidUserDataByID();
    }

    @When("user set invalid PUT user data by ID endpoint")
    public void userSetInvalidPUTUserDataByIDEndpoint() {
        put_edit_user_data_by_id.setInvalidPUTUserDataByIDEndpoint();
    }

    @And("user send PUT HTTP request with invalid endpoint for user data by ID")
    public void userSendPUTHTTPRequestWithInvalidEndpointForUserDataByID() {
        put_edit_user_data_by_id.sendPUTHTTPRequestWithInvalidEndpointForUserDataByID();
    }

    @Then("user received valid PUT HTTP responses code {int} for user data by ID")
    public void userReceivedValidPUTHTTPResponsesCodeForUserDataByID(int arg0) {
        put_edit_user_data_by_id.validateValidPUTHTTPResponseCode404ForUserDataByID();
    }

    @And("user send PUT HTTP request with invalid method for user data by ID")
    public void userSendPUTHTTPRequestWithInvalidMethodForUserDataByID() {
        put_edit_user_data_by_id.sendPUTHTTPRequestWithInvalidMethodForUserDataByID();
    }

    @Then("user received PUT HTTP response code {int} for user data by ID")
    public void userReceivedPUTHTTPResponseCodeForUserDataByID(int arg0) {
        put_edit_user_data_by_id.validatePUTHTTPResponseCode400ForUserDataByID();
    }

    @When("user set invalid ID PUT user data by ID endpoint")
    public void userSetInvalidIDPUTUserDataByIDEndpoint() {
        put_edit_user_data_by_id.setInvalidIDPUTUserDataByIDEndpoint();
    }

    @And("user send PUT HTTP request with invalid ID for user data by ID")
    public void userSendPUTHTTPRequestWithInvalidIDForUserDataByID() {
        put_edit_user_data_by_id.sendPUTHTTPRequestWithInvalidIDForUserDataByID();
    }

    @Then("user received PUT HTTP response code {int} Unauthorized for user data by ID")
    public void userReceivedPUTHTTPResponseCodeUnauthorizedForUserDataByID(int arg0) {
        put_edit_user_data_by_id.validatePUTHTTPResponseCode401ForUserDataByID();
    }
}
