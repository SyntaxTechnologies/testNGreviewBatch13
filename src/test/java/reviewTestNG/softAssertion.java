package reviewTestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {

    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        //seting up the Webdriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        getting the particular url
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
    }
    @Test
    public void Task1() throws InterruptedException {
//        get the webelement with userName field
        WebElement text_userName = driver.findElement(By.xpath("//label[@id='userName-label']"));

        String actualText = text_userName.getText();

        String expectedText="Full Names";
//        soft assertion
//        1. create the object
        SoftAssert soft =new SoftAssert();

//       /2. make the assertion
        soft.assertEquals(actualText,expectedText);
        System.out.println("i am here");

        //        locating the webElement Email
        WebElement email = driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        String actualEmail=email.getText();
//
        String expectedEmail="Email";

//        assert
        soft.assertEquals(actualEmail,expectedEmail);

//        assert all
        soft.assertAll();

    }

}

