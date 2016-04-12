package test.module4.dz4_3;

import main.module4.dz4_3.LengthOfTheLine;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 12.04.2016.
 */
public class LengthOfTheLineTest {
private static LengthOfTheLine lengthOfTheLine;
    @BeforeClass
    public static void setUpClass() throws  Exception{
         lengthOfTheLine = new LengthOfTheLine();
    }

    @Test
    public void lengthOfTheLineTest() throws Exception {
        double x1 = 1, x2=2, y1=3, y2=4;
        final double result = lengthOfTheLine.lengthOfTheLine(x1,x2,y1,y2);
        Assert.assertEquals(1.4,result,0.1);

    }

}