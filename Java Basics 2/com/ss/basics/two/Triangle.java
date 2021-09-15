package com.ss.basics.two;

public class Triangle {
    private int base;
    private int height;
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public Integer calculateArea(){
        return base*height/2;
    }
    public void display(){
        System.out.printf("I am a Triangle and my size is: %d", calculateArea());
    }
}
