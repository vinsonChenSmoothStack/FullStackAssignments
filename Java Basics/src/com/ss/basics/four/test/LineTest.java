package com.ss.basics.four.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.ss.basics.four.Line;

public class LineTest {
    Line line1 = new Line(1,2,3,4);
	Line line2 = new Line(-10, 0, 10, 20);
    Line line3 = new Line(0,0,0,0);
    Line line4 = new Line(0,0,3,4);
    Line line5 = new Line(0,0,0.000000001, 2147000000);

	@Test
	public void line1Slope() {
        assertEquals(Double.valueOf(1), Double.valueOf(line1.getSlope()), Double.valueOf(0.0001));
    }

    @Test
	public void line1Distance() {
        assertEquals(Double.valueOf(1.414214), Double.valueOf(line1.getDistance()), Double.valueOf(0.0001));
	}
	
	@Test
	public void line2Slope() {
        assertEquals(Double.valueOf(1), Double.valueOf(line2.getSlope()), Double.valueOf(0.0001));
    }

    @Test
	public void line2Distance() {
        assertEquals(Double.valueOf(28.284271), Double.valueOf(line2.getDistance()), Double.valueOf(0.0001));
	}
	
    @Test
    public void line3Slope(){
        assertThrows(ArithmeticException.class, () -> {line3.getSlope();});
    }

    @Test
	public void line3Distance() {
        assertEquals(Double.valueOf(0), Double.valueOf(line3.getDistance()), Double.valueOf(0.0001));
    }

    @Test
    public void line4Slope(){
        assertEquals(Double.valueOf(1.3333333), Double.valueOf(line4.getSlope()), Double.valueOf(0.0001));
    }

    @Test
	public void line4Distance() {
        assertEquals(Double.valueOf(5), Double.valueOf(line4.getDistance()), Double.valueOf(0.0001));
    }

    @Test
    public void line5Slope(){
        assertThrows(ArithmeticException.class, () -> {line5.getSlope();});
    }

    @Test
	public void line5Distance() {
        assertEquals(Double.valueOf(2147000000), Double.valueOf(line5.getDistance()), Double.valueOf(0.0001));
    }

    @Test
    public void parallelTo_test1(){
        assertTrue(Boolean.valueOf(line1.parallelTo(line2)));
    }

    @Test
    public void parallelTo_test2(){
        assertTrue(!Boolean.valueOf(line1.parallelTo(line4)));
    }

    @Test
    public void parallelTo_test3(){
        assertThrows(ArithmeticException.class, () -> {line3.parallelTo(line1);});
    }


    /*
	@Test
	public void addNegTest() {
		assertNotEquals(new Integer(30), calc.add(10, 10));
		assertNotEquals(new Integer(10), calc.add(10, 10));
	}
	
	@Test
	public void subNegTest() {
		assertNotEquals(new Integer(30), calc.sub(10, 10));
		assertNotEquals(new Integer(10), calc.sub(10, 10));
	}
	
	@Test
	public void addTest() {
		assertEquals(new Integer(20), calc.add(10, 10));
	}
	
	@Test
	public void subTest() {
		assertEquals(new Integer(0), calc.sub(10, 10));
	}
*/
}