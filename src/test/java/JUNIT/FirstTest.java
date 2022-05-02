package JUNIT;

import org.junit.Test;

import static org.junit.Assert.*;



public class FirstTest {
    calculator cal = new calculator();

    @Test
    public void addTest() {
        assertEquals(10,cal.add(5,5));
    }

    @Test(timeout = 10000)
    public void subTest(){
        assertEquals(12,cal.sub(24, 12));
    }


}