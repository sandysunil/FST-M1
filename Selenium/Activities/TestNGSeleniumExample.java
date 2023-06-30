package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSeleniumExample {
    // Declare Global object
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeClass
    public void setUp() {
        //Install firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Initialize driver
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        driver = new FirefoxDriver();
        softAssert = new SoftAssert();

        //open a page
        driver.get("https://www.training-support.net");

    }

    @Test
    public void homepageText() {
        // find and get the text of the heading
        String Heading1 = driver.findElement(By.tagName("h1")).getText();

        // Assertion

        Assert.assertEquals(Heading1, "Training Support");

    }
    @AfterClass
    public void teardown() {
        driver.quit();
    }


    }



