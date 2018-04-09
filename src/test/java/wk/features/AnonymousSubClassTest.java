package wk.features;

import org.junit.Assert;
import org.junit.Test;

public class AnonymousSubClassTest {
    @Test
    public void anoTest() {
        String rs = new Object() {
            String foo(String msg) {
                return msg + "555";
            }
        }.foo("Hello");

        Assert.assertEquals(rs, "Hello555");
    }
}