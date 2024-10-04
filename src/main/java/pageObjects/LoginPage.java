package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#email")
    private WebElement emailTextBox;

    @FindBy(css="button[data-testid='submit-email']")
    private WebElement continueButton;

    @FindBy(css="#err-id-email")
    private WebElement errorMessage;

    @FindBy(css="#password")
    private WebElement passwordTextBox;

    @FindBy(css="button[aria-label='edit email']")
    private WebElement editEmail;


    public void enterEmail(String emailId)
    {
        emailTextBox.sendKeys(emailId);
    }

    public void clickContinue()
    {
        continueButton.click();
    }

    public String getErrorMessage()
    {
        String errorMessageText = null;
        if(errorMessage.isDisplayed())
        {
            errorMessageText = errorMessage.getText();
        }
        return errorMessageText;
    }

    public Boolean isPasswordTextBoxDisplayed()
    {
        Boolean flag = false;
        if(passwordTextBox.isDisplayed())
        {
            flag = true;
        }
        return flag;
    }

    public void clickEditEmail()
    {
        editEmail.click();
    }

    public String getEmailValue()
    {
        return emailTextBox.getAttribute("value");
    }

}
