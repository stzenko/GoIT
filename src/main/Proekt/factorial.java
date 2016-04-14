package main.Proekt;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Factorial item = new Factorial();
        item.start();
    }

    public void start() {

        try {
            int enteredInteger = connectUser();
            long result = getFactorial(enteredInteger);
            System.out.println("Factorial of " + enteredInteger + " = " + result);
        } catch (IllegalNumberException ine) {
            System.out.println("[Error]: Entered data isn't integer.");
        } catch (NegativeIntegerException nie) {
            System.out.println("[Error]: Entered number is " + nie.getValue() + ". Number should " +
                    "be" + " > 0.");
        } catch (LimitException ex) {
            System.out.println("[Error]: Entered number is " + ex.getValue() + ". Number should " +
                    "be" + " <= 20 .");
        }
    }

    public int connectUser() throws IllegalNumberException, NegativeIntegerException, LimitException {
        int enteredInteger;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter positive integer <= 20");
            if (!in.hasNextInt()) {
                throw new IllegalNumberException();
            }
            enteredInteger = in.nextInt();
            checkInteger(enteredInteger);
        }
        return enteredInteger;
    }

    public int checkInteger(int enteredInteger) throws NegativeIntegerException, LimitException {
        if (enteredInteger < 1) {
            throw new NegativeIntegerException(enteredInteger);
        }
        if (enteredInteger > 20) {
            throw new LimitException(enteredInteger);
        }
        return enteredInteger;
    }

    public long getFactorial(int positiveInteger) {
        long result = 1;

        if(positiveInteger>=0) {

            for (int i = 1; i <= positiveInteger; i++) {
                result *= i;
            }
        }
        else {
            result = 0;
        }
            return result;
    }

}