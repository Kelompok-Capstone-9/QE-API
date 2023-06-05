package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_Login {
    public String valid_endpoint_login = "http://18.141.56.154:8000/login";
    public String invalid_endpoint_login = "http://18.141.56.154:8000/logins";

    @Step("set valid POST login endpoint")
    public String setValidPOSTLoginEndpoint(){
        return valid_endpoint_login;
    }

    @Step("send POST HTTP request with valid endpoint for login")
    public void sendPOSTHTTPRequestWithValidEndpointForLogin(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTLoginEndpoint());
    }

    @Step("received POST HTTP response code 200 for login")
    public void validateHTTPResponseCode200ForLogin(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid POST login endpoint")
    public String setInvalidPOSTLoginEndpoint(){
        return invalid_endpoint_login;
    }

    @Step("send POST HTTP request with invalid endpoint for login")
    public void sendPOSTHTTPRequestWithInvalidEndpointForLogin(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setInvalidPOSTLoginEndpoint());
    }

    @Step("received POST HTTP responses code 404 for login")
    public void validateHTTPResponseCode404ForLogin(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with invalid method for login")
    public void sendPOSTHTTPRequestWithInvalidMethodForLogin(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).get(setValidPOSTLoginEndpoint());
    }

    @Step("received POST HTTP response code 405 Method Not Allowed for login")
    public void validateHTTPResponseCode405MethodNotAllowedForLogin(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("send POST HTTP request with empty request body for login")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForLogin(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTLoginEndpoint());
    }

    @Step("received valid POST HTTP response code 400 for login")
    public void validateHTTPResponseCode400ForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("send POST HTTP request with invalid request body for login")
    public void sendPOSTHTTPRequestWithInvalidRequestBodyForLogin(){
        String body = "{\"email\":\"nada@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTLoginEndpoint());
    }

    @Step("send POST HTTP request with invalid email for login")
    public void sendPOSTHTTPRequestWithInvalidEmailForLogin(){
        String body = "{\"email\":\"riza#gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setValidPOSTLoginEndpoint());
    }
}
