package com.geometry;

public abstract class Figure {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void printInfo() {
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}