package starter.Plan;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;

public class PUT_Update_Plan {
    public String valid_endpoint_Updateplan = "http://18.141.56.154:8000/admin/plans/5";
    public String invalid_endpoint_Updatelan = "http://18.141.56.154:8000/admin/plant/5";

    public PUT_Update_Plan() {
    }

    @Step("set valid PUT Update plan endpoint")
    public String setValidPOSTCreateEndpoint() {
        return valid_endpoint_Updateplan;
    }

    @Step("send PUT HTTP request with valid endpoint for Update plan")
    public void sendPUTHTTPRequestWithValidEndpointForUpdatePlan() {
        String body = "{\n  \"name\": \"test u Year\",\n  \"duration\": 460,\n  \"price\": 899000\n}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPOSTCreateEndpoint());
    }

    @Step("received PUT HTTP response code 200 for Update plan")
    public void validateHTTPResponseCode200ForUpdatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid PUT Update plan endpoint")
    public String setInvalidPUTUpdateEndpoint() {
        return invalid_endpoint_Updatelan;
    }

    @Step("send PUT HTTP request with invalid endpoint for Update plan")
    public void sendPUTHTTPRequestWithInvalidEndpointForUpdatePlan() {
        String body = "{\n  \"name\": \"test u Year\",\n  \"duration\": 460,\n  \"price\": 899000\n}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setInvalidPUTUpdateEndpoint());
    }

    @Step("received PUT HTTP responses code 404 for Update plan")
    public void validateHTTPResponseCode404ForUpdatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send PUT HTTP request with invalid method for Update plan")
    public void sendPUTHTTPRequestWithInvalidMethodForUpdatePlan() {
        String body = "{\n  \"name\": \"test u Year\",\n  \"duration\": 460,\n  \"price\": 899000\n}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).get(setValidPOSTCreateEndpoint());
    }

    @Step("send PUT HTTP request with empty request body for Update Plan")
    public void sendPUTHTTPRequestWithEmptyRequestBodyForUpdatePlan() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPOSTCreateEndpoint());
    }

    @Step("received valid PUT HTTP response code 400 for Update Plan")
    public void validateHTTPResponseCode400ForUpdatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send PUT HTTP request with invalid request body for Update Plan")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForUpdatePlan() {
        String body = "{\"email\":\"nada@gmail.com\", \"password\": \"riza123\" }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPOSTCreateEndpoint());
    }

    @Step("received valid PUT HTTP response code 401 unauthorized for Update Plan")
    public void validateHTTPResponseCode401ForUpdatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
