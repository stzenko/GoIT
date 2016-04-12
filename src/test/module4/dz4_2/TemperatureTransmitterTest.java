package test.module4.dz4_2;

import main.module4.dz4_2.TemperatureTransmitter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 12.04.2016.
 */
public class TemperatureTransmitterTest {

    private static TemperatureTransmitter temperatureTransmitter;
    @BeforeClass
    public static void setUpClass()throws Exception
    {
       temperatureTransmitter = new TemperatureTransmitter();
    }

    @Test
    public void temperatureCelciusTest() throws Exception {
        double a = 10;
        final double result = temperatureTransmitter.temperatureFarengeyt(a);
        System.out.println(result);
        Assert.assertEquals(50,result,0);

    }


    @Test
    public void temperatureFarengeytTest() throws Exception {
        double a = 10;
        final double result = temperatureTransmitter.temperatureCelcius(a);
        System.out.println(result);
        Assert.assertEquals(-12,result,0.5);
    }

}