package starter.Membership;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

public class GET_All_Membership {
    public String endpointGETvalid = "http://18.141.56.154:8000/admin/memberships";
    public String endpointGET_Invalid = "http://18.141.56.154:8000/membership";


    @Step("admin set_valid GET all Membership endpoint")
    public String setEnpointGetvalid() {
        return endpointGETvalid;
    }

    @Step("admin set invalid GET all Membership endpoint")
    public String setEnpointGetInvalid() {
        return endpointGET_Invalid;
    }

    @Step("admin send GET HTTP request with valid endpoint for all Membership")
    public void sendGetUserInfo() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for all Membership")
    public void sendGetUserInfoInvalid() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for all Membership")
    public void sendGetUserInfoInvalidMethod() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setEnpointGetInvalid());
    }

    @Step("admin received valid GET HTTP response code 200 for all Membership")
    public void UserGetUserInformationStatusCode200() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("admin received valid GET HTTP response code 200 for all Membership")
    public void UserGetUserInformationStatusCode404() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }
    @Step("admin received valid GET HTTP response code 200 for all Membership")
    public void UserGetUserInformationStatusCode400() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }
}

