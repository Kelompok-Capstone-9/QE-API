package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_Class_By_ID_As_Admin {
    public String validEndpointClass = "http://18.141.56.154:8000/admin/classes/1";
    public String invalidEndpointClass = "http://18.141.56.154:8000/admin/class/1";
    public String invalidIDClass = "http://18.141.56.154:8000/admin/classes/100";

    @Step("set valid GET class by ID endpoint")
    public String setValidGETClassByIDEndpoint(){
        return validEndpointClass;
    }

    @Step("send GET HTTP request with valid endpoint for class by ID")
    public void sendGETHTTPRequestWithValidEndpointForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setValidGETClassByIDEndpoint());
    }

    @Step("received valid GET HTTP response code 200 for class by ID")
    public void validateGETHTTPResponseCode200ForClassByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid GET class by ID endpoint")
    public String setInvalidGETClassByIDEndpoint(){
        return invalidEndpointClass;
    }

    @Step("send GET HTTP request with invalid endpoint for class by ID")
    public void sendGETHTTPRequestWithInvalidEndpointForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setInvalidGETClassByIDEndpoint());
    }

    @Step("received valid GET HTTP response code 404 for class by ID")
    public void validateGETHTTPResponseCode404ForClassByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send GET HTTP request with invalid method for class by ID")
    public void sendGETHTTPRequestWithInvalidMethodForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidGETClassByIDEndpoint());
    }

    @Step("set invalid ID GET class by ID endpoint")
    public String setInvalidIDGETClassByIDEndpoint(){
        return invalidIDClass;
    }

    @Step("send GET HTTP request with invalid ID for class by ID")
    public void sendGETHTTPRequestWithInvalidIDForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setInvalidIDGETClassByIDEndpoint());
    }
}
