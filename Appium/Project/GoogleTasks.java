package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GoogleTasks {

    WebDriverWait wait;
    AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setCapability("deviceName", "RZ8M93DMJSZ");
        options.setCapability("platformName", "android");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("appPackage", "com.google.android.apps.tasks");
        options.setCapability("appActivity", ".ui.TaskListsActivity");
        options.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Open page
        //driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void newtasks() {
        //click on new tasks button
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Create new task\"]")).click();
        //wait for the edit text box
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//com.google.android.apps.tasks:id/add_task_title")));

        //enter the text
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText")).sendKeys("Complete");
        //click on save
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.tasks:id/task_name")));
        //get the text of the task is added
        String task1 = driver.findElement(AppiumBy.xpath("////android.widget.FrameLayout[@content-desc=\"Complete tasks\"]/android.view.ViewGroup/android.widget.TextView")).getText();

        Assert.assertEquals(task1, "Complete tasks");
        //wait for the edit text box
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));

        //enter the text
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete the second Activity Google Keep");
        //click on save
        driver.findElement(AppiumBy.id("add_task_done")).click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
        String task2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();

        Assert.assertEquals(task2, "Complete the second Activity Google Keep");

        //wait for the edit text box
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("add_task_title")));

        //enter the text
        driver.findElement(AppiumBy.id("add_task_title")).sendKeys("Complete Activity with Google Keep");
        //click on save
        driver.findElement(AppiumBy.id("add_task_done")).click();
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("tasks_fab")));
        String task3 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView")).getText();

        Assert.assertEquals(task3, "Complete Activity with Google Keep");

        //String task1name = driver.findElementById("task_name").getText();
//        int count = 0;
//        List<MobileElement> textItems = driver.findElementsByClassName("android.widget.TextView");
//        for(MobileElement textItem : textItems) {
//            if(textItem.getText().equalsIgnoreCase("Complete Activity with Google Tasks")){
//                count = +count;
//            }
//            System.out.println(textItem.getText());
//
//        }

        //Assert.assertEquals(task1name,"Complete Activity with Google Tasks");

    }
}

