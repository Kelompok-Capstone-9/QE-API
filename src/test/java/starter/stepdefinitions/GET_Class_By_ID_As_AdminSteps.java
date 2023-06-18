package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.GET_All_Classes_As_Admin;
import starter.Classes.GET_Class_By_ID_As_Admin;

public class GET_Class_By_ID_As_AdminSteps {
    @Steps
    GET_Class_By_ID_As_Admin get_class_by_id_as_admin;

    @When("admin set valid GET class by ID endpoint")
    public void adminSetValidGETClassByIDEndpoint() {
        get_class_by_id_as_admin.setValidGETClassByIDEndpoint();
    }

    @And("admin send GET HTTP request with valid endpoint for class by ID")
    public void adminSendGETHTTPRequestWithValidEndpointForClassByID() {
        get_class_by_id_as_admin.sendGETHTTPRequestWithValidEndpointForClassByID();
    }

    @Then("admin received valid GET HTTP response code {int} for class by ID")
    public void adminReceivedValidGETHTTPResponseCodeForClassByID(int arg0) {
        get_class_by_id_as_admin.validateGETHTTPResponseCode200ForClassByID();
    }

    @When("admin set invalid GET class by ID endpoint")
    public void adminSetInvalidGETClassByIDEndpoint() {
        get_class_by_id_as_admin.setInvalidGETClassByIDEndpoint();
    }

    @And("admin send GET HTTP request with invalid endpoint for class by ID")
    public void adminSendGETHTTPRequestWithInvalidEndpointForClassByID() {
        get_class_by_id_as_admin.sendGETHTTPRequestWithInvalidEndpointForClassByID();
    }

    @Then("admin received GET HTTP response code {int} for class by ID")
    public void adminReceivedGETHTTPResponseCodeForClassByID(int arg0) {
        get_class_by_id_as_admin.validateGETHTTPResponseCode404ForClassByID();
    }

    @And("admin send GET HTTP request with invalid method for class by ID")
    public void adminSendGETHTTPRequestWithInvalidMethodForClassByID() {
        get_class_by_id_as_admin.sendGETHTTPRequestWithInvalidMethodForClassByID();
    }

    @When("admin set invalid ID GET class by ID endpoint")
    public void adminSetInvalidIDGETClassByIDEndpoint() {
        get_class_by_id_as_admin.setInvalidIDGETClassByIDEndpoint();
    }

    @And("admin send GET HTTP request with invalid ID for class by ID")
    public void adminSendGETHTTPRequestWithInvalidIDForClassByID() {
        get_class_by_id_as_admin.sendGETHTTPRequestWithInvalidIDForClassByID();
    }
}
