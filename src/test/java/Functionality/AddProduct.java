package Functionality;

import ObjectRepository.AddProductPage;
import ObjectRepository.Elements;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddProduct extends Baseclass {


    @Test (priority=1)
    public void addProducttocartTest() throws IOException, InterruptedException {
        PageFactory.initElements(driver,Elements.class);

        Elements.homePage_signin_btn.click();
        Elements.email_txt.sendKeys("9833777148");
        Elements.continue_btn.click();
        Elements.password_txt.sendKeys("Pass@1234");
        Elements.signin_btn.click();

        FileInputStream fi = new FileInputStream("C:\\Users\\beast\\Final_sub_git\\src\\test\\java\\TestData\\amazonprduct.xlsx");
        XSSFWorkbook w1 = new XSSFWorkbook(fi);
        XSSFSheet s1 = w1.getSheetAt(0);
        //Create a loop to print cell values in a row
        for (int i = 1; i <= s1.getLastRowNum(); i++) {
            XSSFRow row = s1.getRow(i);
            String product = row.getCell(0).getStringCellValue();
            PageFactory.initElements(driver,AddProductPage.class);

            AddProductPage.search_txt.sendKeys(product);
            AddProductPage.search_button.click();
            Thread.sleep(1000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(250,300)");
            Thread.sleep(2000);
            List<WebElement> li = driver.findElements(By.xpath("//*[@id='search']//following::a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));;
            li.get(1).click();
            //AddProductPage.product_link.click();
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            for(String newwindow : tabs2){
                driver.switchTo().window(newwindow);
            }
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("javascript:window.scrollBy(250,350)");
            js1.executeScript("document.body.size='50%';");
            Thread.sleep(1000);
            AddProductPage.Add_to_cart_btn.click();
            //AddProductPage.add_cart_btn.click();
            //AddProductPage.Proceed_buy_btn.click();
        }
    }

    @Test (priority=2)
    public void addCartTest() throws IOException, InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        PageFactory.initElements(driver,Elements.class);

        Elements.homePage_signin_btn.click();
        Elements.email_txt.sendKeys("9833777148");
        Elements.continue_btn.click();
        Elements.password_txt.sendKeys("Pass@1234");
        Elements.signin_btn.click();
        Thread.sleep(1000);
        PageFactory.initElements(driver,AddProductPage.class);
        AddProductPage.add_cart_btn.click();
        AddProductPage.Proceed_buy_btn.click();

    }

    /*@Test
    public void addsecondProducttocart() throws IOException {
        FileInputStream fi = new FileInputStream("C:\\Users\\shruti.sachan\\OneDrive - HCL Technologies Ltd\\Documents\\amazonprduct.xlsx");
        XSSFWorkbook w1 = new XSSFWorkbook(fi);
        XSSFSheet s1 = w1
                .getSheetAt(0);
        //Create a loop to print cell values in a row
        for (int i = 2; i <= s1.getLastRowNum(); i++) {
            XSSFRow row = s1.getRow(i);
            String product = row.getCell(0).getStringCellValue();
            PageFactory.initElements(driver,AddProductPage.class);
            AddProductPage.search_txt.sendKeys(product);
            AddProductPage.search_button.click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("javascript:window.scrollBy(250,350)");
            AddProductPage.product_link.click();
            ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("javascript:window.scrollBy(250,350)");
            AddProductPage.Add_to_cart_btn.click();
        }
    }*/
}




