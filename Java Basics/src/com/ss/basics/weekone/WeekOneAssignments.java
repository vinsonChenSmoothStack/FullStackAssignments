package com.ss.basics.weekone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WeekOneAssignments {

    public static void main (String[] argv){
        Functional isOdd = (value) -> {return value%2==1;};
        
        Functional isPrime = (value) -> {
            for(int i = 0; i < value; i++){
                if (value % i == 0){
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        };

        Functional isPalindrome = (value) ->{
            int i = value;
            List<Integer> listInt = new ArrayList<Integer>();
            while (i != 0){
                listInt.add(0, i%10);
                i = i / 10;
            }
            int start = 0;
            int last = listInt.size() - 1;
            while(start < last){
                if (listInt.get(start) != listInt.get(last)) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        };
    }
    
    public List<Integer> rightDigit(List<Integer> listInt){
        List<Integer> ret = new ArrayList<Integer>();
        for(Integer i : listInt){
            ret.add(i%10);
        }
        return ret;
    }

    public List<Integer> doubling(List<Integer> toDouble){
        List<Integer> ret = new ArrayList<Integer>();
        for(Integer i : toDouble){
            ret.add(i*2);
        }
        return ret;
    }

    public List<String> noX(List<String> toNoX){
        StringBuilder sb = new StringBuilder();
        List<String> ret = new ArrayList<String>();
        for(String str: toNoX){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != 'x' && str.charAt(i) != 'X'){
                    sb.append(str.charAt(i));
                }
            }
            ret.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return ret;
    }

    public Boolean groupSumClump(int value, List<Integer> pool, int target){
        groupSumClumpFixer(pool);
        groupSumClumpHelper(value, pool, target);
        return Boolean.FALSE;
    }

    private void groupSumClumpFixer(List<Integer> pool){
        int total = 0;
        int i = 0;
        while(i < pool.size()){
            total = pool.get(i);
            while (pool.get(i) == pool.get(i + 1)){
                total = total + pool.get(i + 1);
                pool.remove(i + 1);
            }
            pool.remove(i);
            pool.add(i, total);
        }
    }
    private Boolean groupSumClumpHelper(int value, List<Integer> pool, int target){
        if (pool.size() == 0){
            return Boolean.FALSE;
        }
        for(int i = 0; i < pool.size(); i++){
            List<Integer> l = new ArrayList<Integer>(pool);
            value = value + l.get(i);
            if (value == target){
                return Boolean.TRUE;
            }
            else if (value > target){
                return Boolean.FALSE;
            }
            if(groupSumClumpHelper(value, l, target)){
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
