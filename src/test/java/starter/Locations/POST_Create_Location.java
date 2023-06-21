package starter.Locations;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;
import starter.Login_User;

public class POST_Create_Location {

    public String valid_endpoint_CreateLocation = "http://18.141.56.154:8000/admin/locations";
    public String invalid_endpoint_CreteLocation= "http://18.141.56.154:8000/admin/location";



    @Step("set valid POST create Location endpoint")
    public String setValidPOSTCreateEndpoint() {
        return valid_endpoint_CreateLocation;
    }

    @Step("send POST HTTP request with valid endpoint for create Location")
    public void sendPOSTHTTPRequestWithValidEndpointForCreateLocation() {
        String body = "{\n" +
                "    \"name\" : \"GoFit Depok\",\n" +
                "    \"address\" : \"Jl. Margonda Raya 263\",\n" +
                "    \"city\" : \"Depok\",\n" +
                "    \"latitude\" : \"7125471291281241\",\n" +
                "    \"longitude\" : \"123486210381237\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 200 for create Location")
    public void validateHTTPResponseCode201ForCreateLocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(201);
        });
    }

    @Step("set invalid POST create Location endpoint")
    public String setInvalidPOSTcreateEndpoint() {
        return invalid_endpoint_CreteLocation;
    }

    @Step("send POST HTTP request with invalid endpoint for create Location")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateLocation() {
        String body = "{\n" +
                "    \"name\" : \"GoFit Depok\",\n" +
                "    \"address\" : \"Jl. Margonda Raya 263\",\n" +
                "    \"city\" : \"Depok\",\n" +
                "    \"latitude\" : \"7125471291281241\",\n" +
                "    \"longitude\" : \"123486210381237\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setInvalidPOSTcreateEndpoint());
    }

    @Step("received POST HTTP responses code 404 for Location")
    public void validateHTTPResponseCode404ForCreateLocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send POST HTTP request with invalid method for create Location")
    public void sendPOSTHTTPRequestWithInvalidMethodForCreateLocation() {
        String body = "{\n" +
                "    \"name\" : \"GoFit Depok\",\n" +
                "    \"address\" : \"Jl. Margonda Raya 263\",\n" +
                "    \"city\" : \"Depok\",\n" +
                "    \"latitude\" : \"7125471291281241\",\n" +
                "    \"longitude\" : \"123486210381237\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).get(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 405 Method Not Allowed for Location")
    public void validateHTTPResponseCode405MethodNotAllowedForCreateLocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(405);
        });
    }

    @Step("send POST HTTP request with empty request body for Create Location")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForCreateLocation() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 400 for Create Location")
    public void validateHTTPResponseCode400ForCreateLocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send POST HTTP request with invalid request body for Create Location")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocation() {
        String body = "{\n" +
                "    \"nameeeeee\" : \"GoFit Jakbar\",\n" +
                "    \"addresssssss\" : \"Jl. Kembangan Selatan\"\n" +
                "\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }
    @Step("send POST HTTP request with invalid request body for Create Location")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreateLocationUser() {
        String body = "{\n" +
                "    \"name\" : \"GoFit Jakbar\",\n" +
                "    \"address\" : \"Jl. Kembangan Selatan\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 401 unauthorized for Create Location")
    public void validateHTTPResponseCode401ForCreateLocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
