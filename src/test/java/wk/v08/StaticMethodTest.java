package wk.v08;

import org.junit.Assert;
import org.junit.Test;

public class StaticMethodTest {
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
