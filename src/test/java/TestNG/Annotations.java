package TestNG;

import org.junit.*;
import org.testng.annotations.BeforeSuite;

public class Annotations {



    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("AfterClass");
    }
    @Test
    public void test() throws Exception {
        System.out.println("Test");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("Test1");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("Test2");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("BeforeTest");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("AfterTest");
    }


}
