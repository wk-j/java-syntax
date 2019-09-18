package wk.v05;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class DeepEqualsTest {
    @Test
    public void equalsTests() {
        Object[] a1 = new Object[] { 1, 2, 3 };
        Object[] a2 = new Object[] { 1, 2, 3 };
        boolean equal = Arrays.deepEquals(a1, a2);
        Assert.assertTrue(equal);
    }

    @Test
    public void stringEqualsTest() {
        Object[] a1 = new Object[] { "A", "B" };
        Object[] a2 = new Object[] { "A", "B" };
        boolean equal = Arrays.deepEquals(a1, a2);
        Assert.assertTrue(equal);
    }
}