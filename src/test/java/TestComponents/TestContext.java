package TestComponents;

import org.openqa.selenium.WebDriver;
import managers.PageObjectManager;

import java.util.Map;

public class TestContext {
    private WebDriver driver;
    private PageObjectManager pageObjectManager;
    private Map<String, String> excelData;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
        this.pageObjectManager = new PageObjectManager(driver);
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public Map<String, String> getExcelData() {
        return excelData;
    }

    public void setExcelData(Map<String, String> excelData) {
        this.excelData = excelData;
    }
}
