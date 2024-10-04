package stepDefinition;

import TestComponents.TestContext;
import io.cucumber.java.en.*;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.LoginPage;

import java.util.Map;

public class LoginPageStepDefinition{

    private TestContext testContext;
    private WebDriver driver;
    private PageObjectManager pageObjectManager;
    private Map<String, String> excelData;

    public LoginPageStepDefinition(TestContext context) {
        this.testContext = context;
        this.driver = context.getDriver();
        this.pageObjectManager = context.getPageObjectManager();
        this.excelData = context.getExcelData();
    }

    @Then("user should navigate to Login Screen")
    public void user_should_navigate_to_login_screen() {
        if(driver.getTitle().contains("Enter email"))
        {
            Assert.assertTrue(true,"User successfully navigated to login screen.");
        }
        else
        {
            Assert.assertFalse(false,"User failed to navigate to login screen.");
        }
    }
    @Given("user enters an invalid email {string}")
    public void user_enters_an_invalid_email(String string) {
        pageObjectManager.getLoginPage().enterEmail(excelData.get("InvalidEmail"));
    }
    @Given("user clicks on continue button")
    public void user_clicks_on_continue_button() {
        pageObjectManager.getLoginPage().clickContinue();
    }
    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertEquals(pageObjectManager.getLoginPage().getErrorMessage(),excelData.get("ErrorMessage"));
    }

    @Given("user enters a valid email")
    public void user_enters_a_valid_email() {
        pageObjectManager.getLoginPage().enterEmail(excelData.get("ValidEmail"));
    }

    @Then("user should navigate to create account page")
    public void user_should_navigate_to_create_account_page() {
        Assert.assertTrue(pageObjectManager.getLoginPage().isPasswordTextBoxDisplayed());
    }

    @Then("should be able to edit the email id")
    public void should_be_able_to_edit_the_email_id() {
        pageObjectManager.getLoginPage().clickEditEmail();
        pageObjectManager.getLoginPage().enterEmail(excelData.get("AnotherEmail"));
        Assert.assertEquals(pageObjectManager.getLoginPage().getEmailValue(),excelData.get("AnotherEmail"));
    }
}
