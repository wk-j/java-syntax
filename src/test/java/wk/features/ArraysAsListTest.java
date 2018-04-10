package wk.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ArraysAsListTest {
    @Test(expected = UnsupportedOperationException.class)
    public void fixSizeTest() {
        List<String> a = Arrays.asList("A", "B", "C");
        a.add("D");
    }

    @Test
    public void dynamicSizeTest() {
        List<String> a = new ArrayList<>(Arrays.asList("A", "B", "C"));
        a.add("D");
        Assert.assertEquals(4, a.size());
    }
}