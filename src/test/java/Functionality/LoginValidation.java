package Functionality;

import ObjectRepository.Elements;
import org.junit.rules.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginValidation extends Baseclass {


    @Test (priority = 3)
    public void invalid_loginTest() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        PageFactory.initElements(driver,Elements.class);
        Elements.homePage_signin_btn.click();
        Elements.email_txt.sendKeys("9833777148");
        Elements.continue_btn.click();
        Elements.password_txt.sendKeys("Pass@1234567");
        Elements.signin_btn.click();
        Assert.assertEquals("There was a problem",Elements.error_msg.getText());
        driver.quit();
    }

    @Test (priority = 2)
    public void valid_loginTest() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        PageFactory.initElements(driver,Elements.class);
        Elements.homePage_signin_btn.click();
        Elements.email_txt.sendKeys("9833777148");
        Elements.continue_btn.click();
        Elements.password_txt.sendKeys("Pass@1234");
        Elements.signin_btn.click();
        Assert.assertEquals("Hello, Shruti",Elements.verify_login.getText());
        driver.quit();
    }

    @Test (priority = 1)
    public void alternate_loginTest() throws InterruptedException {
        PageFactory.initElements(driver,Elements.class);
        Elements.homePage_signin_btn.click();
        Elements.needhelp_link.click();
        Elements.forgotPass_link.click();
        Elements.email_txt.sendKeys("9833777148");
        Elements.continue_btn.click();
        Thread.sleep(1000);
        Elements.ContinueOTP_btn.click();
        driver.quit();
    }
}
