package JUNIT;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecodTest extends FirstTest{

    @Test
    public void mulTest(){
        assertSame(12,cal.mul(6, 2));
    }

    @Ignore
    @Test
    public void divTest(){
        assertNotEquals(12,cal.sub(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void zeroTest(){
       int a= 0, b=5 , c;
       c = b/a;
    }

    @Test
    public void avgTest(){
        assertNull("avg is", null);
    }
}
