package main.module4.dz4_2;

/**
 * Created by Zenovii on 10.03.2016.
 */

import java.util.Scanner;

public class TemperatureTransmitter {

    final static double FAXTOR_FIRST = 1.8, FAXTOR_SECOND = 5d/9d, FACTOR_THIRT=32d;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double temperatureCelcius;
        System.out.print("Enter the temperature in Celsius ");
        if(scanner.hasNextDouble()) {
            temperatureCelcius = scanner.nextDouble(); //reads the number of
        double temperatureFarengeyt = temperatureFarengeyt(temperatureCelcius);
            System.out.println("temperature in Fahrenheit = " + temperatureFarengeyt );
        } else {
            System.out.println("You have not entered a number");
        }
        double temperatureFarengeyt;
        System.out.print("Enter the temperature in Fahrenheit ");
        if(scanner.hasNextDouble()) {
            temperatureFarengeyt = scanner.nextDouble();
            temperatureCelcius=  temperatureCelcius(temperatureFarengeyt);
            System.out.println("the temperature in Celsius = " + temperatureCelcius );
        } else {
            System.out.println("You have not entered a number");
        }
    }

    public static double temperatureCelcius(final  double temperatureFarengeyt){
        return FAXTOR_SECOND*(temperatureFarengeyt-FACTOR_THIRT);
    }
    public static double temperatureFarengeyt(final  double temperatureCelcius){
        return FACTOR_THIRT+temperatureCelcius*FAXTOR_FIRST;
    }
}