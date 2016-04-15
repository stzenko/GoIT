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

    public static String connectUser(String a) throws NumberFormatException,  NegativeIntegerException, LimitException {

        Integer i = Integer.valueOf(a);
        if (i < 1) {
            throw new NegativeIntegerException(i);
        }
        if (i > 170) {
            throw new LimitException(i);
        }
        return a;
    }

    public static Double getFactorial(String a) {
        double result = 1;
        Integer in = Integer.valueOf(a);
        for (int i = 1; i <= in; i++) {
            result *= i;
        }
        return result;
    }
}
