package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("admin set authentication endpoint")
    public void adminSetAuthenticationEndpoint() {
        login.setAuthenticationEndpoint();
    }

    @And("admin send authentication endpoint")
    public void adminSendAuthenticationEndpoint() {
        login.sendAuthenticationEndpoint();
    }
}
