package main.module4.dz4_1;

/**
 * Created by Zenovii on 10.03.2016.
 */

import java.util.Scanner;

public class SquareShape {

    public static final int INT_CONST_TRIANGLE = 2;

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        double lengthA, lengthB, areaTriangle, areaRectangle, radiusRange, areaCircle;
        // Area of a right triangle
        System.out.print("Side A ");
        if (scaner.hasNextDouble()) {
            lengthA = scaner.nextDouble();
            if (lengthA==0){
                return;}
            {
                System.out.print("Side B ");}

            lengthB = scaner.nextDouble();
            if (lengthB==0){
                return ;
            }
            areaTriangle = triangleArea(lengthA,lengthB);

            System.out.println("Area of a right triangle = " + areaTriangle);

        }

        else {
            System.out.println("You have not entered a number");
            return;
        }

        // Area of a rectangle
        System.out.print("Side AB ");
        if (scaner.hasNextDouble()) {
            lengthA = scaner.nextDouble();
            if (lengthA==0){
                return ;}
            System.out.print("Side BC ");
            lengthB = scaner.nextDouble();
            if (lengthB==0){
                return ;}
           areaRectangle = rectangleArea(lengthA,lengthB);
            System.out.println("Area of a rectangle = " + areaRectangle);
            if (lengthB==0){
                return ;}
        }
        else {
            System.out.println("You have not entered a number");
            return;
        }

        // Area of a circle
        System.out.print("Enter radius circle ");
        if (scaner.hasNextDouble()) {
            radiusRange = scaner.nextDouble();
            if (radiusRange<=0){
                System.out.println("You have not entered a number > 0");
                return ;}
            areaCircle = circleArea(radiusRange);
            System.out.println("Area of a circle = " + areaCircle);
        }
        else {
            System.out.println("You have not entered a number");
            return;
        }
    }
    public static double triangleArea(final double lengthA, final double lengthB){
        return (lengthA * lengthB) / 2;
    }
    public static double rectangleArea(final double lengthA, final double lengthB){
        return lengthA * lengthB;
    }
    public static double circleArea(final double radiusRange){
        return Math.PI*Math.pow(radiusRange, INT_CONST_TRIANGLE)  ;
    }
}