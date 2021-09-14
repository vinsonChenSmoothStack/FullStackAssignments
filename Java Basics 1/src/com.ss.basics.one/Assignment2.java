package com.ss.basics.one;

import java.util.Random;

public class Assignment2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int r = rand.nextInt(100) + 1;
        int nextInt;
        System.out.printf("Guess a number between 1 - 100: ");
        for (int i = 0; i < 5; i++){
            nextInt = s.nextInt();
            if (Math.abs(r-nextInt) < 10){
                System.out.println("You are within 10 digits away! The number is: "+r);
                return;
            }
            if (i != 4){
                System.out.printf("You are not correct. Guess again (1-100): ");
            }
            else{
                System.out.println("You are out of tries!\nTry again next time!");
            }
        }
        s.close();
    }
}
