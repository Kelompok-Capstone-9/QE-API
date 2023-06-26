package starter.Membership;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;
import starter.Login_User;

public class POST_Create_Membership {
    public String valid_endpoint_Membership = "http://18.141.56.154:8000/admin/memberships";
    public String invalid_endpoint_Membership= "http://18.141.56.154:8000/memberships";



    @Step("set valid POST create Membership endpoint")
    public String setValidPOSTCreateEndpoint() {
        return valid_endpoint_Membership;
    }

    @Step("send POST HTTP request with valid endpoint for create Membership")
    public void sendPOSTHTTPRequestWithValidEndpointForCreateMembership() {
        String body = "{\n" +
                "  \"user\": {\n" +
                "      \"id\" : 1\n" +
                "  },\n" +
                "  \"plan\" : {\n" +
                "      \"id\" : 3\n" +
                "  },\n" +
                "  \"start_date\": \"2023-09-01 00:00:00\",\n" +
                "  \"end_date\": \"2024-09-30 00:00:00\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 200 for create Membership")
    public void validateHTTPResponseCode201ForCreateMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(201);
        });
    }

    @Step("set invalid POST create Membership endpoint")
    public String setInvalidPOSTcreateEndpoint() {
        return invalid_endpoint_Membership;
    }

    @Step("send POST HTTP request with invalid endpoint for create Membership")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateMembership() {
        String body = "{\n" +
                "  \"user\": {\n" +
                "      \"id\" : 1\n" +
                "  },\n" +
                "  \"plan\" : {\n" +
                "      \"id\" : 3\n" +
                "  },\n" +
                "  \"start_date\": \"2023-09-01 00:00:00\",\n" +
                "  \"end_date\": \"2024-09-30 00:00:00\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setInvalidPOSTcreateEndpoint());
    }

    @Step("received POST HTTP responses code 404 for Membership")
    public void validateHTTPResponseCode404ForCreateMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send POST HTTP request with invalid method for create Membership")
    public void sendPOSTHTTPRequestWithInvalidMethodForCreateMembership() {
        String body = "{\n" +
                "  \"user\": {\n" +
                "      \"id\" : 1\n" +
                "  },\n" +
                "  \"plan\" : {\n" +
                "      \"id\" : 3\n" +
                "  },\n" +
                "  \"start_date\": \"2023-09-01 00:00:00\",\n" +
                "  \"end_date\": \"2024-09-30 00:00:00\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 405 Method Not Allowed for Membership")
    public void validateHTTPResponseCode405MethodNotAllowedForCreateMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(405);
        });
    }

    @Step("send POST HTTP request with empty request body for Create Membership")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForCreateMembership() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 400 for Create Membership")
    public void validateHTTPResponseCode400ForCreateMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send POST HTTP request with invalid request body for Create Membership")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreateMembership() {
        String body = "{\n" +
                "  \"user\": {\n" +
                "  },\n" +
                "  \"plan\" : {\n" +
                "  },\n" +
                "  \"start_date\": \"2023-09-01 00:00:00\",\n" +
                "  \"end_date\": \"2024-09-30 00:00:00\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }
    @Step("send POST HTTP request with invalid request body for Create Membership")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreateMembershipsUser() {
        String body = "{\n" +
                "  \"user\": {\n" +
                "      \"id\" : 1\n" +
                "  },\n" +
                "  \"plan\" : {\n" +
                "      \"id\" : 3\n" +
                "  },\n" +
                "  \"start_date\": \"2023-09-01 00:00:00\",\n" +
                "  \"end_date\": \"2024-09-30 00:00:00\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 401 unauthorized for Create Membership")
    public void validateHTTPResponseCode401ForCreateMembership() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
