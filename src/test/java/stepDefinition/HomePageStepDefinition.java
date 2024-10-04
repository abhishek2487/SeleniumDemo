package stepDefinition;

import TestComponents.TestContext;
import io.cucumber.java.en.*;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Map;

public class HomePageStepDefinition{

    private TestContext testContext;
    private WebDriver driver;
    private Map<String, String> excelData;
    private PageObjectManager pageObjectManager;


    public HomePageStepDefinition(TestContext context) {
        this.testContext = context;
        this.driver = context.getDriver();
        this.excelData = context.getExcelData();
        this.pageObjectManager = context.getPageObjectManager();
    }

    @Given("user navigates to Nytimes page")
    public void user_navigates_to_nytimes_page() {
        driver.get(excelData.get("WebsiteUrl"));
    }

    @Given("user clicks on Login button")
    public void user_clicks_on_login_button() {
        pageObjectManager.getHomePage().clickLogin();
    }


    @Given("user clicks on search button")
    public void user_clicks_on_search_button() {
        pageObjectManager.getHomePage().clickSearch();
    }
    @Given("user search for news")
    public void user_search_for_news() {
        pageObjectManager.getHomePage().enterNewsItem(excelData.get("NewsToSearch"));
    }
    @Then("results should show the news")
    public void results_should_show_the_news() {
        if(pageObjectManager.getHomePage().getNewsItems()>0)
        {
            Assert.assertTrue(true);
        }else
        {
            Assert.assertFalse(false);
        }
    }

}
