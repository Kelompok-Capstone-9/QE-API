package starter;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class Login {
    public String endpoint_auth = "http://18.141.56.154:8000/login";
    public static String token = "";

    @Step("set authentication endpoint")
    public String setAuthenticationEndpoint(){
        return endpoint_auth;
    }

    @Step("send authentication endpoint")
    public void sendAuthenticationEndpoint(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setAuthenticationEndpoint());
        token = lastResponse().getBody().jsonPath().get("token");
    }
}
