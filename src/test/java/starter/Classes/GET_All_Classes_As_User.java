package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_Classes_As_User {
    public String validEndpointClassesUser = "http://18.141.56.154:8000/classes";
    public String invalidEndpointClassesUser = "http://18.141.56.154:8000/class";

    @Step("set valid GET all classes endpoint as user")
    public String setValidGETAllClassesEndpointAsUser(){
        return validEndpointClassesUser;
    }

    @Step("send GET HTTP request with valid endpoint for all classes as user")
    public void sendGETHTTPRequestWithValidEndpointForAllClassesAsUser(){
        SerenityRest.given().get(setValidGETAllClassesEndpointAsUser());
    }

    @Step("received valid GET HTTP response code 200 for all classes as user")
    public void validateGETHTTPResponseCode200ForAllClassesAsUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid GET all classes endpoint as user")
    public String setInvalidGETAllClassesEndpointAsUser(){
        return invalidEndpointClassesUser;
    }

    @Step("send GET HTTP request with invalid endpoint for all classes as user")
    public void sendGETHTTPRequestWithInvalidEndpointForAllClassesAsUser(){
        SerenityRest.given().get(setInvalidGETAllClassesEndpointAsUser());
    }

    @Step("received GET HTTP response code 404 for all classes as user")
    public void validateGETHTTPResponseCode404ForAllClassesAsUser(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for all classes as user")
    public void sendGETHTTPRequestWithInvalidMethodForAllClassesAsUser(){
        SerenityRest.given().post(setValidGETAllClassesEndpointAsUser());
    }

    @Step("received GET HTTP response code 405 for all classes as user")
    public void validateGETHTTPResponseCode405ForAllClassesAsUser(){
        restAssuredThat(response -> response.statusCode(405));
    }
}
