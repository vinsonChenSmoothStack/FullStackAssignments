package com.ss.basics.five;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[]argv){
        List<String> ans = new ArrayList<String>();

        List<String> strArr = new ArrayList<String>();
        strArr.add("Hello");
        strArr.add("World");
        strArr.add("My");
        strArr.add("Name");
        strArr.add("Is");
        strArr.add("Vinson");
        strArr.add("Electrocuted");
        strArr.add("We");
        strArr.add("Will");
        strArr.add("Sort");
        strArr.add("This");
        strArr.add("List");
        strArr.add("Elephant");


        //#1 - Sort by length 
        System.out.printf("Sorting by length: \n");
        Consumer<String> sortByLength = (str) -> {
            for (int i = 0; i < ans.size(); i++){
                if (ans.get(i).length() > str.length()){
                    ans.add(i, str);
                    return;
                }
            }
            ans.add(str);
        };
        strArr.forEach(sortByLength);
        System.out.println(ans.toString());
        ans.clear();

        //#2 - sort by length reverse
        System.out.printf("Sorting by length (reversed): \n");
        Consumer<String> sortByLengthReverse = (str) -> {
            for (int i = 0; i < ans.size(); i++){
                if (ans.get(i).length() < str.length()){
                    ans.add(i, str);
                    return;
                }
            }
            ans.add(str);
        };
        strArr.forEach(sortByLengthReverse);
        System.out.println(ans.toString());
        ans.clear();

        System.out.printf("Sorting by Alphabetical (first char only): \n");
        Consumer<String> sortByAlphabetical = (str) -> {
            for (int i = 0; i < ans.size(); i++){
                if (ans.get(i).charAt(0) < str.charAt(0)){
                    ans.add(i, str);
                    return;
                }
            }
            ans.add(str);
        };
        strArr.forEach(sortByAlphabetical);
        System.out.println(ans.toString());
        ans.clear();

        System.out.printf("Sorting by containing 'e' on first character: \n");
        Consumer<String> sortByContainE = (str) -> {
            if(str.charAt(0) == 'e' || str.charAt(0) == 'E'){
                ans.add(0,str);
                return;
            }
            ans.add(str);
        };
        strArr.forEach(sortByContainE);
        System.out.println(ans.toString());
        ans.clear();
    }
}
