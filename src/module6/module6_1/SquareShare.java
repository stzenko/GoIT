package module6.module6_1;

import java.util.Scanner;

/**
 * Created by Zenovii on 24.03.2016.
 */
public class SquareShare {
    public double areaTriangle(double lengthA, double lengthB) {
        return (lengthA * lengthB) / 2;
    }


    public static void main(String[] args) {
        // Area of a right triangle
        SquareShare squareShare = new SquareShare();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Side A = ");
            String lengthA = scanner.next();
            double siteA = Double.parseDouble(lengthA);

            System.out.print("Enter Side B = ");
            String lengthB = scanner.next();
            double siteB = Double.parseDouble(lengthB);

            if (siteA <= 0||siteB<=0) {
                try {
                    throw new InputErrorExeption(siteA);
                } catch (InputErrorExeption inputErrorExeption) {
                    System.out.println("Enter a Number > 0 ");
                    return;
                }
            }
                                double areaTriangle = squareShare.areaTriangle(siteA, siteB);
                    System.out.println("Area of a rectangle = " + areaTriangle);
            }
        catch (NumberFormatException ex) {
            System.out.println("Error, enter a Number");
            System.exit(0);
            return;
        }
    }
}