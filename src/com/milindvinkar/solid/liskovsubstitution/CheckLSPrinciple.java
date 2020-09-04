package com.milindvinkar.solid.liskovsubstitution;

import com.milindvinkar.solid.liskovsubstitution.shape.Shape;

public class CheckLSPrinciple {
    public static void main(String[] args) {
        validateLSPFailsWhenInheritanceUsed();

        validateLSPPassesWhenInheritanceRemoved();

    }

    private static void validateLSPPassesWhenInheritanceRemoved() {
        Shape rectangle = new com.milindvinkar.solid.liskovsubstitution.shape.Rectangle(20, 30);
        Shape square = new com.milindvinkar.solid.liskovsubstitution.shape.Square(20);

        if (rectangle.getArea() == 20 * 30) {
            System.out.println("Area of rectangle " + rectangle.getArea());
        }

        if (square.getArea() == 20 * 20) {
            System.out.println("Area of square " + square.getArea());
        }

        // here we dont need to verify LSP as there is no inheritance.

    }

    private static void validateLSPFailsWhenInheritanceUsed() {
        Rectangle rectangle = new Rectangle(20, 30);
        rectangle.setHeight(20);
        rectangle.setHeight(30);
        System.out.println("Area: " + 20 * 30);

        Rectangle square = new Square(20);
        square.setHeight(20);
        square.setHeight(30);
        if (square.getArea() == 20 * 30) {
            System.out.println("Substitution succeeded !");
        } else {
            System.out.println("Substitution failed !");
        }
    }
}
