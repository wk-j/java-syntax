package wk.v10;

import org.junit.Test;
import org.junit.Assert;

public class VarTest {
    @Test
    public void varTest() {
        var a = 100;
        var b = 100;
        Assert.assertEquals(a, b);
    }
}
