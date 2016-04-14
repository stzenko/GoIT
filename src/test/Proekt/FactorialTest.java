package test.Proekt;

import main.Proekt.Factorial;
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
        final long result = factorial.getFactorial(a);
        Assert.assertEquals(120,result);
    }
    @Test
    public void factorialTestNegativeTest()  {

        final int a = -5;
        final long result = factorial.getFactorial(a);
        System.out.println(result);
        Assert.assertEquals(0,result);
    }

    @Test(expected = NegativeIntegerException.class)
    public void nonExistingFileTest() throws Exception {

    }

}