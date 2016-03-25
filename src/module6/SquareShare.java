package module6;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by Zenovii on 24.03.2016.
 */
public class SquareShare {
    public double areaTriangle(double lengthA, double lengthB){
        return  (lengthA * lengthB) /  2;
    }
    public double areaRectangle(double lengthA,double lengthB){
        return  lengthA * lengthB;
    }
    public double areaCircle(double radiusRange){
        return Math.PI*radiusRange;
    }

    public static void main(String[] args) {
        // Area of a right triangle
        SquareShare squareShare = new SquareShare();

        Scanner scanner= new Scanner(System.in);
        {
        System.out.print("Enter Side A ");
            double lengthA = scanner.nextDouble();

        System.out.print("Enter Side B ");
            double lengthB = scanner.nextDouble();


        double areaTriangle=squareShare.areaTriangle(lengthA,lengthB);
        System.out.println("Area of a right triangle " + areaTriangle);
        }

        // Area of a rectangle
        {
            System.out.print("Enter Side A ");
            double lengthA = scanner.nextDouble();
            System.out.print("Enter Side B ");
            double lengthB = scanner.nextDouble();
            double areaRectangle = squareShare.areaRectangle(lengthA, lengthB);
            System.out.println("Area of a rectangle = " + areaRectangle);
        }

        // Area of a circle
        {
        System.out.print("Enter radius circle");
        double radiusRange = scanner.nextDouble();
        double areaCircle = squareShare.areaCircle(radiusRange);
        System.out.println("Area of a circle =" + areaCircle);

        }
    }
}
