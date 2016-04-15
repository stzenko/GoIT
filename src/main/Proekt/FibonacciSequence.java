package main.Proekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        String a= in.next();
        start(a);
    }

    public static void start(String a)  {

        try {
        checkInteger(a);
            List<Integer> result = getFibSeq(a);
            System.out.println("Fibonacci sequence < " + a + " = " + result);
        } catch (NumberFormatException nfe) {
            System.out.println("[Error]: Entered data isn't integer.");
        } catch (NegativeIntegerException nie) {
            System.out.println("[Error]: Entered number is " + nie.getValue() + ". Number should " +
                    "be" + " >= 1. ");
        }
    }

    public static String checkInteger(String a) throws NegativeIntegerException, NumberFormatException{
        Integer i = Integer.valueOf(a);
        if (i < 1) {
            throw new NegativeIntegerException(i);
        }
        return a;
    }

    public static List<Integer> getFibSeq(String limit) {
        Integer in = Integer.valueOf(limit);
        List<Integer> sequence = new ArrayList<>();

        sequence.add(1);
        sequence.add(1);

        for (int i = 2; sequence.get(i - 1) + sequence.get(i - 2) < in; i++) {
            sequence.add(i, sequence.get(i - 1) + sequence.get(i - 2));
        }
        return sequence;
    }
}


