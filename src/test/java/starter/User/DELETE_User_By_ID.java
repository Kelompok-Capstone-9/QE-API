package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_User_By_ID {
    public String validUrlUserByID = "http://18.141.56.154:8000/users/41";
    public String invalidUrlUserByID = "http://18.141.56.154:8000/user/41";
    public String invalidIDUrl = "http://18.141.56.154:8000/users/2";

    @Step("set valid DELETE user data by ID endpoint")
    public String setValidDELETEUserDataByIDEndpoint(){
        return validUrlUserByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for user data by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setValidDELETEUserDataByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for user data by ID")
    public void validateDELETEHTTPResponseCode200ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid DELETE user data by ID endpoint")
    public String setInvalidDELETEUserDataByIDEndpoint(){
        return invalidUrlUserByID;
    }

    @Step("send DELETE HTTP request with invalid endpoint for user data by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidDELETEUserDataByIDEndpoint());
    }

    @Step("received valid DELETE HTTP responses code 404 for user data by ID")
    public void validateDELETEHTTPResponseCode404ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send DELETE HTTP request with invalid method for user data by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidDELETEUserDataByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 400 Bad Request for user data by ID")
    public void validateDELETEHTTPResponseCode400ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("set invalid ID DELETE user data by ID endpoint")
    public String setInvalidIDDELETEUserDataByIDEndpoint(){
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid ID for user data by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidIDDELETEUserDataByIDEndpoint());
    }

    @Step("send DELETE HTTP request for user data by ID")
    public void sendDELETEHTTPRequestForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).delete(setValidDELETEUserDataByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 401 for user data by ID")
    public void validateDELETEHTTPResponseCode401ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
