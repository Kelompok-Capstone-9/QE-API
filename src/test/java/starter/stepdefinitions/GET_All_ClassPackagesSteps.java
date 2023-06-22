package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ClassPackages.GET_All_ClassPackages;

public class GET_All_ClassPackagesSteps {
    @Steps
    GET_All_ClassPackages getAllClassPackages;
    @When("admin set valid GET all ClassPackages endpoint")
    public void adminSetValidGETAllClassPackagesEndpoint() {
        getAllClassPackages.setEnpointGetvalid();

    }

    @And("admin send GET HTTP request with valid endpoint for all ClassPackages")
    public void adminSendGETHTTPRequestWithValidEndpointForAllClassPackages() {
        getAllClassPackages.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all ClassPackages")
    public void adminReceivedValidGETHTTPResponseCodeForAllClassPackages(int arg0) {
        getAllClassPackages.UserGetUserInformationStatusCode200();
    }

    @And("admin send GET HTTP request with invalid endpoint for all ClassPackages")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllClassPackages() {
        getAllClassPackages.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} for all ClassPackages")
    public void adminReceivedValidGETHTTPResponsesCodeForAllClassPackages(int arg0) {
        getAllClassPackages.UserGetUserInformationStatusCode404();
    }

    @And("admin send GET HTTP request with invalid method for all ClassPackages")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllClassPackages() {
        getAllClassPackages.sendGetUserInfoInvalidMethod();
    }


    @Then("admin received valid GET HTTP responses code {int} forall ClassPackages")
    public void adminReceivedValidGETHTTPResponsesCodeForallClassPackages(int arg0) {
        getAllClassPackages.UserGetUserInformationStatusCode400();
    }
}
