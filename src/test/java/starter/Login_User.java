package starter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class Login_User {
    public String endpoint_auth_user = "http://18.141.56.154:8000/login";
    public static String token_user = "";

    @Step("set authentication endpoint as user")
    public String setAuthenticationEndpointAsUser(){
        return endpoint_auth_user;
    }

    @Step("send authentication endpoint as user")
    public void sendAuthenticationEndpointAsUser(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setAuthenticationEndpointAsUser());
        token_user = lastResponse().getBody().jsonPath().get("token");
    }
}
