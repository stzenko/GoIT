package test.Proekt;

import main.Proekt.Factorial;
import main.Proekt.IllegalNumberException;
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
    public void factorialTestPositiveTest() throws Exception {
        final int a = 5;
        final double result = factorial.getFactorial(a);
        Assert.assertEquals(120,result,0);
    }

    @Test(expected = NegativeIntegerException.class)
    public void NegativeNumberTest() throws Exception {
        final int a = -1;
        factorial.checkInteger(a);
    }
    @Test(expected = LimitException.class)
    public void LimitNumberTest() throws Exception {
        final int a = 175;
        factorial.checkInteger(a);
    }
  //  @Test(expected = IllegalNumberException.class)
  //  public void IllegalNumberTest() throws Exception {
    //    factorial.connectUser();
   // }
}