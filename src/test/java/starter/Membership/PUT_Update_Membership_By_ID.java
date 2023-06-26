package starter.Membership;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;
import starter.Login_User;

public class PUT_Update_Membership_By_ID {
    public String valid_endpoint_Membership= "http://18.141.56.154:8000/admin/memberships/1";
    public String invalid_endpoint_Membership = "http://18.141.56.154:8000/memberships/1";


    @Step("set valid PUT Edit Membership endpoint")
    public String setValidPUTEditEndpoint() {
        return valid_endpoint_Membership;
    }

    @Step("send PUT HTTP request with valid endpoint for Edit Membership")
    public void sendPUTHTTPRequestWithValidEndpointForEditMembership() {
        String body = "{\n" +
                "  \"user_id\": 1,\n" +
                "  \"plan_id\": 3,\n" +
                "  \"start_date\": \"2023-04-01 15:04:05\",\n" +
                "  \"end_date\": \"2024-04-30 15:04:05\"\n" +
                "}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received PUT HTTP response code 200 for Edit Membership")
    public void validateHTTPResponseCode200ForEditMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid PUT Edit Membership endpoint")
    public String setInvalidPUTEditEndpoint() {
        return invalid_endpoint_Membership;
    }

    @Step("send PUT HTTP request with invalid endpoint for Edit Membership")
    public void sendPUTHTTPRequestWithInvalidEndpointForEditMembership() {
        String body = "{\n" +
                "  \"user_id\": 1,\n" +
                "  \"plan_id\": 3,\n" +
                "  \"start_date\": \"2023-04-01 15:04:05\",\n" +
                "  \"end_date\": \"2024-04-30 15:04:05\"\n" +
                "}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setInvalidPUTEditEndpoint());
    }

    @Step("received PUT HTTP responses code 404 for Edit Membership")
    public void validateHTTPResponseCode404ForEditMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send PUT HTTP request with invalid method for Edit Membership")
    public void sendPUTHTTPRequestWithInvalidMethodForEditMembership() {
        String body = "{\n" +
                "  \"user_id\": 1,\n" +
                "  \"plan_id\": 3,\n" +
                "  \"start_date\": \"2023-04-01 15:04:05\",\n" +
                "  \"end_date\": \"2024-04-30 15:04:05\"\n" +
                "}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPUTEditEndpoint());
    }

    @Step("send PUT HTTP request with empty request body for Edit Membership")
    public void sendPUTHTTPRequestWithEmptyRequestBodyForEditMembership() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received valid PUT HTTP response code 400 for Edit Membership")
    public void validateHTTPResponseCode400ForEditMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send PUT HTTP request with invalid request body for Edit Membership")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForEditMembership() {
        String body = "{\n" +
                "  \"start_date\": \"2023-04-01 15:04:05\",\n" +
                "  \"end_date\": \"2024-04-30 15:04:05\"\n" +
                "}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }
    @Step("send PUT HTTP request with invalid request body for Edit Membership")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForEditMembershipsUser() {
        String body = "{\n" +
                "  \"user_id\": 1,\n" +
                "  \"plan_id\": 3,\n" +
                "  \"start_date\": \"2023-04-01 15:04:05\",\n" +
                "  \"end_date\": \"2024-04-30 15:04:05\"\n" +
                "}\n";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login_User.token_user).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received valid PUT HTTP response code 401 unauthorized for Edit Membership")
    public void validateHTTPResponseCode401ForEditMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
