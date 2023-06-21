package starter.Locations;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

public class DELETE_Location_By_ID {
    public String validUrlUserByID = "http://18.141.56.154:8000/admin/locations/1";
    public String invalidUrlUserByID = "http://18.141.56.154:8000/admin/locations/001";
    public String invalidIDUrl = "http://18.141.56.154:8000/admin/location/1";



    @Step("set valid DELETE Location by ID endpoint")
    public String setValidDELETELocationByIDEndpoint() {
        return validUrlUserByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for Location by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForLocationByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setValidDELETELocationByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for Location by ID")
    public void validateDELETEHTTPResponseCode200ForLocationByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid DELETE Location by ID endpoint")
    public String setInvalidDELETELocationByIDEndpoint() {
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid endpoint for Location by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForLocationByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidDELETELocationByIDEndpoint());
    }

    @Step("received valid DELETE HTTP responses code 404 for Location by ID")
    public void validateDELETEHTTPResponseCode404ForLocationByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send DELETE HTTP request with invalid method for Location by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForLocationByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidDELETELocationByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 400 Bad Request for Location by ID")
    public void validateDELETEHTTPResponseCode400ForLocationByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("set invalid ID DELETE Location by ID endpoint")
    public String setInvalidIDDELETELocationnByIDEndpoint() {
        return invalidUrlUserByID;
    }

    @Step("send DELETE HTTP request with invalid ID for Location by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForLocationByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidIDDELETELocationnByIDEndpoint());
    }

    @Step("send DELETE HTTP request for Location by ID")
    public void sendDELETEHTTPRequestForLocationByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).delete(setValidDELETELocationByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 401 for Location by ID")
    public void validateDELETEHTTPResponseCode401ForLocationByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}
