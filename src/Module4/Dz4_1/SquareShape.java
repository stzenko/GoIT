package Module4.Dz4_1;

/**
 * Created by Zenovii on 10.03.2016.
 */

import java.util.Scanner;

public class SquareShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthA, lengthB, areaTriangle, areaRectangle, radiusRange, pi = 3.14, areaCircle;
        // Area of a right triangle
        System.out.print("Storona A ");
        if (scanner.hasNextDouble()) {
            lengthA = scanner.nextDouble();
            System.out.print("Storona B ");
            lengthB = scanner.nextDouble();
            areaTriangle = (lengthA * lengthB) / 2;
            System.out.println("Area of a right triangle = " + areaTriangle);
        }
        else {
            System.out.println("You have not entered a number");
        }

        // Area of a rectangle
        System.out.print("Storona AB ");
        if (scanner.hasNextDouble()) {
            lengthA = scanner.nextDouble();
            System.out.print("Storona BC ");
            lengthB = scanner.nextDouble();
            areaRectangle = lengthA * lengthB;
            System.out.println("Area of a rectangle = " + areaRectangle);
        }
        else {
            System.out.println("You have not entered a number");
        }

        // Area of a circle
        System.out.print("Enter radius circle ");
        if (scanner.hasNextDouble()) {
            radiusRange = scanner.nextDouble();
            areaCircle = pi * Math.pow(radiusRange, 2);
            System.out.println("Area of a circle = " + areaCircle);
        }
        else {
            System.out.println("You have not entered a number");
        }
    }
}