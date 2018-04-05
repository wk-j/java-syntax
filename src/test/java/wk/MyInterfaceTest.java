package wk;

import org.junit.Assert;
import org.junit.Test;

public class MyInterfaceTest {
    @Test
    public void staticMethod() {
        String a = MyInterface.producer();
        Assert.assertEquals(a, "N&F Vehicles");
    }
}

interface MyInterface {
    public static String producer() {
        return "N&F Vehicles";
    }
}
