package com.ss.basics.weekone.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.ss.basics.weekone.WeekOneAssignments;

import org.junit.Test;

public class WeekOneAssignmentsTest {
    
    WeekOneAssignments testObject = new WeekOneAssignments();

    @Test
    public void rightDigitTest1(){
        assertEquals(Arrays.asList(1, 2, 3), testObject.rightDigit(Arrays.asList(1, 22, 93)));
    }

    @Test
    public void rightDigitTest2(){
        assertEquals(Arrays.asList(6, 8, 6, 8, 1), testObject.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
    }

    @Test
    public void rightDigitTest3(){
        assertEquals(Arrays.asList(0, 0), testObject.rightDigit(Arrays.asList(10, 0)));
    }

    @Test
    public void rightDigitTest4(){
        assertEquals(Arrays.asList(6, 8, 6, 8, 1), testObject.rightDigit(Arrays.asList(-16, 8, -886, 8, -1)));
    }

    @Test    
    public void rightDigitTest5(){
        assertEquals(Arrays.asList(), testObject.rightDigit(Arrays.asList()));
    }

    @Test
    public void doubingTest1(){
        assertEquals(Arrays.asList(2, 4, 6), testObject.doubling(Arrays.asList(1,2,3)));
    }
    
    @Test
    public void doubingTest2(){
        assertEquals(Arrays.asList(12, 16, 12, 16, -2), testObject.doubling(Arrays.asList(6, 8, 6, 8, -1)));
    }
    @Test
    public void doubingTest3(){
        assertEquals(Arrays.asList(), testObject.doubling(Arrays.asList()));
    }

    @Test
    public void doubingTest4(){
        assertEquals(Arrays.asList(2, 6, 10), testObject.doubling(Arrays.asList(1,3,5)));
    }

    @Test
    public void doubingTest5(){
        assertEquals(Arrays.asList(0,0,0,0,0), testObject.doubling(Arrays.asList(0,0,0,0,0)));
    }

    @Test
    public void noXTest1(){
        assertEquals(Arrays.asList("a", "bb", "c"), testObject.noX(Arrays.asList("ax", "bb", "cx")));
    }

    @Test
    public void noXTest2(){
        assertEquals(Arrays.asList("a", "bb", "c"), testObject.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
    }

    @Test
    public void noXTest3(){
        assertEquals(Arrays.asList(""), testObject.noX(Arrays.asList("x")));
    }

    @Test
    public void noXTest4(){
        assertEquals(Arrays.asList("", "", ""), testObject.noX(Arrays.asList("x", "xx", "xxx")));
    }

    @Test
    public void noXTest5(){
        assertEquals(Arrays.asList("aeman", "puppyfo", "dragons"), testObject.noX(Arrays.asList("axeman", "puppyfox", "dragons")));
    }


    @Test
    public void groupSumClumpTest1(){
        assertEquals(Boolean.TRUE, testObject.groupSumClump(0, Arrays.asList(2,4,6), 10));
    }

    @Test
    public void groupSumClumpTest2(){
        assertEquals(Boolean.TRUE, testObject.groupSumClump(0, Arrays.asList(1, 2, 4, 8, 1), 14));
        
    }

    @Test
    public void groupSumClumpTest3(){
        assertEquals(Boolean.TRUE, testObject.groupSumClump(0, Arrays.asList(2, 4, 4, 8), 14));
        
    }
}
