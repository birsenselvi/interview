package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class TestRegister extends BaseTest{

    Locators lc;

    @Test
    public void test1(){

        lc = new Locators();
        driver.get("https://automationexercise.com/");

        wait.until(ExpectedConditions.visibilityOfAllElements(lc.eLogo));

        clickToElement(lc.eLogin);

        Faker faker = new Faker();

        lc.eName.sendKeys(faker.name().fullName());
        lc.eEmail.sendKeys(faker.internet().emailAddress());

    }
}
