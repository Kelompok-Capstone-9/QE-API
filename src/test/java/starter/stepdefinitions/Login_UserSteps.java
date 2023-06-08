package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.Login_User;

public class Login_UserSteps {
    @Steps
    Login_User login_user;
    @Given("user set authentication endpoint")
    public void userSetAuthenticationEndpoint() {
        login_user.setAuthenticationEndpointAsUser();
    }

    @And("user send authentication endpoint")
    public void userSendAuthenticationEndpoint() {
        login_user.sendAuthenticationEndpointAsUser();
    }
}
