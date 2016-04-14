package main.Proekt;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 170");
        String a= in.next();

            start(a);
        }

    public static void start(String a) {

        try {
            connectUser(a);
            double result = getFactorial(a);

            System.out.println("Factorial of " +  a + " = " + result);
        }
        catch (NumberFormatException ine) {
                System.out.println("[Error]: Entered data isn't integer.");
        } catch (NegativeIntegerException nie) {
            System.out.println("[Error]: Entered number is " + nie.getValue() + ". Number should " +
                    "be" + " >= 1 .");
        } catch (LimitException ex) {
            System.out.println("[Error]: Entered number is " + ex.getValue() + ". Number should " +
                    "be" + " <= 170 .");
        }
    }

    public static String connectUser(String a2) throws NumberFormatException,  NegativeIntegerException, LimitException {

        Integer i2 = Integer.valueOf(String.valueOf(a2));
        if (i2 < 1) {
            throw new NegativeIntegerException(i2);
        }
        if (i2 > 170) {
            throw new LimitException(i2);
        }
        return a2;
    }

    public static Double getFactorial(String number) {
        double result = 1;
        Integer in = Integer.valueOf(number);
        for (int i = 1; i <= in; i++) {
            result *= i;
        }
        return result;
    }

}