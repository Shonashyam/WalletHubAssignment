$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shyam/eclipse-workspace/WalletHubTwo/Resources/Review.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Facebook and Wallethub Applications",
  "description": "",
  "id": "validate-facebook-and-wallethub-applications",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d"
    },
    {
      "line": 3,
      "value": "#ASSIGNMENT-I"
    },
    {
      "line": 4,
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d"
    },
    {
      "line": 6,
      "value": "#Scenario One"
    }
  ],
  "line": 7,
  "name": "validate Facebook login page with different credentials",
  "description": "",
  "id": "validate-facebook-and-wallethub-applications;validate-facebook-login-page-with-different-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User launches the Browser and enters the required url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters the username \"Userone\" and password \"Rathod@123\" and click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters the username \"Usertwo\" and password \"Password2\" and click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters the username \"rathodsingh@gmail.com\" and password \"rithi@222\" and click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Status message \"Hello World\" should display",
  "keyword": "Then "
});
formatter.match({
  "location": "sdAssmt.user_launches_the_Browser_and_enters_the_required_url()"
});
formatter.result({
  "duration": 167033406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Userone",
      "offset": 26
    },
    {
      "val": "Rathod@123",
      "offset": 49
    }
  ],
  "location": "sdAssmt.user_enters_the_username_and_password_and_click_on_login_button(String,String)"
});
formatter.result({
  "duration": 26056666096,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Usertwo",
      "offset": 26
    },
    {
      "val": "Password2",
      "offset": 49
    }
  ],
  "location": "sdAssmt.user_enters_the_username_and_password_and_click_on_login_button(String,String)"
});
formatter.result({
  "duration": 22801659997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rathodsingh@gmail.com",
      "offset": 26
    },
    {
      "val": "rithi@222",
      "offset": 63
    }
  ],
  "location": "sdAssmt.user_enters_the_username_and_password_and_click_on_login_button(String,String)"
});
formatter.result({
  "duration": 33298506448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World",
      "offset": 16
    }
  ],
  "location": "sdAssmt.status_message_should_display(String)"
});
formatter.result({
  "duration": 734665,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d"
    },
    {
      "line": 16,
      "value": "#ASSIGNMENT-II"
    },
    {
      "line": 17,
      "value": "#\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d\u003d"
    },
    {
      "line": 19,
      "value": "#Scenario one"
    }
  ],
  "line": 20,
  "name": "Validate the Review Text for the Wallethub Health Insurance Company",
  "description": "",
  "id": "validate-facebook-and-wallethub-applications;validate-the-review-text-for-the-wallethub-health-insurance-company",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User already launched the browser and navigate to Wallethub url",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User overs to fourth and fifth start and click on them",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User click on Write Review button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Redirected to next page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User select \"Health Insurance\" from Policy Drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Provides the Review at least 200 characters",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Submits and confirm the Review",
  "keyword": "Then "
});
formatter.match({
  "location": "sdAssmt.user_already_launched_the_browser_and_navigate_to_Wallethub_url()"
});
formatter.result({
  "duration": 247555,
  "status": "passed"
});
formatter.match({
  "location": "sdAssmt.user_overs_to_fourth_and_fifth_start_and_click_on_them()"
});
formatter.result({
  "duration": 30717988182,
  "status": "passed"
});
formatter.match({
  "location": "sdAssmt.user_click_on_Write_Review_button()"
});
formatter.result({
  "duration": 30222,
  "status": "passed"
});
formatter.match({
  "location": "sdAssmt.user_Redirected_to_next_page()"
});
formatter.result({
  "duration": 27555,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Health Insurance",
      "offset": 13
    }
  ],
  "location": "sdAssmt.user_select_from_Policy_Drop_down(String)"
});
formatter.result({
  "duration": 68888,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 34
    }
  ],
  "location": "sdAssmt.user_Provides_the_Review_at_least_characters(int)"
});
formatter.result({
  "duration": 1030220,
  "status": "passed"
});
formatter.match({
  "location": "sdAssmt.user_Submits_and_confirm_the_Review()"
});
formatter.result({
  "duration": 28444,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "#Scenario two"
    }
  ],
  "line": 30,
  "name": "Validate Review whether properly posted or not",
  "description": "",
  "id": "validate-facebook-and-wallethub-applications;validate-review-whether-properly-posted-or-not",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "User is already on the Wallet home page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user clicks on Sign in Link",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User enters Emailid \"solution.ramesh17@gmail.com \" pwd  \"Shona@143\" and Clicks on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Your Review Text should display as expected",
  "keyword": "Then "
});
formatter.match({
  "location": "sdAssmt.user_is_already_on_the_Wallet_home_page()"
});
formatter.result({
  "duration": 279555,
  "status": "passed"
});
formatter.match({
  "location": "sdAssmt.user_clicks_on_Sign_in_Link()"
});
formatter.result({
  "duration": 31112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "solution.ramesh17@gmail.com ",
      "offset": 21
    },
    {
      "val": "Shona@143",
      "offset": 57
    }
  ],
  "location": "sdAssmt.user_enters_Emailid_pwd_and_Clicks_on_Login_button(String,String)"
});
formatter.result({
  "duration": 9327213050,
  "status": "passed"
});
formatter.match({
  "location": "sdAssmt.your_Review_Text_should_display_as_expected()"
});
formatter.result({
  "duration": 26666,
  "status": "passed"
});
});