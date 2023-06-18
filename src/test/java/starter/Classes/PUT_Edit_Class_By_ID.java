package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PUT_Edit_Class_By_ID {
    public String valid_url_class = "http://18.141.56.154:8000/admin/classes/8";
    public String invalid_url_class = "http://18.141.56.154:8000/admin/class/8";
    public String invalid_ID_Class = "http://18.141.56.154:8000/admin/classes/80";

    @Step("set valid PUT class by ID endpoint")
    public String setValidPUTClassByIDEndpoint(){
        return valid_url_class;
    }

    @Step("send PUT HTTP request with valid endpoint for edit class by ID")
    public void sendPUTHTTPRequestWithValidEndpointForClassByID(){
        String body = "{\n" +
                "    \"started_at\" : \"2023-06-27 08:00:00\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTClassByIDEndpoint());
    }

    @Step("received PUT HTTP response code 200 for edit class ID")
    public void validateHTTPResponseCode200ForEditClassByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid PUT class by ID endpoint")
    public String setInvalidPUTClassByIDEndpoint(){
        return invalid_url_class;
    }

    @Step("send PUT HTTP request with invalid endpoint for edit class by ID")
    public void sendPUTHTTPRequestWithInvalidEndpointForClassByID(){
        String body = "{\n" +
                "    \"started_at\" : \"2023-06-27 08:00:00\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setInvalidPUTClassByIDEndpoint());
    }

    @Step("received PUT HTTP response code 404 for edit class ID")
    public void validateHTTPResponseCode404ForEditClassByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send PUT HTTP request with invalid method for edit class by ID")
    public void sendPUTHTTPRequestWithInvalidMethodForClassByID(){
        String body = "{\n" +
                "    \"started_at\" : \"2023-06-27 08:00:00\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPUTClassByIDEndpoint());
    }

    @Step("received PUT HTTP response code 400 for edit class ID")
    public void validateHTTPResponseCode400ForEditClassByID(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("set invalid ID PUT class by ID endpoint")
    public String setInvalidIDPUTClassByIDEndpoint(){
        return invalid_ID_Class;
    }

    @Step("send PUT HTTP request with invalid ID for edit class by ID")
    public void sendPUTHTTPRequestWithInvalidIDForClassByID(){
        String body = "{\n" +
                "    \"started_at\" : \"2023-06-27 08:00:00\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setInvalidIDPUTClassByIDEndpoint());
    }

    @Step("send PUT HTTP request with empty request body for edit class by ID")
    public void sendPUTHTTPRequestWithEmptyRequestBodyForClassByID(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTClassByIDEndpoint());
    }

    @Step("send PUT HTTP request with invalid request body for edit class by ID")
    public void sendPUTHTTPRequestWithInvalidRequestBodyForClassByID(){
        String body = "{\n" +
                "    \"started_at\" : \"27-06-2023 08:00:00\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPUTClassByIDEndpoint());
    }
}
