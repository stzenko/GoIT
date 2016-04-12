package test.module5;

import main.module5.SearchForItems;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by Zenovii on 12.04.2016.
 */
public class SearchForItemsTest {

    private static SearchForItems searchForItems;
    @BeforeClass
    public static void setUp() throws Exception {
        searchForItems = new SearchForItems();

    }

    @Test
    public void minElementTest() throws Exception {

       int[] a = {2, -10, 50};
        final int min =  searchForItems.minElement(a);
        Assert.assertEquals(-10,min);
    }

    @Test
    public void maxElementTest() throws Exception {

        int[] b = {10, -5, 45, 125, 200, -200};
        final int max =  searchForItems.maxElement(b);
        System.out.println(max);
        Assert.assertEquals(200,max);
    }

    @Test
    public void arraySortMasivTest() throws Exception {
        int[] b = {10, -5, 45};
        final int[] sortMasiv =  searchForItems.arraySortMasiv(b);
        System.out.println(sortMasiv);

        Assert.assertEquals("-5, 10, 45",sortMasiv);
    }

}