package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.DELETE_Class_By_ID;

public class DELETE_Class_By_IDSteps {
    @Steps
    DELETE_Class_By_ID delete_class_by_id;

    @When("admin set valid DELETE class by ID endpoint")
    public void adminSetValidDELETEClassByIDEndpoint() {
        delete_class_by_id.setValidDELETEClassByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with valid endpoint for class by ID")
    public void adminSendDELETEHTTPRequestWithValidEndpointForClassByID() {
        delete_class_by_id.sendDELETEHTTPRequestWithValidEndpointForClassByID();
    }

    @Then("admin received valid DELETE HTTP response code {int} for class by ID")
    public void adminReceivedValidDELETEHTTPResponseCodeForClassByID(int arg0) {
        delete_class_by_id.validateDELETEHTTPResponseCode200ForClassByID();
    }

    @When("admin set invalid DELETE class by ID endpoint")
    public void adminSetInvalidDELETEClassByIDEndpoint() {
        delete_class_by_id.setInvalidDELETEClassByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid endpoint for class by ID")
    public void adminSendDELETEHTTPRequestWithInvalidEndpointForClassByID() {
        delete_class_by_id.sendDELETEHTTPRequestWithInvalidEndpointForClassByID();
    }

    @Then("admin received DELETE HTTP response code {int} for class by ID")
    public void adminReceivedDELETEHTTPResponseCodeForClassByID(int arg0) {
        delete_class_by_id.validateDELETEHTTPResponseCode404ForClassByID();
    }

    @And("admin send DELETE HTTP request with invalid method for class by ID")
    public void adminSendDELETEHTTPRequestWithInvalidMethodForClassByID() {
        delete_class_by_id.sendDELETEHTTPRequestWithInvalidMethodForClassByID();
    }

    @Then("admin received DELETE HTTP response code {int} Bad Request for class by ID")
    public void adminReceivedDELETEHTTPResponseCodeBadRequestForClassByID(int arg0) {
        delete_class_by_id.validateDELETEHTTPResponseCode400ForClassByID();
    }

    @When("admin set invalid ID DELETE class by ID endpoint")
    public void adminSetInvalidIDDELETEClassByIDEndpoint() {
        delete_class_by_id.setInvalidIDDELETEClassByIDEndpoint();
    }

    @And("admin send DELETE HTTP request with invalid ID for class by ID")
    public void adminSendDELETEHTTPRequestWithInvalidIDForClassByID() {
        delete_class_by_id.sendDELETEHTTPRequestWithInvalidIDForClassByID();
    }
}
