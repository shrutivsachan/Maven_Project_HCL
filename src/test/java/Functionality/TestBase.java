package Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shruti.sachan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        LoginValidation lv = new LoginValidation();
        //lv.login();
    }
}
