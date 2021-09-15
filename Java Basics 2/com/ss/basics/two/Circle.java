package com.ss.basics.two;

import java.lang.Math;

public class Circle implements Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public Integer calculateArea(){
        Long i = Math.round(3.14 * radius * radius);
        return i.intValue();
    }
    public void display(){
        System.out.printf("I am a Circle and my size is: %d", calculateArea());
    }
}
