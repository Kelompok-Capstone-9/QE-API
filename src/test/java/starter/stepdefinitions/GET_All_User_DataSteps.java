package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.GET_All_User_Data;

public class GET_All_User_DataSteps {
    @Steps
    GET_All_User_Data get_all_user_data;

    @When("admin set valid GET all user data endpoint")
    public void adminSetValidGETAllUserDataEndpoint() {
        get_all_user_data.setValidGETAllUserDataEndpoint();
    }

    @And("admin send GET HTTP request with valid endpoint for all user data")
    public void adminSendGETHTTPRequestWithValidEndpointForAllUserData() {
        get_all_user_data.sendGETHTTPRequestWithValidEndpointForAllUserData();
    }

    @Then("admin received valid GET HTTP response code {int} for all user data")
    public void adminReceivedValidGETHTTPResponseCodeForAllUserData(int arg0) {
        get_all_user_data.validateGETHTTPResponseCode200ForAllUserData();
    }

    @When("admin set invalid GET all user data endpoint")
    public void adminSetInvalidGETAllUserDataEndpoint() {
        get_all_user_data.setInvalidGETAllUserDataEndpoint();
    }

    @And("admin send GET HTTP request with invalid endpoint for all user data")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllUserData() {
        get_all_user_data.sendGETHTTPRequestWithInvalidEndpointForAllUserData();
    }

    @Then("admin received valid GET HTTP responses code {int} for all user data")
    public void adminReceivedValidGETHTTPResponsesCodeForAllUserData(int arg0) {
        get_all_user_data.validateGETHTTPResponsesCode404ForAllUserData();
    }

    @And("admin send GET HTTP request with invalid method for all user data")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllUserData() {
        get_all_user_data.sendGETHTTPRequestWithInvalidMethodForAllUserData();
    }

    @When("user set valid GET all user data endpoint")
    public void userSetValidGETAllUserDataEndpoint() {
        get_all_user_data.setValidGETAllUserDataEndpointAsUser();
    }

    @And("user send GET HTTP request with valid endpoint for all user data")
    public void userSendGETHTTPRequestWithValidEndpointForAllUserData() {
        get_all_user_data.sendGETHTTPRequestWithValidEndpointForAllUserDataAsUser();
    }

    @Then("user received valid GET HTTP response code {int} for all user data")
    public void userReceivedValidGETHTTPResponseCodeForAllUserData(int arg0) {
        get_all_user_data.validateGETHTTPResponseCode401ForAllUserDataAsUser();
    }

    @Then("admin received GET HTTP response code {int} for all user data")
    public void adminReceivedGETHTTPResponseCodeForAllUserData(int arg0) {
        get_all_user_data.validateGETHTTPResponseCode400ForAllUserDataAsUser();
    }
}
