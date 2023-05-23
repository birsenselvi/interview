package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Driver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    protected WebDriverWait wait;
    @BeforeTest
    public void beforeTest1(String browser){

        driver = Driver.getDriver(browser);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    @AfterTest
    public void afterTest(){

        //driver.close();

    }

    public void scrollToElements(WebElement element){

        new Actions(driver)
                .scrollToElement(element)
                .perform();

    }
    public void clickToElement(WebElement element){

        scrollToElements(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public void clickToLocator(By locator){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Actions(driver)
                .scrollToElement(element)
                .moveToElement(element)
                .click()
                .perform();

    }

    public void clickByJS(WebElement element){

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    public void clickByJS(By locator){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    public void sendKeys(By locator, CharSequence ...text){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);

    }

}
