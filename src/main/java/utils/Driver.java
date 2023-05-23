package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){

        return getDriver("chrome");

    }
    public static WebDriver getDriver(String browser) {

        if (driver.get() == null) {
            switch (browser.toLowerCase()) {
                case "Edge":
                    driver.set(new EdgeDriver());
                case "Firefox":
                    driver.set(new FirefoxDriver());
                default:
                    driver.set(new ChromeDriver());
            }
        }
        return driver.get();
    }
    public static void close(){
        if(driver.get()!=null){
            driver.get().quit();
            driver.set(null);
        }
    }
}
