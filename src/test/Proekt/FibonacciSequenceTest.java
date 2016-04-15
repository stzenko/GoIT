package test.Proekt;

import main.Proekt.FibonacciSequence;
import main.Proekt.LimitException;
import main.Proekt.NegativeIntegerException;
import main.module8.MusicInstrument;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 15.04.2016.
 */
public class FibonacciSequenceTest {

    private static FibonacciSequence fibonacciSequence;

    @BeforeClass
    public static void setUp() {
    fibonacciSequence= new FibonacciSequence();
    }

    @Test
    public void testStart() throws Exception {
    }

    @Test(expected = NumberFormatException.class)
    public void testStringNumberFormat() throws Exception {
        final String a="s";
        fibonacciSequence.checkInteger(a);
    }

    @Test(expected = NumberFormatException.class)
    public void testDoubleNumberFormat() throws Exception {
        final String a="5.5";
        fibonacciSequence.checkInteger(a);
    }

       @Test(expected = NegativeIntegerException.class)
    public void testMaxLimitNumber() throws Exception {
        final String a="-5";
        fibonacciSequence.checkInteger(a);
    }

    @Test
    public void testGetFibSeq()  {
        String number = "5";
        final List<Integer> result  = fibonacciSequence.getFibSeq(number);

        List<Integer> s = new ArrayList<>();

        s.add(1);
        s.add(1);
        s.add(2);
        s.add(3);

        Assert.assertEquals(s,result);
    }
}