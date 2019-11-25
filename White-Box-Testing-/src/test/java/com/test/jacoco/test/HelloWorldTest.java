package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	hw.Method3(6, -1, 1);
        hw.Method3(1, -1, 1);
        hw.Method3(1, -1, -3);
        hw.Method3(6, 0, 1);
        hw.Method3(1, -1, -1);
        hw.Method3(5, -1, -3);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        hw.Method4(5, 5, 1, 1, 1);
        try {
            hw.Method4(5, 1, 1, 2, 1);
        }
        catch (Exception e) {
        hw.Method4(0, -1, 1, 1, 1);
        }
        hw.Method4(5, 1, 1, 1, 1);
        try {
            hw.Method4(4, 1, 1, 1, 1);
        }
        catch (Exception e) {
        }
    }
    @Test
    public void testbug() {
        HelloWorld hw = new HelloWorld();
        hw.bug(5);
        hw.bug(4);
    }

    @Test
    public void testisTriangle() {
        /**
         * TODO：finish the test function
         */
        HelloWorld hw = new HelloWorld();
        hw.isTriangle(6, 3, 3);
        hw.isTriangle(13, 9, 5);
        hw.isTriangle(1, 1, 0);
        hw.isTriangle(0, 1, 1);
        hw.isTriangle(1, 0, 1);
        hw.isTriangle(0, 0, 1);
        hw.isTriangle(0, 1, 0);
        hw.isTriangle(1, 0, 0);
        hw.isTriangle(0, 0, 0);
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw = new HelloWorld();
        boolean isBirthday = hw.isBirthday(1989, 1, 1);
        boolean isBirthday2 = hw.isBirthday(2000, 1, 100);
        boolean isBirthday3 = hw.isBirthday(2000, 1, 1);
        boolean isBirthday4 = hw.isBirthday(2020, 1, 1);
    }

    @Test
    public void testminiCalculator() {
        HelloWorld hw = new HelloWorld();
        hw.miniCalculator(6, 1, '+');
        hw.miniCalculator(6, 1, '-');
        hw.miniCalculator(6, 1, '*');
        hw.miniCalculator(6, 1, '/');
        hw.miniCalculator(6, 0, '1');
    }
}
