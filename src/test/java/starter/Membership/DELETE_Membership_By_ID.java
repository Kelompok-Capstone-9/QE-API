package starter.Membership;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

public class DELETE_Membership_By_ID {
    public String validUrlUserByID = "http://18.141.56.154:8000/admin/memberships/4";
    public String invalidUrlUserByID = "http://18.141.56.154:8000/admin/memberships/004";
    public String invalidIDUrl = "http://18.141.56.154:8000/admin/membership/4";



    @Step("set valid DELETE Membership by ID endpoint")
    public String setValidDELETEClassPackagesByIDEndpoint() {
        return validUrlUserByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for Membership by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForMembershipByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setValidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for Membership by ID")
    public void validateDELETEHTTPResponseCode200ForMembershipByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid DELETE Membership by ID endpoint")
    public String setInvalidDELETEClassPackagesByIDEndpoint() {
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid endpoint for Membership by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForMembershipByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP responses code 404 for Membership by ID")
    public void validateDELETEHTTPResponseCode404ForMembershipByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send DELETE HTTP request with invalid method for Membership by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForMembershipByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 400 Bad Request for Membership by ID")
    public void validateDELETEHTTPResponseCode400ForMembershipByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("set invalid ID DELETE Membership by ID endpoint")
    public String setInvalidIDDELETEClassPackagesByIDEndpoint() {
        return invalidUrlUserByID;
    }

    @Step("send DELETE HTTP request with invalid ID for Membership by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForMembershipByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidIDDELETEClassPackagesByIDEndpoint());
    }

    @Step("send DELETE HTTP request for Membership by ID")
    public void sendDELETEHTTPRequestForMembershipByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).delete(setValidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 401 for Membership by ID")
    public void validateDELETEHTTPResponseCode401ForMembershipByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}

