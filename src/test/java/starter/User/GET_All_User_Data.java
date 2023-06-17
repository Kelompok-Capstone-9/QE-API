package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_User_Data {

    public String validEndpointUserData = "http://18.141.56.154:8000/users";
    public String invalidEndpointUserData = "http://18.141.56.154:8000/user";

    @Step("set valid GET all user data endpoint")
    public String setValidGETAllUserDataEndpoint(){
        return validEndpointUserData;
    }

    @Step("send GET HTTP request with valid endpoint for all user data")
    public void sendGETHTTPRequestWithValidEndpointForAllUserData(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setValidGETAllUserDataEndpoint());
    }

    @Step("received valid GET HTTP response code 200 for all user data")
    public void validateGETHTTPResponseCode200ForAllUserData(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid GET all user data endpoint")
    public String setInvalidGETAllUserDataEndpoint(){
        return invalidEndpointUserData;
    }

    @Step("send GET HTTP request with invalid endpoint for all user data")
    public void sendGETHTTPRequestWithInvalidEndpointForAllUserData(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setInvalidGETAllUserDataEndpoint());
    }

    @Step("received valid GET HTTP responses code 404 for all user data")
    public void validateGETHTTPResponsesCode404ForAllUserData(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for all user data")
    public void sendGETHTTPRequestWithInvalidMethodForAllUserData(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidGETAllUserDataEndpoint());
    }

    @Step("set valid GET all user data endpoint as user")
    public String setValidGETAllUserDataEndpointAsUser(){
        return validEndpointUserData;
    }

    @Step("send GET HTTP request with valid endpoint for all user data as user")
    public void sendGETHTTPRequestWithValidEndpointForAllUserDataAsUser(){
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).get(setValidGETAllUserDataEndpoint());
    }

    @Step("received valid GET HTTP response code 401 for all user data as user")
    public void validateGETHTTPResponseCode401ForAllUserDataAsUser(){
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("received GET HTTP response code 400 for all user data as user")
    public void validateGETHTTPResponseCode400ForAllUserDataAsUser(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
