package Dz4_2;

/**
 * Created by Zenovii on 10.03.2016.
 */

import java.util.Scanner;

public class TemperatureTransmitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatureCelcius;
        System.out.print("Enter the temperature in Celsius ");
        if(scanner.hasNextDouble()) {
            temperatureCelcius = scanner.nextDouble(); //reads the number of
        double temperatureFarengeyt = 32.0+temperatureCelcius*1.8;
            System.out.println("temperature in Fahrenheit = " + temperatureFarengeyt );
        } else {
            System.out.println("You have not entered a number");
        }

        double temperatureFarengeyt;
        System.out.print("Enter the temperature in Fahrenheit ");
        if(scanner.hasNextDouble()) {
            temperatureFarengeyt = scanner.nextDouble();
            temperatureCelcius = 5.0/9.0*(temperatureFarengeyt-32.0);
            System.out.println("the temperature in Celsius = " + temperatureCelcius );
        } else {
            System.out.println("You have not entered a number");
        }
    }
}