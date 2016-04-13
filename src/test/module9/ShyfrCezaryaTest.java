package test.module9;

import main.module9.ShyfrCezarya;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 12.04.2016.
 */
public class ShyfrCezaryaTest {

    private static ShyfrCezarya shyfrCezarya;

    @BeforeClass
    public static void setUp() throws Exception {
        shyfrCezarya = new ShyfrCezarya();
    }

    @Test
    public void toCodeStringTest() throws Exception {
        String text = "Love is";
        final String shyfr = shyfrCezarya.toCodeString(text);
        System.out.println(shyfr);
        Assert.assertEquals("Nqxg ku",shyfr);
    }

    @Test
    public void toDeCodeStringTest() throws Exception {
        String text = "Love is";
        final String code = shyfrCezarya.toCodeString(text);
        String decode = ShyfrCezarya.toCodeString(ShyfrCezarya.toDeCodeString(text));
        Assert.assertEquals("Love is",decode);

    }

}