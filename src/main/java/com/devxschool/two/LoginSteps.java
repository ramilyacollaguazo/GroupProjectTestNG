package com.devxschool.two;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    // TODO initialize this class
    WebPage webPage;
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {

        webPage= new WebPage();
        Assert.assertTrue(webPage.navigate("Login"));
    }

    @When("I enter a valid username {string} with more than 5 characters")
    public void i_enter_a_valid_username_with_more_than_characters(String username) {

        Assert.assertTrue(webPage.enterUsername(username));
       
    }

    @When("I enter a valid password {string} with more than 8 characters")
    public void i_enter_a_valid_password_with_more_than_characters(String password) {

        Assert.assertTrue(webPage.enterPassword(password));
       
    }

    @When("I submit the form")
    public void i_submit_the_form() {
       webPage.submit();
       
    }

    @Then("I am registered and logged in")
    public void i_am_registered_and_logged_in() {
        Assert.assertTrue(webPage.isLoggedIn());

    }

    @When("I enter an invalid username {string} with less than 5 characters")
    public void i_enter_an_invalid_username_with_less_than_characters(String username) {
       Assert.assertFalse(webPage.enterUsername(username));
    }

    @Then("I see the error message {string}")
    public void i_see_the_error_message(String errorMessage) {
        Assert.assertEquals(webPage.getErrorMessage(),errorMessage);

    }

    @When("I enter an invalid password {string} with less than 8 characters")
    public void i_enter_an_invalid_password_with_less_than_characters(String password) {
       Assert.assertFalse(webPage.enterPassword(password));
       
    }

    @When("I login using valid credentials")
    public void i_login_using_valid_credentials() {
       Assert.assertTrue(webPage.enterUsername("Ramilya"));
       Assert.assertTrue(webPage.enterPassword("kuudhdieo21"));
       webPage.submit();
    }

    @Then("I see login status {string}")
    public void i_see_login_status(String status) {
        Assert.assertEquals(webPage.getLoginStatus(),status);

    }

    @When("I click on the logout button")
    public void i_click_on_the_logout_button() {
       Assert.assertTrue(webPage.logout());
       
    }

    @Then("I am logged out")
    public void i_am_logged_out() {
        Assert.assertFalse(webPage.isLoggedIn());
       
       
    }

}