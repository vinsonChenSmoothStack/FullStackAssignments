package com.ss.basics.two;

public class Rectangle implements Shape {
    private int x;
    private int y;
    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Integer calculateArea(){
        return x * y;
    }
    public void display(){
        System.out.printf("I am a Rectangle and my size is: %d\n", calculateArea());
    }
}
