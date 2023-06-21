package starter.Plan;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

public class DELETE_Plan_By_ID {
    public String validUrlUserByID = "http://18.141.56.154:8000/admin/plans/5";
    public String invalidUrlUserByID = "http://18.141.56.154:8000/admin/plans/100";
    public String invalidIDUrl = "http://18.141.56.154:8000/admin/plants/5";

    public DELETE_Plan_By_ID() {
    }

    @Step("set valid DELETE Plan by ID endpoint")
    public String setValidDELETEPlanByIDEndpoint() {
        return validUrlUserByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for Plan by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForPlanByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setValidDELETEPlanByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for Plan by ID")
    public void validateDELETEHTTPResponseCode200ForPlanByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid DELETE Plan by ID endpoint")
    public String setInvalidDELETEPlanByIDEndpoint() {
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid endpoint for Plan by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForPlanByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidDELETEPlanByIDEndpoint());
    }

    @Step("received valid DELETE HTTP responses code 404 for Plan by ID")
    public void validateDELETEHTTPResponseCode404ForPlanByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send DELETE HTTP request with invalid method for Plan by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForPlanByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidDELETEPlanByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 400 Bad Request for Plan by ID")
    public void validateDELETEHTTPResponseCode400ForPlanByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("set invalid ID DELETE Plan by ID endpoint")
    public String setInvalidIDDELETEPlanByIDEndpoint() {
        return invalidUrlUserByID;
    }

    @Step("send DELETE HTTP request with invalid ID for Plan by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForPlanByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidIDDELETEPlanByIDEndpoint());
    }

    @Step("send DELETE HTTP request for Plan by ID")
    public void sendDELETEHTTPRequestForPlanByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).delete(setValidDELETEPlanByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 401 for Plan by ID")
    public void validateDELETEHTTPResponseCode401ForPlanByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
