package com.ss.basics.five;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeLetterStartWithA {
    public List<String> threeLetterLowerCaseA(List<String> strArr){
        return strArr.stream()
                        .filter((item) -> {return item.length() == 3 && item.charAt(0) == 'a';})
                        .collect(Collectors.toList());
        //returnValue.forEach((item) -> System.out.printf("%s\n", item));
    }
    public static void main(String[] args){

        List<String> strArr = new ArrayList<String>();
        strArr.add("hello");
        strArr.add("world");
        strArr.add("astronaut");
        strArr.add("my");
        strArr.add("Name");
        strArr.add("Is");
        strArr.add("abc");
        strArr.add("abcd");
        strArr.add("vinson");
        strArr.add("Electrocuted");
        strArr.add("Abcd");
        strArr.add("we");
        strArr.add("Will");
        strArr.add("sort");
        strArr.add("This");
        strArr.add("List");
        strArr.add("Add");
        strArr.add("Elephant");
        strArr.add("app");

        List<String> returnValue = strArr.stream()
                                    .filter((item) -> {return item.length() == 3 && item.charAt(0) == 'a';})
                                    .collect(Collectors.toList());
        returnValue.forEach((item) -> System.out.printf("%s\n", item));
    }
}
