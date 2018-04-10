package wk.features;

import org.junit.Assert;
import org.junit.Test;

public class FinalPostpondTest {
    @Test
    public void finalTest() {
        int index = 0;
        final Object element;
        if (index == 1) {
            element = "A";
        } else {
            element = "B";
        }
        Assert.assertEquals("B", element);
    }
}