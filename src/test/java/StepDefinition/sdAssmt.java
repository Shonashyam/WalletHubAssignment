package StepDefinition;

import PagesPOM.Facebookpage;
import PagesPOM.PostedReviewpage;
import PagesPOM.WalletReviewpage;
import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class sdAssmt extends TestBase {

	public static Facebookpage objfacebook;
	public static WalletReviewpage objwallet;
	public static PostedReviewpage objposted;

	@Given("^User launches the Browser and enters the required url$")
	public void user_launches_the_Browser_and_enters_the_required_url() {

	}

	@When("^User enters the username \"([^\"]*)\" and password \"([^\"]*)\" and click on login button$")
	public void user_enters_the_username_and_password_and_click_on_login_button(String arg1, String arg2)
			throws Throwable {

		TestBase.initialization();
		objfacebook = new Facebookpage();

		String titlefb = objfacebook.titleofthepage();
		Assert.assertEquals("Facebook – log in or sign up", titlefb);

		boolean uname = objfacebook.display();
		Assert.assertTrue(uname);

		// NAVIGATE TO WALLETHUB HOME PAGE

		String lastuser = objfacebook.fblogin(arg1, arg2);

		System.out.println("User Name:" + lastuser);

		// Navigating to WalletHub url

		if (arg1.contains("rathod")) {
			driver.navigate().to("https://wallethub.com/profile/test-insurance-company-13732055i");
		}

	}

	@Then("^Status message \"([^\"]*)\" should display$")
	public void status_message_should_display(String arg1) {

		System.out.println("Tested with 3 diffrent users, " + " if you want, you can change user name in Feature file");
		System.out.println("Assigment I is completed:" + arg1);

	}

	// ASSIGMENT II

	@Given("^User already launched the browser and navigate to Wallethub url$")
	public void user_already_launched_the_browser_and_navigate_to_Wallethub_url() {

	}

	@Given("^User overs to fourth and fifth start and click on them$")
	public void user_overs_to_fourth_and_fifth_start_and_click_on_them() throws Throwable {

		objwallet = new WalletReviewpage();
		String titlewpage = objwallet.clickonstars();
		System.out.println(titlewpage);

		Assert.assertEquals("Join WalletHub", titlewpage);

	}

	@Given("^User click on Write Review button$")
	public void user_click_on_Write_Review_button() {

	}

	@Then("^User Redirected to next page$")
	public void user_Redirected_to_next_page() {

	}

	@Then("^User select \"([^\"]*)\" from Policy Drop down$")
	public void user_select_from_Policy_Drop_down(String arg1) {

	}

	@Then("^User Provides the Review at least (\\d+) characters$")
	public void user_Provides_the_Review_at_least_characters(int arg1) {

	}

	@Then("^User Submits and confirm the Review$")
	public void user_Submits_and_confirm_the_Review() {

	}

// ASSINGMENT II : SCENARIO 2

	@Given("^User is already on the Wallet home page$")
	public void user_is_already_on_the_Wallet_home_page() {

	}

	@Given("^user clicks on Sign in Link$")
	public void user_clicks_on_Sign_in_Link() {

	}

	@When("^User enters Emailid \"([^\"]*)\" pwd  \"([^\"]*)\" and Clicks on Login button$")
	public void user_enters_Emailid_pwd_and_Clicks_on_Login_button(String arg1, String arg2) throws Throwable {

		objposted = new PostedReviewpage();

		String actualreveiw = objposted.validatepostedreview(arg1, arg2);
		System.out.println("Posted Review are:" + actualreveiw);

		String expreview = "This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a"
				+ " Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is"
				+ " a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a "
				+ "Assingment!!!This is a Assingment!!!This is a Assingment!!!This is a Assingment!!!This is"
				+ " a Assingment!!!";

		Assert.assertEquals(expreview, actualreveiw);

	}

	@Then("^Your Review Text should display as expected$")
	public void your_Review_Text_should_display_as_expected() throws Throwable {

	}

}
