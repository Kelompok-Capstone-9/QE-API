package starter.Plan;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

public class GET_All_Plan_By_ID {
    public String endpointGETvalid = "http://18.141.56.154:8000/plans/5";
    public String endpointGET_Invalid = "http://18.141.56.154:8000/plan";
    public String endpointGET_InvalidID = "http://18.141.56.154:8000/plan/002";

    public GET_All_Plan_By_ID() {
    }

    @Step("admin set_valid GET all all plan by ID endpoint")
    public String setEnpointGetvalid() {
        return endpointGETvalid;
    }

    @Step("admin set invalid GET all plan by ID endpoint")
    public String setEnpointGetInvalid() {
        return endpointGET_Invalid;
    }

    @Step("admin set invalid ID GET all plan by ID endpoint")
    public String setEnpointGetInvalidID() {
        return endpointGET_InvalidID;
    }

    @Step("admin send GET HTTP request with valid endpoint for all plan by ID endpoint")
    public void sendGetUserInfo() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for plan by ID endpoint")
    public void sendGetUserInfoInvalid() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for plan by ID endpoint")
    public void sendGetUserInfoInvalidMethod() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setEnpointGetInvalid());
    }

    @Step("admin received valid GET HTTP response code 200 for plan by ID endpoint")
    public void UserGetUserInformationStatusCode200() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("admin received valid GET HTTP response code 200 for plan by ID endpoint")
    public void UserGetUserInformationStatusCode404() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }
}
