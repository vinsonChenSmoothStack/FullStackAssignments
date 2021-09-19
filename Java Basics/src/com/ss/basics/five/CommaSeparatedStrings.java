package com.ss.basics.five;


public class CommaSeparatedStrings {
    public static void main(String[] args){
        int[] items = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        StringBuilder s = new StringBuilder();
        s.append('(');

        for (int i = 0; i < items.length; i++){
            s.append(items[i] % 2 == 0 ? 'e' : 'o');
            s.append(Integer.toString(items[i]));
            if(i != items.length - 1){
                s.append(", ");
            }
        }
        s.append(')');
        System.out.printf("Comma Separated strings: %s\n",s.toString());
    }
}
