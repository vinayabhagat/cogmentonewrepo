package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	private static LoginPage loginPage;
	
	@Given("user on login page")
	public void user_on_login_page() {
		initialization();
		
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		loginPage=new LoginPage();
		loginPage.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");
	}

	@Then("click on login")
	public void click_on_login() {
		loginPage.clickOnLogin();
	}
	
	
}
