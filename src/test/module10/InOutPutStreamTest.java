package test.module10;

import main.module10.InOutPutStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 12.04.2016.
 */
public class InOutPutStreamTest {
    public static String fileName = "src\\test\\module10\\test.txt";
    private static InOutPutStream inOutPutStream;
    @BeforeClass

    public static void setUpClass() throws Exception {
        inOutPutStream = new InOutPutStream();
    }

    @Test
    public void readFromFile() throws Exception {
        String load = "Load to file\n";
        final String loading = inOutPutStream.readFromFile(fileName);
        Assert.assertEquals(load,loading);

            }

}