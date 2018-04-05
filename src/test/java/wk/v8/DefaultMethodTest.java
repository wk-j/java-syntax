package wk.v8;

import org.junit.Assert;
import org.junit.Test;

public class DefaultMethodTest {

    @Test
    public void defaultTest() {
        String value = A.hello();
        Assert.assertEquals("Hello", value);
    }

}

interface A {
    public static String hello() {
        return "Hello";
    }
}