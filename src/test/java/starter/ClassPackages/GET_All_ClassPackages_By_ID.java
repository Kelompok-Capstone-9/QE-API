package starter.ClassPackages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

public class GET_All_ClassPackages_By_ID {
    public String endpointGETClassPackagesvalid = "http://18.141.56.154:8000/admin/classes/packages/2";
    public String endpointGETClassPackages_Invalid = "http://18.141.56.154:8000/admin/classes/packag/2";
    public String endpointGETClassPackages_InvalidID = "http://18.141.56.154:8000/admin/classes/packages/002";


    @Step("admin set_valid GET all ClassPackages by ID endpoint")
    public String setEnpointGetvalid() {
        return endpointGETClassPackagesvalid;
    }

    @Step("admin set invalid GET all ClassPackages by ID endpoint")
    public String setEnpointGetInvalid() {
        return endpointGETClassPackages_Invalid;
    }

    @Step("admin set invalid ID GET all ClassPackages by ID endpoint")
    public String setEnpointGetInvalidID() {
        return endpointGETClassPackages_InvalidID;
    }

    @Step("admin send GET HTTP request with valid endpoint for all ClassPackages by ID endpoint")
    public void sendGetUserInfo() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetvalid());
    }

    @Step("admin send GET HTTP request with invalid endpoint for ClassPackages by ID endpoint")
    public void sendGetUserInfoInvalid() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for ClassPackages by ID endpoint")
    public void sendGetUserInfoInvalidMethod() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setEnpointGetvalid());
    }
    @Step("admin send GET HTTP request with invalid endpoint for ClassPackages by ID endpoint")
    public void sendGetUserInfoInvalidID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalidID());
    }

    @Step("admin received valid GET HTTP response code 200 for ClassPackages by ID endpoint")
    public void UserGetUserInformationStatusCode200() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("admin received valid GET HTTP response code 200 for ClassPackages by ID endpoint")
    public void UserGetUserInformationStatusCode404() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });

    }
    @Step("admin received valid GET HTTP response code 200 for ClassPackages by ID endpoint")
    public void UserGetUserInformationStatusCode400() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }}
