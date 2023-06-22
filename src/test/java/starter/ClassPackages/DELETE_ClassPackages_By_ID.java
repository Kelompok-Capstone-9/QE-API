package starter.ClassPackages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;
import starter.Login_User;

public class DELETE_ClassPackages_By_ID {
    public String validUrlUserByID = "http://18.141.56.154:8000/admin/classes/packages/1";
    public String invalidUrlUserByID = "http://18.141.56.154:8000/admin/classes/packages/001";
    public String invalidIDUrl = "http://18.141.56.154:8000/admin/classes/packag/1";



    @Step("set valid DELETE ClassPackages by ID endpoint")
    public String setValidDELETEClassPackagesByIDEndpoint() {
        return validUrlUserByID;
    }

    @Step("send DELETE HTTP request with valid endpoint for ClassPackages by ID")
    public void sendDELETEHTTPRequestWithValidEndpointForClassPackagesByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setValidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 200 for ClassPackages by ID")
    public void validateDELETEHTTPResponseCode200ForClassPackagesByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(200);
        });
    }

    @Step("set invalid DELETE ClassPackages by ID endpoint")
    public String setInvalidDELETEClassPackagesByIDEndpoint() {
        return invalidIDUrl;
    }

    @Step("send DELETE HTTP request with invalid endpoint for ClassPackages by ID")
    public void sendDELETEHTTPRequestWithInvalidEndpointForClassPackagesByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP responses code 404 for ClassPackages by ID")
    public void validateDELETEHTTPResponseCode404ForClassPackagesByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(404);
        });
    }

    @Step("send DELETE HTTP request with invalid method for ClassPackages by ID")
    public void sendDELETEHTTPRequestWithInvalidMethodForClassPackagesByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).post(setValidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 400 Bad Request for ClassPackages by ID")
    public void validateDELETEHTTPResponseCode400ForClassPackagesByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(400);
        });
    }

    @Step("set invalid ID DELETE ClassPackages by ID endpoint")
    public String setInvalidIDDELETEClassPackagesByIDEndpoint() {
        return invalidUrlUserByID;
    }

    @Step("send DELETE HTTP request with invalid ID for ClassPackages by ID")
    public void sendDELETEHTTPRequestWithInvalidIDForClassPackagesByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).delete(setInvalidIDDELETEClassPackagesByIDEndpoint());
    }

    @Step("send DELETE HTTP request for ClassPackages by ID")
    public void sendDELETEHTTPRequestForClassPackagesByID() {
        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).delete(setValidDELETEClassPackagesByIDEndpoint());
    }

    @Step("received valid DELETE HTTP response code 401 for ClassPackages by ID")
    public void validateDELETEHTTPResponseCode401ForClassPackagesByID() {
        SerenityRest.restAssuredThat((response) -> {
            response.statusCode(401);
        });
    }
}

