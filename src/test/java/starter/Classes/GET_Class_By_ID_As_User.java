package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_Class_By_ID_As_User {
    public String validUrlClassesUser = "http://18.141.56.154:8000/classes/1";
    public String invalidUrlClassesUser = "http://18.141.56.154:8000/class/1";
    public String invalidIDClassesUser = "http://18.141.56.154:8000/classes/100";

    @Step("set valid GET class by ID endpoint as user")
    public String setValidGETClassByIDEndpointAsUser(){
        return validUrlClassesUser;
    }

    @Step("send GET HTTP request with valid endpoint for class by ID as user")
    public void sendGETHTTPRequestWithValidEndpointForClassByIDAsUser(){
        SerenityRest.given().get(setValidGETClassByIDEndpointAsUser());
    }

    @Step("received valid GET HTTP response code 200 for class by ID as user")
    public void validateGETHTTPResponseCode200ForClassByIDAsUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid GET class by ID endpoint as user")
    public String setInvalidGETClassByIDEndpointAsUser(){
        return invalidUrlClassesUser;
    }

    @Step("send GET HTTP request with invalid endpoint for class by ID as user")
    public void sendGETHTTPRequestWithInvalidEndpointForClassByIDAsUser(){
        SerenityRest.given().get(setInvalidGETClassByIDEndpointAsUser());
    }

    @Step("received GET HTTP response code 404 for class by ID as user")
    public void validateGETHTTPResponseCode404ForClassByIDAsUser(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for class by ID as user")
    public void sendGETHTTPRequestWithInvalidMethodForClassByIDAsUser(){
        SerenityRest.given().post(setValidGETClassByIDEndpointAsUser());
    }

    @Step("received GET HTTP response code 405 for class by ID as user")
    public void validateGETHTTPResponseCode405ForClassByIDAsUser(){
        restAssuredThat(response -> response.statusCode(405));
    }

    @Step("set valid GET class by ID endpoint with invalid ID as user")
    public String setValidGETClassByIDEndpointWithInvalidIDAsUser(){
        return invalidIDClassesUser;
    }

    @Step("send GET HTTP request with invalid ID for class by ID as user")
    public void sendGETHTTPRequestWithInvalidIDForClassByIDAsUser(){
        SerenityRest.given().get(setValidGETClassByIDEndpointWithInvalidIDAsUser());
    }
}
