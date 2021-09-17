package com.ss.basics.four;

public class Singleton {

    volatile private static Singleton instance = null;
    volatile private static Integer[] intBuf = null;
    volatile private static int pushLoc;
    volatile private static int pullLoc;

    private Singleton(){
        intBuf = new Integer[10];
        pushLoc = 0;
        pullLoc = 0;
    };

    public static Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton .class){
                instance = new Singleton();
            }
        }
        return instance;
    }

    public Boolean isFull(){
        return (pushLoc % 10 == (pullLoc + 1) % 10);
    }

    public Boolean isEmpty(){
        return (pushLoc % 10 == pullLoc % 10);
    }

    public Boolean push(int i){
        if (!isFull()){
            synchronized(Singleton .class){
                intBuf[pushLoc%10] = i;
                pushLoc++;
            }
            return true;
        }
        return false;
    }

    public Integer pull(){
        if (!isEmpty()){
            int returnLoc;
            synchronized(Singleton .class){
                returnLoc = intBuf[pullLoc%10];
                pullLoc++;
            }
            return returnLoc;
        }
        return null;
    }
}
