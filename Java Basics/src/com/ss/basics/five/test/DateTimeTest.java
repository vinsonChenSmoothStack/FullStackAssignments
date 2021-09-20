package com.ss.basics.five.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;

import com.ss.basics.five.DateTimeAssignment;

import org.junit.Test;

public class DateTimeTest {
    DateTimeAssignment testObject = new DateTimeAssignment();

	@Test
	public void printDaysOfMonthForYearTest1() {
        assertEquals(Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31), testObject.daysOfMonthForYear(1992));
    }

    @Test
	public void printDaysOfMonthForYearTest2() {
        assertEquals(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31), testObject.daysOfMonthForYear(1993));
    }

    @Test
    public void dayOfMondaysOnMonthTest1(){
        assertEquals(Arrays.asList(6,13,20,27), testObject.dayOfMondaysOnMonth(9));
    }

    @Test
    public void dayOfMondaysOnMonthTest2(){
        assertEquals(Arrays.asList(5,12,19,26), testObject.dayOfMondaysOnMonth(7));
    }

    @Test
    public void isFriday13thTest1(){
        assertEquals(Boolean.FALSE, testObject.isFriday13th(LocalDate.now()));
    }

    @Test
    public void isFriday13thTest2(){
        assertEquals(Boolean.TRUE, testObject.isFriday13th(LocalDate.of(2021,8,13)));
    }

}