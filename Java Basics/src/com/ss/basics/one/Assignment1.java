package com.ss.basics.one;

public class Assignment1 {
    public static void main(String[] args){
        for (int i = 1; i <= 4; i++){
            System.out.println(i+")");

            if (i % 2 == 1){
                printStars(i);
                printLines(i);
            }
            else{
                printLines(i);
                printStars(i);
            }
        }
    }


    public static void printStars(Integer n){
        if (n == 1){
            for (int i = 1; i <= 4; i++){
                for(int j = 0; j < i; j++){
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
        }
        if (n == 2){
            for (int i = 4; i > 0; i--){
                for(int j = 0; j < i; j++){
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
        }
        if (n == 3){
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 5 - i; j++){
                    System.out.printf(" ");
                }
                for(int j = 0; j < (2 * i) + 1; j++){
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
        }
        if (n == 4){
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 2 + i; j++){
                    System.out.printf(" ");
                }
                for(int j = 0; j < 7 - (2 * i); j++){
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
        }
    }

    public static void printLines(Integer n){
        System.out.printf("........");
        for (int i = 0; i < n; i++){
            System.out.printf(".");
        }
        System.out.printf("\n");
    }
}
