package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        //Install firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Initialize driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        WebDriver driver = new FirefoxDriver();
       //open a page
                driver.get("https://www.training-support.net/");

       // interaction
        WebElement aboutUs = driver.findElement(By.id("about-link"));
        System.out.println(aboutUs.getText());
        aboutUs.click();
        driver.quit();
    }
}
