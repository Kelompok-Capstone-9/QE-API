package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_Register {
    public String valid_endpoint_register = "http://18.141.56.154:8000/register";
    public String invalid_endpoint_register = "http://18.141.56.154:8000/registered";

    @Step("set valid POST register endpoint")
    public String setValidPOSTRegisterEndpoint(){
        return valid_endpoint_register;
    }

    @Step("send POST HTTP request with valid endpoint for register")
    public void sendPOSTHTTPRequestWithValidEndpointForRegister(){
        int min = 1;
        int max = 1000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email = "riza" + String.valueOf(number) + "@gmail.com";

        String body = "{\"name\": \"riza\" ,\n" +
                "\"email\": " + email + ",\n" +
                " \"password\": \"riza123\" ,\n" +
                " \"gender\": \"wanita\" ,\n" +
                "\"height\": 158 ,\n" +
                "\"goal_height\": 162 ,\n" +
                "\"weight\": 50 ,\n" +
                "\"goal_weight\": 45}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTRegisterEndpoint());
    }

    @Step("received POST HTTP response code 201 for register")
    public void validateHTTPResponseCode201ForRegister(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("set invalid POST register endpoint")
    public String setInvalidPOSTRegisterEndpoint(){
        return invalid_endpoint_register;
    }

    @Step("send POST HTTP request with invalid endpoint for register")
    public void sendPOSTHTTPRequestWithInvalidEndpointForRegister(){
        int min = 1;
        int max = 1000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email = "riza" + String.valueOf(number) + "@gmail.com";

        String body = "{\"name\": \"riza\" ,\n" +
                "\"email\": " + email + ",\n" +
                " \"password\": \"riza123\" ,\n" +
                " \"gender\": \"wanita\" ,\n" +
                "\"height\": 158 ,\n" +
                "\"goal_height\": 162 ,\n" +
                "\"weight\": 50 ,\n" +
                "\"goal_weight\": 45}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setInvalidPOSTRegisterEndpoint());
    }

    @Step("received POST HTTP responses code 404 for register")
    public void validateHTTPResponsesCode404ForRegister(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with empty request body for register")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForRegister(){

        String body = "{}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTRegisterEndpoint());
    }

    @Step("received valid POST HTTP response code 400 for register")
    public void validateValidHTTPResponseCode400ForRegister(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("send POST HTTP request with registered email for register")
    public void sendPOSTHTTPRequestWithRegisteredEmailForRegister(){

        String body = "{\"name\": \"riza\" ,\n" +
                "\"email\": \"riza@gmail.com\" ,\n" +
                " \"password\": \"riza123\" ,\n" +
                " \"gender\": \"wanita\" ,\n" +
                "\"height\": 158 ,\n" +
                "\"goal_height\": 162 ,\n" +
                "\"weight\": 50 ,\n" +
                "\"goal_weight\": 45}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTRegisterEndpoint());
    }

    @Step("received valid POST HTTP response code 409 Conflict for register")
    public void validateValidHTTPResponseCode409ConflictForRegister(){
        restAssuredThat(response -> response.statusCode(409));
    }

    @Step("send POST HTTP request with invalid request body for register")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForRegister(){

        String body = "{\"name\": \"riza\" ,\n" +
                "\"email\": \"riza@gmail.com\" ,\n" +
                " \"password\": \"riza123\" ,\n" +
                " \"gender\": \"wanita\" ,\n" +
                "\"height\": \"158\" ,\n" +
                "\"goal_height\": \"162\" ,\n" +
                "\"weight\": \"50\" ,\n" +
                "\"goal_weight\": \"45\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTRegisterEndpoint());
    }

    @Step("send POST HTTP request with invalid method for register")
    public void sendPOSTHTTPRequestWithInvalidMethodForRegister(){

        String body = "{\"name\": \"riza\" ,\n" +
                "\"email\": \"riza@gmail.com\" ,\n" +
                " \"password\": \"riza123\" ,\n" +
                " \"gender\": \"wanita\" ,\n" +
                "\"height\": 158 ,\n" +
                "\"goal_height\": 162 ,\n" +
                "\"weight\": 50 ,\n" +
                "\"goal_weight\": 45}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(setValidPOSTRegisterEndpoint());
    }

    @Step("received valid POST HTTP response code 405 Method Not Allowed for register")
    public void validateValidHTTPResponseCode405MethodNotAllowedForRegister(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
