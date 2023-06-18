package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_New_Class {
    public String valid_endpoint_class = "http://18.141.56.154:8000/admin/classes";
    public String invalid_endpoint_class = "http://18.141.56.154:8000/admin/class";

    @Step("set valid POST new class endpoint")
    public String setValidPOSTNewClassEndpoint(){
        return valid_endpoint_class;
    }

    @Step("send POST HTTP request with valid endpoint for new class")
    public void sendPOSTHTTPRequestWithValidEndpointForNewClass(){
        String body = "{\n" +
                "    \"name\" : \"Zumba Class\",\n" +
                "    \"description\" : \"Kelas khusus untuk meningkatkan kesehatan sistem kardiovaskular\",\n" +
                "    \"class_type\" : \"online\",\n" +
                "    \"started_at\" : \"2023-06-18 07:30:00\",\n" +
                "    \"link\" : \"https://zoom.us/zumba-classroom\"\n" +
                "    \n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTNewClassEndpoint());
    }

    @Step("received POST HTTP response code 201 for new class")
    public void validateHTTPResponseCode201ForNewClass(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("set invalid POST new class endpoint")
    public String setInvalidPOSTNewClassEndpoint(){
        return invalid_endpoint_class;
    }

    @Step("send POST HTTP request with invalid endpoint for new class")
    public void sendPOSTHTTPRequestWithInvalidEndpointForNewClass(){
        String body = "{\n" +
                "    \"name\" : \"Zumba Class\",\n" +
                "    \"description\" : \"Kelas khusus untuk meningkatkan kesehatan sistem kardiovaskular\",\n" +
                "    \"class_type\" : \"online\",\n" +
                "    \"started_at\" : \"2023-06-18 07:30:00\",\n" +
                "    \"link\" : \"https://zoom.us/zumba-classroom\"\n" +
                "    \n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setInvalidPOSTNewClassEndpoint());
    }

    @Step("received POST HTTP response code 404 for new class")
    public void validateHTTPResponseCode404ForNewClass(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with empty request body for new class")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForNewClass(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTNewClassEndpoint());
    }

    @Step("received POST HTTP response code 400 for new class")
    public void validateHTTPResponseCode400ForNewClass(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("send POST HTTP request with invalid request body for new class")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForNewClass(){
        String body = "{\n" +
                "    \"description\" : \"Kelas khusus untuk meningkatkan kekuatan, fleksibilitas, dan keseimbangan tubuh\",\n" +
                "    \"class_type\" : \"online\",\n" +
                "    \"started_at\" : \"2023-06-17 09:30:00\",\n" +
                "    \"link\" : \"https://zoom.us/pilates-classroom\"\n" +
                "    \n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setValidPOSTNewClassEndpoint());
    }

    @Step("send POST HTTP request with invalid method for new class")
    public void sendPOSTHTTPRequestWithInvalidMethodForNewClass(){
        String body = "{\n" +
                "    \"name\" : \"Zumba Class\",\n" +
                "    \"description\" : \"Kelas khusus untuk meningkatkan kesehatan sistem kardiovaskular\",\n" +
                "    \"class_type\" : \"online\",\n" +
                "    \"started_at\" : \"2023-06-18 07:30:00\",\n" +
                "    \"link\" : \"https://zoom.us/zumba-classroom\"\n" +
                "    \n" +
                "}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).put(setValidPOSTNewClassEndpoint());
    }
}
