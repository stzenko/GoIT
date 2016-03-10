package Module4.Dz4_2;

/**
 * Created by Zenovii on 10.03.2016.
 */

import java.util.Scanner;

public class TemperatureTransmitter {
    public static void main(String[] args) {
        final double FAXTOR_FIRST = 1.8, FAXTOR_SECOND = 5d/9d, FACTOR_THIRT=32d;
        Scanner scanner = new Scanner(System.in);
        double temperatureCelcius;
        System.out.print("Enter the temperature in Celsius ");
        if(scanner.hasNextDouble()) {
            temperatureCelcius = scanner.nextDouble(); //reads the number of
        double temperatureFarengeyt = FACTOR_THIRT+temperatureCelcius*FAXTOR_FIRST;
            System.out.println("temperature in Fahrenheit = " + temperatureFarengeyt );
        } else {
            System.out.println("You have not entered a number");
        }

        double temperatureFarengeyt;
        System.out.print("Enter the temperature in Fahrenheit ");
        if(scanner.hasNextDouble()) {
            temperatureFarengeyt = scanner.nextDouble();
            temperatureCelcius = FAXTOR_SECOND*(temperatureFarengeyt-FACTOR_THIRT);
            System.out.println("the temperature in Celsius = " + temperatureCelcius );
        } else {
            System.out.println("You have not entered a number");
        }
    }
}