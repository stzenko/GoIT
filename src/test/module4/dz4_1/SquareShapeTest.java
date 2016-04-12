package test.module4.dz4_1;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import main.module4.dz4_1.SquareShape;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 11.04.2016.
 */
public class SquareShapeTest {

    private static SquareShape squareShape;


    @BeforeClass
    public static void setUpClass() throws  Exception{
        squareShape = new SquareShape();
    }

    @Test
    public void triangleAreaTest() throws Exception {

        double a =5;
        double b= 2;

        final double result = squareShape.triangleArea(a,b);
        System.out.println(result);
        Assert.assertEquals(a*b/2, result,  0);
    }
    @Test
    public void rectangleArea() throws Exception {
        double a = 10;
        double b= 20;

        final double result = squareShape.rectangleArea(a,b);
        System.out.println(result);
        Assert.assertEquals(a*b, result,  0);
    }

    @Test
    public void circleArea() throws Exception {
        double r= 10;
        final double result = squareShape.circleArea(r);
        System.out.println(result);
        Assert.assertEquals(r*r* Math.PI, result,  0);
    }

    @Test
    public void circleAreaNegativ() throws Exception {
        double r =0;
        final double result = squareShape.circleArea(r);
        System.out.println(result);
        Assert.assertEquals(r*r* Math.PI, result,  0);
    }
}