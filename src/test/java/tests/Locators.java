package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Locators {

    Locators(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement eLogo;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav']//a)[4]")
    public WebElement eLogin;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement eName;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement eEmail;

    @FindBy(xpath = "(//form[@method='POST']//button)[2]")
    public WebElement eSignUp;

    @FindBy(xpath = "//div[@class='radio-inline']//input")
    public List<WebElement> eRadioCenders;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement ePassword;

    @FindBy(xpath = "//select[@name='days']")
    public WebElement eSelectDays;

    @FindBy(xpath = "//select[@name='months']")
    public WebElement eSelectMonths;

    @FindBy(xpath = "//select[@name='years']")
    public WebElement eSelectYears;

    @FindBy(xpath = "//div[@class='checkbox']//input")
    public List<WebElement> eCheckBoxes;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement eSelectCountry;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement eAccountCreated;

    @FindBy(xpath = "//[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    public WebElement eLoggedVisiable;

    @FindBy(xpath = "//[@id=\"form\"]/div/div/div/h2/b")
    public WebElement eAccountDeleted;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement eCreateAccount;




}
