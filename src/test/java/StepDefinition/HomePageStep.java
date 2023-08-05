package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStep extends BaseClass {
	   private static HomePage home;
	@Then("user check homepage logo")
	public void user_check_homepage_logo() {
	    home=new HomePage();
	   home.homepagelogo();
	}
	
}
