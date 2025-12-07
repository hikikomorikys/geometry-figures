package com.geometry;

public class Main {
    public static void main(String[] args) {
        System.out.println("Тестирование геометрических фигур\n");
        try {
            System.out.println("1. Прямоугольник 5x10:");
            Rectangle rectangle = new Rectangle(5, 10);
            rectangle.printInfo();

            System.out.println("\n2. Круг с радиусом 7:");
            Circle circle = new Circle(7);
            circle.printInfo();

            System.out.println("\n3. Треугольник со сторонами 3, 4, 5):");
            Triangle triangle = new Triangle(3, 4, 5);
            triangle.printInfo();

            System.out.println("\n4. Попытка создать треугольник со сторонами 1, 2, 5:");
            Triangle invalidTriangle = new Triangle(1, 2, 5);
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // Тест с дополнительной обработкой
        System.out.println("\nДополнительные тесты");
        Figure[] figures = new Figure[3];
        try {
            figures[0] = new Rectangle(3, 4);
            figures[1] = new Circle(5);
            figures[2] = new Triangle(6, 8, 10);
            double totalArea = 0;
            double totalPerimeter = 0;
            for (int i = 0; i < figures.length; i++) {
                System.out.println("\nФигура " + (i + 1) + ":");
                figures[i].printInfo();
                totalArea += figures[i].calculateArea();
                totalPerimeter += figures[i].calculatePerimeter();
            }
            System.out.println("\nСуммарная площадь: " + totalArea);
            System.out.println("Суммарный периметр: " + totalPerimeter);
        } catch (RuntimeException e) {
            System.out.println("Ошибка при создании фигур: " + e.getMessage());
        }
    }
}