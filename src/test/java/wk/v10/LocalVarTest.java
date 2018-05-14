package wk.v10;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LocalVarTest {

    @Test
    public void lambTest() {
        var list = new ArrayList<String>();
        Assert.assertEquals(Arrays.asList(), list);
    }
}