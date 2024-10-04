package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage{

	private WebDriver driver;

	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'Log in')]")
	private WebElement loginButton;

	@FindBy(css="button[data-testid='search-button']")
	private WebElement searchButton;

	@FindBy(css="input[placeholder='SEARCH']")
	private WebElement searchBox;

	@FindBy(css ="button[type='submit']")
	private WebElement goButton;

	@FindBy(css="main[id='site-content'] li")
	private List<WebElement> newsList;

	public void clickSearch()
	{
		searchButton.click();
		searchBox.click();
	}

	public void enterNewsItem(String newsItem)
	{
		searchBox.sendKeys(newsItem);
		goButton.click();
	}

	public void clickLogin()
	{
		loginButton.click();
	}

	public int getNewsItems()
	{
		return newsList.size();
	}

}
