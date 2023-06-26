package starter.Membership;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

public class GET_Membership_By_ID {
    public String endpointGETMembershipvalid = "http://18.141.56.154:8000/admin/memberships/1";
    public String endpointGETMembership_Invalid = "http://18.141.56.154:8000/memberships/1";
    public String endpointGETMembership_InvalidID = "http://18.141.56.154:8000/admin/memberships/0001";


    @Step("admin set_valid GET all Membership by ID endpoint")
    public String setEnpointGetvalid() {
        return endpointGETMembershipvalid;
    }

    @Step("admin set invalid GET all Membership by ID endpoint")
    public String setEnpointGetInvalid() {
        return endpointGETMembership_Invalid;
    }

    @Step("admin set invalid ID GET all Membership by ID endpoint")
    public String setEnpointGetInvalidID() {
        return endpointGETMembership_InvalidID;
    }

    @Step("admin send GET HTTP request with valid endpoint for all Membership by ID endpoint")
    public void sendGetUserInfo() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetvalid());
    }

    @Step("admin send GET HTTP request with invalid endpoint for Membership by ID endpoint")
    public void sendGetUserInfoInvalid() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalid());
    }

    @Step("admin send GET HTTP request with valid endpoint for Membership by ID endpoint")
    public void sendGetUserInfoInvalidMethod() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setEnpointGetvalid());
    }
    @Step("admin send GET HTTP request with invalid endpoint for Membership by ID endpoint")
    public void sendGetUserInfoInvalidID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setEnpointGetInvalidID());
    }

    @Step("admin received valid GET HTTP response code 200 for Membership by ID endpoint")
    public void UserGetUserInformationStatusCode200() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("admin received valid GET HTTP response code 200 for Membership by ID endpoint")
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

