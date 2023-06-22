package starter.ClassPackages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;
import starter.Login_User;

public class PUT_Edit_ClassPackages_By_ID {
    public String valid_endpoint_ClassPackages= "http://18.141.56.154:8000/admin/classes/packages/2";
    public String invalid_endpoint_ClassPackages = "http://18.141.56.154:8000/admin/classes/packag/2";


    @Step("set valid PUT Edit ClassPackages endpoint")
    public String setValidPUTEditEndpoint() {
        return valid_endpoint_ClassPackages;
    }

    @Step("send PUT HTTP request with valid endpoint for Edit ClassPackages")
    public void sendPUTHTTPRequestWithValidEndpointForEditClassPackages() {
        String body = "{\n" +
                "    \"price\" : 399000\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received PUT HTTP response code 200 for Edit ClassPackages")
    public void validateHTTPResponseCode200ForEditClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid PUT Edit ClassPackages endpoint")
    public String setInvalidPUTEditEndpoint() {
        return invalid_endpoint_ClassPackages;
    }

    @Step("send PUT HTTP request with invalid endpoint for Edit ClassPackages")
    public void sendPUTHTTPRequestWithInvalidEndpointForEditClassPackages() {
        String body = "{\n" +
                "    \"price\" : 399000\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setInvalidPUTEditEndpoint());
    }

    @Step("received PUT HTTP responses code 404 for Edit ClassPackages")
    public void validateHTTPResponseCode404ForEditClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send PUT HTTP request with invalid method for Edit ClassPackages")
    public void sendPUTHTTPRequestWithInvalidMethodForEditClassPackages() {
        String body = "{\n" +
                "    \"price\" : 399000\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPUTEditEndpoint());
    }

    @Step("send PUT HTTP request with empty request body for Edit ClassPackages")
    public void sendPUTHTTPRequestWithEmptyRequestBodyForEditClassPackages() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received valid PUT HTTP response code 400 for Edit ClassPackages")
    public void validateHTTPResponseCode400ForEditClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send PUT HTTP request with invalid request body for Edit ClassPackages")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForEditClassPackages() {
        String body = "{\n" +
                "    \"priceees\" : 399000\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }
    @Step("send PUT HTTP request with invalid request body for Edit ClassPackages")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForEditClassPackagesUser() {
        String body = "{\n" +
                "    \"price\" : 399000\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "bearer " + Login_User.token_user).contentType("application/json").body(reqBody.toString()).put(setValidPUTEditEndpoint());
    }

    @Step("received valid PUT HTTP response code 401 unauthorized for Edit ClassPackages")
    public void validateHTTPResponseCode401ForEditClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
