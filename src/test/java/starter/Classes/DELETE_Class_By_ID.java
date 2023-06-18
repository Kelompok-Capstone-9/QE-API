package starter.Classes;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_Class_By_ID {
    public String validUrlClassByID = "http://18.141.56.154:8000/admin/classes/7";
    public String invalidUrlClassByID = "http://18.141.56.154:8000/admin/class/7";
    public String invalidIDUrl = "http://18.141.56.154:8000/admin/classes/70";

    @Step("set valid DELETE class by ID endpoint")
    public String setValidDELETEClassByIDEndpoint(){
        return validUrlClassByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for class by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setValidDELETEClassByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for class by ID")
    public void validateDELETEHTTPResponseCode200ForClassByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set invalid DELETE class by ID endpoint")
    public String setInvalidDELETEClassByIDEndpoint(){
        return invalidUrlClassByID;
    }

    @Step("send DELETE HTTP request with invalid endpoint for class by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidDELETEClassByIDEndpoint());
    }

    @Step("received DELETE HTTP response code 404 for class by ID")
    public void validateDELETEHTTPResponseCode404ForClassByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send DELETE HTTP request with invalid method for class by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidDELETEClassByIDEndpoint());
    }

    @Step("received DELETE HTTP response code 400 for class by ID")
    public void validateDELETEHTTPResponseCode400ForClassByID(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("set invalid ID DELETE class by ID endpoint")
    public String setInvalidIDDELETEClassByIDEndpoint(){
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid ID for class by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForClassByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidIDDELETEClassByIDEndpoint());
    }
}
