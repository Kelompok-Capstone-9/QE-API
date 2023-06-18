package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_All_Classes_As_Admin {
    public String validEndpointClasses = "http://18.141.56.154:8000/admin/classes";
    public String invalidEndpointClasses = "http://18.141.56.154:8000/admin/class";

    @Step("set valid GET all classes endpoint")
    public String setValidGETAllClassesEndpoint(){
        return validEndpointClasses;
    }

    @Step("send GET HTTP request with valid endpoint for all classes")
    public void sendGETHTTPRequestWithValidEndpointForAllClasses(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setValidGETAllClassesEndpoint());
    }

    @Step("received valid GET HTTP response code 200 for all classes")
    public void validateGETHTTPResponseCode200ForAllClasses(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid GET all classes endpoint as")
    public String setInvalidGETAllClassesEndpoint(){
        return invalidEndpointClasses;
    }

    @Step("send GET HTTP request with invalid endpoint for all classes")
    public void sendGETHTTPRequestWithInvalidEndpointForAllClasses(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setInvalidGETAllClassesEndpoint());
    }

    @Step("received GET HTTP response code 404 for all classes")
    public void validateGETHTTPResponseCode404ForAllClasses(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for all classes")
    public void sendGETHTTPRequestWithInvalidMethodForAllClasses(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidGETAllClassesEndpoint());
    }

    @Step("received GET HTTP response code 400 for all classes")
    public void validateGETHTTPResponseCode400ForAllClasses(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
