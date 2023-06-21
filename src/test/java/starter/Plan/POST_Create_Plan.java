
package starter.Plan;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;

public class POST_Create_Plan {
    public String valid_endpoint_Createplan = "http://18.141.56.154:8000/admin/plans";
    public String invalid_endpoint_Creteplan = "http://18.141.56.154:8000/admin/plant";

    public POST_Create_Plan() {
    }

    @Step("set valid POST create plan endpoint")
    public String setValidPOSTCreateEndpoint() {
        return valid_endpoint_Createplan;
    }

    @Step("send POST HTTP request with valid endpoint for create plan")
    public void sendPOSTHTTPRequestWithValidEndpointForCreatePlan() {
        String body = "{\n  \"name\": \"Super Yearly\",\n  \"duration\": 180,\n  \"price\": 289990,\n  \"description\":\"Unlimited Healthtips Content \\nUnlimited Video Content Library \\nCancel Anytime\"\n}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 200 for create plan")
    public void validateHTTPResponseCode201ForCreatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(201);
        });
    }

    @Step("set invalid POST create plan endpoint")
    public String setInvalidPOSTcreateEndpoint() {
        return invalid_endpoint_Creteplan;
    }

    @Step("send POST HTTP request with invalid endpoint for create plan")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreatePlan() {
        String body = "{\n  \"name\": \"Super Yearly\",\n  \"duration\": 180,\n  \"price\": 289990,\n  \"description\":\"Unlimited Healthtips Content \\nUnlimited Video Content Library \\nCancel Anytime\"\n}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setInvalidPOSTcreateEndpoint());
    }

    @Step("received POST HTTP responses code 404 for login")
    public void validateHTTPResponseCode404ForCreatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send POST HTTP request with invalid method for create plan")
    public void sendPOSTHTTPRequestWithInvalidMethodForCreatePlan() {
        String body = "{\n  \"name\": \"Super Yearly\",\n  \"duration\": 180,\n  \"price\": 289990,\n  \"description\":\"Unlimited Healthtips Content \\nUnlimited Video Content Library \\nCancel Anytime\"\n}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).get(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 405 Method Not Allowed for login")
    public void validateHTTPResponseCode405MethodNotAllowedForCreatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(405);
        });
    }

    @Step("send POST HTTP request with empty request body for Create Plan")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForCreatePlan() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 400 for Create Plan")
    public void validateHTTPResponseCode400ForCreatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send POST HTTP request with invalid request body for Create Plan")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreatePlan() {
        String body = "{\"email\":\"nada@gmail.com\", \"password\": \"riza123\" }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 401 unauthorized for Create Plan")
    public void validateHTTPResponseCode401ForCreatePlan() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
