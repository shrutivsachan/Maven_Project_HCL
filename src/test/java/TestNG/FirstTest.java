package TestNG;

import JUNIT.calculator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;


public class FirstTest {
    calculator cal = new calculator();
    @BeforeSuite
    public static void beforeSuite() throws Exception {
        System.out.println("BeforeSuite");
    }
    @Test
    public void addTest() {
        assertEquals(10,cal.add(5,5));
    }

    @Test
    public void subTest(){
        assertEquals(12,cal.sub(24, 12));
    }

    @AfterSuite
    public static void afterSuite() throws Exception {
        System.out.println("AfterSuite");
    }

}