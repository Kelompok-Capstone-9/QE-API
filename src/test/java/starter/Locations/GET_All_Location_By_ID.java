package starter.Locations;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

public class GET_All_Location_By_ID {
    public String endpointGETLocationvalid = "http://18.141.56.154:8000/locations/1";
    public String endpointGETLocation_Invalid = "http://18.141.56.154:8000/location/1";
    public String endpointGETLocation_InvalidID = "http://18.141.56.154:8000/locations/002";


    @Step("admin set_valid GET all Location by ID endpoint")
    public String setEnpointGetvalid() {
        return endpointGETLocationvalid;
    }

    @Step("admin set invalid GET all Location by ID endpoint")
    public String setEnpointGetInvalid() {
        return endpointGETLocation_Invalid;
    }

    @Step("admin set invalid ID GET all Location by ID endpoint")
    public String setEnpointGetInvalidID() {
        return endpointGETLocation_InvalidID;
    }

    @Step("admin send GET HTTP request with valid endpoint for all Location by ID endpoint")
    public void sendGetUserInfo() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetvalid());
    }

    @Step("admin send GET HTTP request with invalid endpoint for Location by ID endpoint")
    public void sendGetUserInfoInvalid() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for Location by ID endpoint")
    public void sendGetUserInfoInvalidMethod() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setEnpointGetvalid());
    }
    @Step("admin send GET HTTP request with invalid endpoint for Location by ID endpoint")
    public void sendGetUserInfoInvalidID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalidID());
    }

    @Step("admin received valid GET HTTP response code 200 for Location by ID endpoint")
    public void UserGetUserInformationStatusCode200() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("admin received valid GET HTTP response code 200 for Location by ID endpoint")
    public void UserGetUserInformationStatusCode404() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });

    }
    @Step("admin received valid GET HTTP response code 200 for Location by ID endpoint")
    public void UserGetUserInformationStatusCode405() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(405);
        });
    }}

