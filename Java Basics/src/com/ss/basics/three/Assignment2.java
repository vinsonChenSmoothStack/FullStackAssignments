package com.ss.basics.three;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/*
 * Will take two arguments: File Directory and string to append
 * Appends all of the strings into the file.
 */
public class Assignment2 {
    public static void main(String[] args) throws IOException{
        FileWriter writeFile = null;
        PrintWriter printFile = null;
        BufferedWriter bufFile = null;
        if (args.length == 0){
            System.out.printf("No arguments given!\n");
            return;
        }
        try{
            writeFile = new FileWriter(args[0], true);
            bufFile = new BufferedWriter(writeFile);
            printFile = new PrintWriter(bufFile);
            
            for (int i = 1; i < args.length; i++){
                printFile.printf("%s", args[i]);
                if (i != args.length - 1){
                    printFile.printf(" ");
                }
                else{
                    printFile.printf("\n");
                }
            }
            printFile.flush();
        } catch (IOException e){
            System.out.printf("Cannot find file: %s", args[0]);
        }
         finally {
            writeFile.close();
            printFile.close();
            bufFile.close();
        }
    }
}
