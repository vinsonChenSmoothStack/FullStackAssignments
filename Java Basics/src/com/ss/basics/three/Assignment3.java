package com.ss.basics.three;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Assignment 3 ---
 * Takes 2 command line argument: path of the file to read and the character to find (If it's more than 1 character, will use the first one).
 * Will count how many characters are found in the file and print it out.
 */
public class Assignment3 {
    public static void main(String[] args){
        if (args.length < 2){
            System.out.printf("Not enough arguments!\n");
            return;
        }
        Integer charFound = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            while(br.ready()){
                if((char)br.read() == args[1].charAt(0)){
                    charFound++;
                }
            }
        } catch (IOException e){
            System.out.printf("Cannot read file!\n");
        }
        System.out.printf("Searching for %c...\nFound: %d", args[1].charAt(0), charFound);
    }
}
