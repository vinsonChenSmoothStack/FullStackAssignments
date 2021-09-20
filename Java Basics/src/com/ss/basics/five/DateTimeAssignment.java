package com.ss.basics.five;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeAssignment {
    public static void main (String[]argv){
        int givenYear = 1992;
        LocalDate lDate = null;
        for(int i = 1; i <= 12; i++){
            lDate = LocalDate.of(givenYear, i, 1);
            System.out.printf("Days in %s: %d\n", lDate.getMonth().toString(), lDate.getMonth().length(lDate.isLeapYear()));
        }

        int givenMonth = 7;
        lDate = LocalDate.now();
        lDate = LocalDate.of(lDate.getYear(),givenMonth, 1);
        int printDay = 9 - lDate.getDayOfWeek().getValue();

        System.out.printf("Mondays of the month of %s: ", Month.of(givenMonth));
        while(printDay < lDate.getMonth().length(lDate.isLeapYear())){
            if (printDay >= 8){
                System.out.printf(" - ");
            }
            System.out.printf("%d", printDay);
            printDay = printDay+7;
        }
        System.out.printf("\n");

        //Test if day is on Friday the 13th
        lDate = LocalDate.of(2021, 8, 13);
        if(lDate.getDayOfWeek().getValue() == 5 && lDate.getDayOfMonth() == 13){
            System.out.printf("The day is Friday the 13th\n");
        }
        else{
            System.out.printf("The Day is not Fridya the 13th\n");
        }
    }
}
