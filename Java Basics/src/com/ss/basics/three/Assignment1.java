package com.ss.basics.three;

import java.io.File;

/*
 * Assignment 1 ---
 * Takes 1 command line argument: path of directory
 * Prints out all files and sub directories in the directory.
 */

public class Assignment1 {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.printf("No arguments\n");
            return;
        }
        Assignment1 asgn1 = new Assignment1();
        asgn1.printDirectory(args[0], "");

    }

    private void printDirectory(String dirLoc, String prep){
        File dir = new File(dirLoc);

        for (File file : dir.listFiles()){
            if (file.isFile()){
                System.out.printf("%s %s\n", prep, file.getName());
            }
            else if (file.isDirectory()){
                System.out.printf("%s>%s\n", prep, file.getName());
                printDirectory(dirLoc+"/"+file.getName(), prep+"  ");
            }
        }
    }
}
