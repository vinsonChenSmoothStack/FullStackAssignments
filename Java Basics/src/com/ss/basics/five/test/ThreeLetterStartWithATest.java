package com.ss.basics.five.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import com.ss.basics.five.ThreeLetterStartWithA;

import org.junit.Test;

public class ThreeLetterStartWithATest {
    ThreeLetterStartWithA testObject = new ThreeLetterStartWithA();

    @Test
    public void Test1(){
        assertEquals(Arrays.asList(), testObject.threeLetterLowerCaseA(Arrays.asList("dank", "memes", "hello", "world!")));
    }

    @Test
    public void Test2(){
        assertEquals(Arrays.asList("abc"), testObject.threeLetterLowerCaseA(Arrays.asList("abc", "memes", "hello", "world!")));
    }

    @Test
    public void Test3(){
        assertEquals(Arrays.asList("abc"), testObject.threeLetterLowerCaseA(Arrays.asList("abc", "ABC", "hello", "world!")));
    }

    @Test
    public void Test4(){
        assertEquals(Arrays.asList("abc"), testObject.threeLetterLowerCaseA(Arrays.asList("abc", "ABC", "aligator", "Aligator!")));
    }
}
