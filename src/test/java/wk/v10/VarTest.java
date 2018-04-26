package wk.v10;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class VarTest {
    @Test
    public void varTest() {
        var a = 100;
        var b = 100;
        Assert.assertEquals(a, b);
    }

    @Test
    public void varList() {
        var list = Arrays.asList("a", "b", "c");
        Assert.assertTrue(Arrays.asList("a", "b", "c").equals(list));
    }
}
