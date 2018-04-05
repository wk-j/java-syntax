package wk.v8;

import org.junit.Assert;
import org.junit.Test;

public class InterfaceTest {
    @Test
    public void staticMethod() {
        String a = Interface.producer();
        Assert.assertEquals(a, "N&F Vehicles");
    }
}

interface Interface {
    public static String producer() {
        return "N&F Vehicles";
    }
}
