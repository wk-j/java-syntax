package wk.features;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void search() {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int position = Arrays.binarySearch(a, 2);
        Assert.assertEquals(1, position);
    }

}