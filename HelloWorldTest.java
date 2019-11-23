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
    	int a = hw.Method3(6, -1, 1);
    	int b = hw.Method3(0, -1, 1);
    	int c = hw.Method3(4, -1, -3);
    	int e = hw.Method3(4, -3, -1);
    	int d = hw.Method3(6, 1, -1);

        assertEquals(0, a);
        assertEquals(0, b);
        assertEquals(0, c);
        assertEquals(0, d);
        assertEquals(0, e);

    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 0, 0, 0, 0);
        int b = hw.Method4(1, 1, 0, 0, 0);
        int c = hw.Method4(5, 0, 0, 0, 0);
        try {
            int d = hw.Method4(5, 0, 0, 1, 0);
        }catch (ArithmeticException ae){
        }
        try {
            int e = hw.Method4(1, 0, 0, 0, 0);
        }catch (ArithmeticException ae){
        }
        assertEquals(0, a);
        assertEquals(0, b);
        assertEquals(0, c);
    }

    @Test
    public void testbug(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.bug(5);
        boolean b = hw.bug(4);
        assertEquals(a, true);
        assertEquals(b, false);
    }

    @Test
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(0,0,0);
        boolean b = hw.isTriangle(1,0,0);
        boolean c = hw.isTriangle(1,1,0);

        boolean d = hw.isTriangle(3,4,5);
        boolean e = hw.isTriangle(3,4,7);

//        boolean f = hw.isTriangle(4,3,5);
//        boolean g = hw.isTriangle(4,3,7);

        boolean h = hw.isTriangle(5,4,3);
        boolean i = hw.isTriangle(7,4,3);

        assertEquals(false, a);
        assertEquals(false, b);
        assertEquals(false, c);
        assertEquals(true, d);
        assertEquals(false, e);

//        assertEquals(true, f);
//        assertEquals(false, g);
        assertEquals(true, h);
        assertEquals(false, i);

    }

    @Test
    public void testminiCalculator(){
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(1,1,'+');
        double b = hw.miniCalculator(1,1,'-');
        double c = hw.miniCalculator(1,1,'*');
        double d = hw.miniCalculator(1,1,'/');
        double e = hw.miniCalculator(1,-0.0000000000001,'/');
        double f = hw.miniCalculator(1,0.0,'/');

        try {
            double g = hw.miniCalculator(1, 1, '!');
        } catch(ArithmeticException ae) {

        }


        assertEquals(2.0, a, 0.000001);
        assertEquals(0.0, b, 0.000001);
        assertEquals(1.0, c, 0.000001);
        assertEquals(1.0, d, 0.000001);
        assertEquals(100000000000000.0, e, 0.000001);
        assertEquals(100000000000000.0, f, 0.000001);
    }

    @Test
    public void testisBirthday(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isBirthday(1989,1,1);
        boolean b = hw.isBirthday(2020,1,1);
        boolean c = hw.isBirthday(2019,11,1);
        boolean d = hw.isBirthday(2019,10,2);

        boolean z = hw.isBirthday(2019,10,1);
        boolean zz = hw.isBirthday(2019,9,1);
        boolean g = hw.isBirthday(2019,9,0);
        boolean h = hw.isBirthday(2019,9,31);


        boolean e = hw.isBirthday(2018,0,1);
        boolean f = hw.isBirthday(2018,13,1);


      //  boolean g = hw.isBirthday(2003,1,0);
      //  boolean h = hw.isBirthday(2003,1,32);
      //  boolean i = hw.isBirthday(2003,1,31);

        boolean k = hw.isBirthday(2004,2,0);
        boolean l = hw.isBirthday(2004,2,30);
        boolean m = hw.isBirthday(2004,2,29);

        assertEquals(false, a);
        assertEquals(false, b);
        assertEquals(false, c);
        assertEquals(false, d);
        assertEquals(true, z);
        assertEquals(true, zz);
        assertEquals(false, g);
        assertEquals(false, h);
        assertEquals(false, e);
        assertEquals(false, f);
        assertEquals(false, k);
        assertEquals(false, l);
        assertEquals(true, m);


    }

}
