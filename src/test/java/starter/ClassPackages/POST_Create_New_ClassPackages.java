package starter.ClassPackages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;
import starter.Login_User;

public class POST_Create_New_ClassPackages {
    public String valid_endpoint_ClassPackages = "http://18.141.56.154:8000/admin/classes/packages";
    public String invalid_endpoint_ClassPackages= "http://18.141.56.154:8000/admin/classes/packag";



    @Step("set valid POST create ClassPackages endpoint")
    public String setValidPOSTCreateEndpoint() {
        return valid_endpoint_ClassPackages;
    }

    @Step("send POST HTTP request with valid endpoint for create ClassPackages")
    public void sendPOSTHTTPRequestWithValidEndpointForCreateClassPackages() {
        String body = "{\n" +
                "    \"period\" : \"monthly\",\n" +
                "    \"price\" : 299000,\n" +
                "    \"class\" : {\n" +
                "       \"id\" : 1\n" +
                "    }\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 200 for create ClassPackages")
    public void validateHTTPResponseCode201ForCreateClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(201);
        });
    }

    @Step("set invalid POST create ClassPackages endpoint")
    public String setInvalidPOSTcreateEndpoint() {
        return invalid_endpoint_ClassPackages;
    }

    @Step("send POST HTTP request with invalid endpoint for create ClassPackages")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateClassPackages() {
        String body = "{\n" +
                "    \"period\" : \"monthly\",\n" +
                "    \"price\" : 299000,\n" +
                "    \"class\" : {\n" +
                "       \"id\" : 1\n" +
                "    }\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setInvalidPOSTcreateEndpoint());
    }

    @Step("received POST HTTP responses code 404 for ClassPackages")
    public void validateHTTPResponseCode404ForCreateClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send POST HTTP request with invalid method for create ClassPackages")
    public void sendPOSTHTTPRequestWithInvalidMethodForCreateClassPackages() {
        String body = "{\n" +
                "    \"period\" : \"monthly\",\n" +
                "    \"price\" : 299000,\n" +
                "    \"class\" : {\n" +
                "       \"id\" : 1\n" +
                "    }\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPOSTCreateEndpoint());
    }

    @Step("received POST HTTP response code 405 Method Not Allowed for ClassPackages")
    public void validateHTTPResponseCode405MethodNotAllowedForCreateClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(405);
        });
    }

    @Step("send POST HTTP request with empty request body for Create ClassPackages")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForCreateClassPackages() {
        String body = "{ }";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 400 for Create ClassPackages")
    public void validateHTTPResponseCode400ForCreateClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("send POST HTTP request with invalid request body for Create ClassPackages")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreateClassPackages() {
        String body = "{\n" +
                "    \"period\" : \"monthly\",\n" +
                "    \"price\" : 299000,\n" +
                "    \"class\" : {\n" +
                "    }\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }
    @Step("send POST HTTP request with invalid request body for Create ClassPackages")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForCreateClassPackagesUser() {
        String body = "{\n" +
                "    \"period\" : \"monthly\",\n" +
                "    \"price\" : 299000,\n" +
                "    \"class\" : {\n" +
                "       \"id\" : 1\n" +
                "    }\n" +
                "    \n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(reqBody.toString()).post(setValidPOSTCreateEndpoint());
    }

    @Step("received valid POST HTTP response code 401 unauthorized for Create ClassPackages")
    public void validateHTTPResponseCode401ForCreateClassPackages() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}

