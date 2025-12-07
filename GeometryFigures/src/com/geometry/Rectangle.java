package com.geometry;

public class Rectangle extends Figure {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("There is no figure with such parameters");
        }
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Width must be positive");
        }
        this.width = width;
    }
    public void setHeight(double height) {
        if (height <= 0) {
            throw new RuntimeException("Height must be positive");
        }
        this.height = height;
    }
}