package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.GET_All_Classes_As_Admin;

public class GET_All_Classes_As_AdminSteps {
    @Steps
    GET_All_Classes_As_Admin get_all_classes_as_admin;

    @When("admin set valid GET all classes endpoint")
    public void adminSetValidGETAllClassesEndpoint() {
        get_all_classes_as_admin.setValidGETAllClassesEndpoint();
    }

    @And("admin send GET HTTP request with valid endpoint for all classes")
    public void adminSendGETHTTPRequestWithValidEndpointForAllClasses() {
        get_all_classes_as_admin.sendGETHTTPRequestWithValidEndpointForAllClasses();
    }

    @Then("admin received valid GET HTTP response code {int} for all classes")
    public void adminReceivedValidGETHTTPResponseCodeForAllClasses(int arg0) {
        get_all_classes_as_admin.validateGETHTTPResponseCode200ForAllClasses();
    }

    @When("admin set invalid GET all classes endpoint")
    public void adminSetInvalidGETAllClassesEndpoint() {
        get_all_classes_as_admin.setInvalidGETAllClassesEndpoint();
    }

    @And("admin send GET HTTP request with invalid endpoint for all classes")
    public void adminSendGETHTTPRequestWithInvalidEndpointForAllClasses() {
        get_all_classes_as_admin.sendGETHTTPRequestWithInvalidEndpointForAllClasses();
    }

    @Then("admin received GET HTTP response code {int} for all classes")
    public void adminReceivedGETHTTPResponseCodeForAllClasses(int arg0) {
        get_all_classes_as_admin.validateGETHTTPResponseCode404ForAllClasses();
    }

    @And("admin send GET HTTP request with invalid method for all classes")
    public void adminSendGETHTTPRequestWithInvalidMethodForAllClasses() {
        get_all_classes_as_admin.sendGETHTTPRequestWithInvalidMethodForAllClasses();
    }

    @Then("admin received GET HTTP response code {int} Bad Request for all classes")
    public void adminReceivedGETHTTPResponseCodeBadRequestForAllClasses(int arg0) {
        get_all_classes_as_admin.validateGETHTTPResponseCode400ForAllClasses();
    }
}
