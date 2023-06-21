package starter.Locations;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;
import starter.Login_User;

public class PUT_Edit_Location_By_ID {
    public String valid_endpoint_EditLocation= "http://18.141.56.154:8000/admin/locations/1";
    public String invalid_endpoint_EditLocation = "http://18.141.56.154:8000/admin/location/1";


    @Step("set valid PUT Edit location endpoint")
    public String setValidPUTEditEndpoint() {
        return valid_endpoint_EditLocation;
    }

    @Step("send PUT HTTP request with valid endpoint for Edit location")
    public void sendPUTHTTPRequestWithValidEndpointForEditlocation() {
        String body = "{\n" +
                "    \"address\" : \"Jl. Otista No.251 Jakarta Timur\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received PUT HTTP response code 200 for Edit location")
    public void validateHTTPResponseCode200ForEditlocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid PUT Edit location endpoint")
    public String setInvalidPUTEditEndpoint() {
        return invalid_endpoint_EditLocation;
    }

    @Step("send PUT HTTP request with invalid endpoint for Edit location")
    public void sendPUTHTTPRequestWithInvalidEndpointForEditlocation() {
        String body = "{\n" +
                "    \"address\" : \"Jl. Otista No.251 Jakarta Timur\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setInvalidPUTEditEndpoint());
    }

    @Step("received PUT HTTP responses code 404 for Edit location")
    public void validateHTTPResponseCode404ForEditlocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send PUT HTTP request with invalid method for Edit location")
    public void sendPUTHTTPRequestWithInvalidMethodForEditlocation() {
        String body = "{\n" +
                "    \"address\" : \"Jl. Otista No.251 Jakarta Timur\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).get(setValidPUTEditEndpoint());
    }

    @Step("send PUT HTTP request with empty request body for Edit location")
    public void sendPUTHTTPRequestWithEmptyRequestBodyForEditlocation() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received valid PUT HTTP response code 400 for Edit location")
    public void validateHTTPResponseCode400ForEditlocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send PUT HTTP request with invalid request body for Edit location")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForEditlocation() {
        String body = "{\n" +
                "    \"address\" : \"Jl. Otista No.251 Jakarta Timur\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }
    @Step("send PUT HTTP request with invalid request body for Edit location")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForEditlocationUser() {
        String body = "{\n" +
                "    \"address\" : \"Jl. Otista No.251 Jakarta Timur\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login_User.token_user).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received valid PUT HTTP response code 401 unauthorized for Edit location")
    public void validateHTTPResponseCode401ForEditlocation() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
