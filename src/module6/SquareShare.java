package module6;

import java.util.Scanner;

/**
 * Created by Zenovii on 24.03.2016.
 */
public class SquareShare {
    //public double areaTriangle(double lengthA, double lengthB){
      //  return  (lengthA * lengthB) /  2;
   // }
    public double areaRectangle(double lengthA,double lengthB){
        return  lengthA * lengthB;
    }
    public double areaCircle(double radiusRange){
        return Math.PI*radiusRange;
    }

    public static void main(String[] args) {
        // Area of a right triangle
        SquareShare squareShare = new SquareShare();

        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Enter Side A = ");
            String lengthA = scanner.next();

             try {
                 double siteA = Double.parseDouble(lengthA);

                 if (siteA <= 0) {
                     try {
                         throw new InputErrorExeption(siteA);
                     } catch (InputErrorExeption inputErrorExeption) {
                         System.out.println("Enter to Number > 0 ");
                     }


                 }
                 String lengthB = scanner.next();
                 double siteB = Double.parseDouble(lengthB);
                 double areaTriangle = (siteA * siteB) /  2;
                 System.out.println("Area of a right triangle " + areaTriangle);

             }
             catch (NumberFormatException ex){
                 System.out.println("Error, enter to Number");
             }

        }

    }


}
        /* Area of a rectangle
        {
            System.out.print("Enter Side A ");
            String lengthA = scanner.next();
            System.out.print("Enter Side B ");
            String lengthB = scanner.next();
            double areaRectangle = squareShare.areaRectangle(lengthA, lengthB);
            System.out.println("Area of a rectangle = " + areaRectangle);
        }

        // Area of a circle
        {
        System.out.print("Enter radius circle");
            String radiusRange = scanner.next();
            double areaCircle = squareShare.areaCircle(radiusRange);
        System.out.println("Area of a circle =" + areaCircle);

        }
    }
}
*/