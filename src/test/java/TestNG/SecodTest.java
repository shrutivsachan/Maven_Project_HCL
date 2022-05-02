package TestNG;



import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecodTest extends FirstTest {

    @Test
    public void mulTest(){
        assertEquals(12,cal.mul(6, 2));
    }


    @Test
    public void divTest(){
        assertNotEquals(12,cal.sub(6, 3));
    }


    @Test
    public void zeroTest(){
       int a= 0, b=5 , c;
       c = b/a;
    }

}
