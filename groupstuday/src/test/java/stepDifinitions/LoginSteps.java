package stepDifinitions;

import core.Base;
import io.cucumber.java.en.*;
import pageObject.amazonPageObject;

public class LoginSteps extends Base {
	amazonPageObject login= new amazonPageObject();
	@Given("login in amazon page")
	public void login_in_amazon_page() {
		login.clickacountlis();
	}

	@When("user enter username")
	public void user_enter_username() {
		login.enteremail();
	}
	@Then("user click on countiue button")
	public void user_click_on_countiue_button() {
	   login.clickcountinue();
	}
	@Then("user enter password")
	public void user_enter_password() {
		login.enterpassword();
	}

	@Then("user click login button")
	public void user_click_login_button() {
		login.clicksign();
	}


}
