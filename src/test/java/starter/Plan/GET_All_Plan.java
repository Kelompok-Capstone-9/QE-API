package starter.Plan;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

public class GET_All_Plan {
    public String endpointGETvalid = "http://18.141.56.154:8000/plans/all";
    public String endpointGET_Invalid = "http://18.141.56.154:8000/plan";

    public GET_All_Plan() {
    }

    @Step("admin set_valid GET all user data endpoint")
    public String setEnpointGetvalid() {
        return endpointGETvalid;
    }

    @Step("admin set invalid GET all user data endpoint")
    public String setEnpointGetInvalid() {
        return endpointGET_Invalid;
    }

    @Step("admin send GET HTTP request with valid endpoint for all user data")
    public void sendGetUserInfo() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for all user data")
    public void sendGetUserInfoInvalid() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for all user data")
    public void sendGetUserInfoInvalidMethod() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setEnpointGetInvalid());
    }

    @Step("admin received valid GET HTTP response code 200 for all user data")
    public void UserGetUserInformationStatusCode200() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("admin received valid GET HTTP response code 200 for all user data")
    public void UserGetUserInformationStatusCode404() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }
}
