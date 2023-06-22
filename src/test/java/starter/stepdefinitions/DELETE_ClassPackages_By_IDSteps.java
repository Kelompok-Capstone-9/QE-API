package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ClassPackages.DELETE_ClassPackages_By_ID;

public class DELETE_ClassPackages_By_IDSteps {
    @Steps
    DELETE_ClassPackages_By_ID deleteClassPackagesById;
    @When("admin set valid DELETE ClassPackages by ID endpoint")
    public void adminSetValidDELETEClassPackagesByIDEndpoint() {
        deleteClassPackagesById.setValidDELETEClassPackagesByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with valid endpoint for ClassPackages by ID")
    public void adminSendDELETEHTTPRequestWithValidEndpointForClassPackagesByID() {
        deleteClassPackagesById.sendDELETEHTTPRequestWithValidEndpointForClassPackagesByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} for ClassPackages by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeForClassPackagesByID(int arg0) {
        deleteClassPackagesById.validateDELETEHTTPResponseCode200ForClassPackagesByID();
    }

    @When("admin set invalid DELETE ClassPackages by ID endpoint")
    public void adminSetInvalidDELETEClassPackagesByIDEndpoint() {
        deleteClassPackagesById.setInvalidDELETEClassPackagesByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid endpoint for ClassPackages by ID")
    public void adminSendDELETEHTTPRequestWithInvalidEndpointForClassPackagesByID() {
        deleteClassPackagesById.sendDELETEHTTPRequestWithInvalidEndpointForClassPackagesByID();
    }

    @Then("admin received valid DELETE HTTP responses code {int} for ClassPackages by ID")
    public void adminReceivedValidDELETEHTTPResponsesCodeForClassPackagesByID(int arg0) {
        deleteClassPackagesById.validateDELETEHTTPResponseCode404ForClassPackagesByID();
    }

    @And("admin send DELETE HTTP request with invalid method for ClassPackages by ID")
    public void adminSendDELETEHTTPRequestWithInvalidMethodForClassPackagesByID() {
        deleteClassPackagesById.sendDELETEHTTPRequestWithInvalidMethodForClassPackagesByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} Bad Request for ClassPackages by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeBadRequestForClassPackagesByID(int arg0) {
        deleteClassPackagesById.validateDELETEHTTPResponseCode400ForClassPackagesByID();
    }

    @When("admin set invalid ID DELETE ClassPackages by ID endpoint")
    public void adminSetInvalidIDDELETEClassPackagesByIDEndpoint() {
        deleteClassPackagesById.setInvalidIDDELETEClassPackagesByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid ID for ClassPackages by ID")
    public void adminSendDELETEHTTPRequestWithInvalidIDForClassPackagesByID() {
        deleteClassPackagesById.sendDELETEHTTPRequestWithInvalidIDForClassPackagesByID();
    }

    @When("user set valid DELETE ClassPackages by ID endpoint")
    public void userSetValidDELETEClassPackagesByIDEndpoint() {
        deleteClassPackagesById.setValidDELETEClassPackagesByIDEndpoint();
    }

    @And("user send DELETE HTTP request for ClassPackages by ID")
    public void userSendDELETEHTTPRequestForClassPackagesByID() {
        deleteClassPackagesById.sendDELETEHTTPRequestForClassPackagesByID();

    }
}
