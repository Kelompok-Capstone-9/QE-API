package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ClassPackages.GET_All_ClassPackages_By_ID;

public class GET_All_ClassPackage_By_IDSteps {
    @Steps
    GET_All_ClassPackages_By_ID getAllClassPackagesById;
    @When("admin set valid GET all ClassPackage by ID endpoint")
    public void adminSetValidGETAllClassPackageByIDEndpoint() {
        getAllClassPackagesById.setEnpointGetvalid();
    }

    @And("admin send GET HTTP request with valid endpoint for all ClassPackage by ID")
    public void adminSendGETHTTPRequestWithValidEndpointForAllClassPackageByID() {
        getAllClassPackagesById.sendGetUserInfo();
    }

    @Then("admin received valid GET HTTP response code {int} for all ClassPackage by ID")
    public void adminReceivedValidGETHTTPResponseCodeForAllClassPackageByID(int arg0) {
        getAllClassPackagesById.UserGetUserInformationStatusCode200();
    }

    @When("admin set invalid GET all ClassPackage by ID endpoint")
    public void adminSetInvalidGETAllClassPackageByIDEndpoint() {
        getAllClassPackagesById.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid endpoint for all ClassPackage by ID")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllClassPackageByID() {
        getAllClassPackagesById.sendGetUserInfoInvalid();
    }

    @Then("admin received valid GET HTTP responses code {int} for all ClassPackage by ID")
    public void adminReceivedValidGETHTTPResponsesCodeForAllClassPackageByID(int arg0) {
        getAllClassPackagesById.UserGetUserInformationStatusCode404();
    }

    @And("admin send GET HTTP request with invalid method for all ClassPackage by ID")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllClassPackageByID() {
        getAllClassPackagesById.sendGetUserInfoInvalidMethod();
    }

    @Then("admin received valid GET HTTP responses code {int} all ClassPackage by ID")
    public void adminReceivedValidGETHTTPResponsesCodeAllClassPackageByID(int arg0) {
        getAllClassPackagesById.UserGetUserInformationStatusCode404();
    }

    @When("admin set invalid ID GET all ClassPackage by ID endpoint")
    public void adminSetInvalidIDGETAllClassPackageByIDEndpoint() {
        getAllClassPackagesById.setEnpointGetInvalid();
    }

    @And("admin send GET HTTP request with invalid ID for all ClassPackage by ID")
    public void adminSendGETHTTPRequestWithInvalidIDForAllClassPackageByID() {
        getAllClassPackagesById.sendGetUserInfoInvalidID();
    }
    @Then("admin received valid GET HTTP responses code {int} for allClassPackage by ID")
    public void adminReceivedValidGETHTTPResponsesCodeForAllClassPackageByID_(int arg0) {
        getAllClassPackagesById.UserGetUserInformationStatusCode400();
    }
}
