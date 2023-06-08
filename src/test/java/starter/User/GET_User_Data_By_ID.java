package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_User_Data_By_ID {
    public String validEndpointUserByID = "http://18.141.56.154:8000/users/9";
    public String invalidEndpointUserByID = "http://18.141.56.154:8000/user/9";
    public String validEndpoint = "http://18.141.56.154:8000/users/44";
    public String invalidIDEndpoint = "http://18.141.56.154:8000/users/2";

    @Step("set valid GET user data by ID endpoint")
    public String setValidGETUserDataByIDEndpoint(){
        return validEndpointUserByID;
    }

    @Step("send GET HTTP request with valid endpoint for user data by ID")
    public void sendGETHTTPRequestWithValidEndpointForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setValidGETUserDataByIDEndpoint());
    }

    @Step("received valid GET HTTP response code 200 for user data by ID")
    public void validateGETHTTPResponseCode200ForUserDatarByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid user data by ID")
    public void validateValidUserDataByID(){
        restAssuredThat(response->response.body("data.name",equalTo("riza")));
        restAssuredThat(response->response.body("data.email",equalTo("riza@gmail.com")));
        restAssuredThat(response->response.body("data.gender",equalTo("wanita")));
    }

    @Step("set invalid GET user data by ID endpoint")
    public String setInvalidGETUserDataByIDEndpoint(){
        return invalidEndpointUserByID;
    }

    @Step("send GET HTTP request with invalid endpoint for user data by ID")
    public void sendGETHTTPRequestWithInvalidEndpointForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setInvalidGETUserDataByIDEndpoint());
    }

    @Step("received valid GET HTTP responses code 404 for user data by ID")
    public void validateGETHTTPResponsesCode404ForUserDatarByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for user data by ID")
    public void sendGETHTTPRequestWithInvalidMethodForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidGETUserDataByIDEndpoint());
    }

    @Step("set invalid ID GET user data by ID endpoint")
    public String setInvalidIDGETUserDataByIDEndpoint(){
        return invalidIDEndpoint;
    }

    @Step("send GET HTTP request with invalid ID for user data by ID")
    public void sendGETHTTPRequestWithInvalidIDForUserDataByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setInvalidIDGETUserDataByIDEndpoint());
    }

    @Step("received GET HTTP responses code 400 for user data by ID")
    public void validateGETHTTPResponsesCode400ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("set valid GET user data by ID endpoint as user")
    public String setValidGETUserDataByIDEndpointAsUser(){
        return validEndpoint;
    }

    @Step("send GET HTTP request with valid endpoint for user data by ID as user")
    public void sendGETHTTPRequestWithValidEndpointForUserDataByIDAsUser(){
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).get(setValidGETUserDataByIDEndpointAsUser());
    }

    @Step("set invalid ID GET user data by ID endpoint as user")
    public String setInvalidIDGETUserDataByIDEndpointAsUser(){
        return invalidIDEndpoint;
    }

    @Step("send GET HTTP request with invalid ID endpoint for user data by ID as user")
    public void sendGETHTTPRequestWithInvalidEndpointForUserDataByIDAsUser(){
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).get(setInvalidIDGETUserDataByIDEndpointAsUser());
    }

    @Step("received GET HTTP responses code 401 for user data by ID")
    public void validateGETHTTPResponsesCode401ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
