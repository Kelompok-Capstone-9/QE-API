package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Classes.PUT_Edit_Class_By_ID;

public class PUT_Edit_Class_By_IDSteps {
    @Steps
    PUT_Edit_Class_By_ID put_edit_class_by_id;

    @When("admin set valid PUT class by ID endpoint")
    public void adminSetValidPUTClassByIDEndpoint() {
        put_edit_class_by_id.setValidPUTClassByIDEndpoint();
    }

    @And("admin send PUT HTTP request with valid endpoint for edit class by ID")
    public void adminSendPUTHTTPRequestWithValidEndpointForEditClassByID() {
        put_edit_class_by_id.sendPUTHTTPRequestWithValidEndpointForClassByID();
    }

    @Then("admin received valid PUT HTTP response code {int} for edit class by ID")
    public void adminReceivedValidPUTHTTPResponseCodeForEditClassByID(int arg0) {
        put_edit_class_by_id.validateHTTPResponseCode200ForEditClassByID();
    }

    @When("admin set invalid PUT class by ID endpoint")
    public void adminSetInvalidPUTClassByIDEndpoint() {
        put_edit_class_by_id.setInvalidPUTClassByIDEndpoint();
    }

    @And("admin send PUT HTTP request with invalid endpoint for edit class by ID")
    public void adminSendPUTHTTPRequestWithInvalidEndpointForEditClassByID() {
        put_edit_class_by_id.sendPUTHTTPRequestWithInvalidEndpointForClassByID();
    }

    @Then("admin received PUT HTTP response code {int} for edit class by ID")
    public void adminReceivedPUTHTTPResponseCodeForEditClassByID(int arg0) {
        put_edit_class_by_id.validateHTTPResponseCode404ForEditClassByID();
    }

    @And("admin send PUT HTTP request with invalid method for edit class by ID")
    public void adminSendPUTHTTPRequestWithInvalidMethodForEditClassByID() {
        put_edit_class_by_id.sendPUTHTTPRequestWithInvalidMethodForClassByID();
    }

    @Then("admin received PUT HTTP response code {int} Bad Request for edit class by ID")
    public void adminReceivedPUTHTTPResponseCodeBadRequestForEditClassByID(int arg0) {
        put_edit_class_by_id.validateHTTPResponseCode400ForEditClassByID();
    }

    @When("admin set invalid ID PUT class by ID endpoint")
    public void adminSetInvalidIDPUTClassByIDEndpoint() {
        put_edit_class_by_id.setInvalidIDPUTClassByIDEndpoint();
    }

    @And("admin send PUT HTTP request with invalid ID for edit class by ID")
    public void adminSendPUTHTTPRequestWithInvalidIDForEditClassByID() {
        put_edit_class_by_id.sendPUTHTTPRequestWithInvalidIDForClassByID();
    }

    @And("admin send PUT HTTP request with empty request body for edit class by ID")
    public void adminSendPUTHTTPRequestWithEmptyRequestBodyForEditClassByID() {
        put_edit_class_by_id.sendPUTHTTPRequestWithEmptyRequestBodyForClassByID();
    }

    @And("admin send PUT HTTP request with invalid request body for edit class by ID")
    public void adminSendPUTHTTPRequestWithInvalidRequestBodyForEditClassByID() {
        put_edit_class_by_id.sendPUTHTTPRequestWithInvalidRequestBodyForClassByID();
    }
}
