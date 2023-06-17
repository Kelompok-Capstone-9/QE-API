package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login_User;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class PUT_Edit_User_Data_By_ID {
    public String valid_url_edit_user_data_by_ID = "http://18.141.56.154:8000/users/13";
    public String invalid_url_edit_user_data_by_ID = "http://18.141.56.154:8000/user/13";
    public String invalid_ID_url_edit_user_data_by_ID ="http://18.141.56.154:8000/users/40";

    @Step("set valid PUT user data by ID endpoint")
    public String setValidPUTUserDataByIDEndpoint(){
        return valid_url_edit_user_data_by_ID;
    }

    @Step("send PUT HTTP request with valid endpoint for user data by ID")
    public void sendPUTHTTPRequestWithValidEndpointForUserDataByID(){

        String body = "{\"name\": \"rizania fayza\"}";

        JSONObject rBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(rBody.toString()).put(setValidPUTUserDataByIDEndpoint());
    }

    @Step("received valid PUT HTTP response code 200 for user data by ID")
    public void validateValidPUTHTTPResponseCode200ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user received valid user data by ID")
    public void validateValidUserDataByID(){
        restAssuredThat(response->response.body("data.name",equalTo("rizania fayza")));
    }

    @Step("set invalid PUT user data by ID endpoint")
    public String setInvalidPUTUserDataByIDEndpoint(){
        return invalid_url_edit_user_data_by_ID;
    }

    @Step("send PUT HTTP request with invalid endpoint for user data by ID")
    public void sendPUTHTTPRequestWithInvalidEndpointForUserDataByID(){

        String body = "{\"name\": \"rizania fayza\"}";

        JSONObject rBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(rBody.toString()).put(setInvalidPUTUserDataByIDEndpoint());
    }

    @Step("received valid PUT HTTP responses code 404 for user data by ID")
    public void validateValidPUTHTTPResponseCode404ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send PUT HTTP request with invalid method for user data by ID")
    public void sendPUTHTTPRequestWithInvalidMethodForUserDataByID(){

        String body = "{\"name\": \"rizania fayza\"}";

        JSONObject rBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(rBody.toString()).post(setValidPUTUserDataByIDEndpoint());
    }

    @Step("received PUT HTTP response code 400 for user data by ID")
    public void validatePUTHTTPResponseCode400ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("set invalid ID PUT user data by ID endpoint")
    public String setInvalidIDPUTUserDataByIDEndpoint(){
        return invalid_ID_url_edit_user_data_by_ID;
    }

    @Step("send PUT HTTP request with invalid ID for user data by ID")
    public void sendPUTHTTPRequestWithInvalidIDForUserDataByID(){

        String body = "{\"name\": \"rizania fayza\"}";

        JSONObject rBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login_User.token_user).contentType("application/json").body(rBody.toString()).put(setInvalidIDPUTUserDataByIDEndpoint());
    }

    @Step("received PUT HTTP response code 401 unauthorized for user data by ID")
    public void validatePUTHTTPResponseCode401ForUserDataByID(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
