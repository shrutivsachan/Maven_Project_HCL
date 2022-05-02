package demoAutomatingTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMain {

    @Test
    public void Test1(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shruti.sachan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Roger");
        driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Bangalore");
        //input[@type = 'email']
        driver.close();



    }
}
