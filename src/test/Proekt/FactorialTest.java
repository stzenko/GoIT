package test.Proekt;

import main.Proekt.Factorial;

import main.Proekt.LimitException;
import main.Proekt.NegativeIntegerException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Zenovii on 13.04.2016.
 */
public class FactorialTest {

    private static Factorial factorial;

    @BeforeClass
    public static void setUp() throws Exception {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialPositive() throws Exception {
        final String a = "5";
        final  double result = factorial.getFactorial(a);
        int res = Integer.valueOf((int) result);
       Assert.assertEquals(120,res);
    }

    @Test(expected = LimitException.class)
    public void testMaxLimitNumber() throws Exception {
        final String a="175";
        factorial.connectUser(a);
    }

    @Test(expected = NegativeIntegerException.class)
    public void testNegativeNumber() throws Exception {
        final String a = "-1";
        factorial.connectUser(a);
    }

    @Test(expected = NumberFormatException.class)
    public void testStringNumberFormat() throws Exception {
       final String a="s";
        factorial.connectUser(a);
    }

    @Test(expected = NumberFormatException.class)
    public void testDoubleNumberFormat() throws Exception {
        final String a="5.5";
        factorial.connectUser(a);
    }

}