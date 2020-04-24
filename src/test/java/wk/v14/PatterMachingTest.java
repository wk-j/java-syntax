package wk.v14;

import org.junit.Test;

public class PatterMachingTest {

    @Test
    public void aInstanceOf() {
        var a = "Hello, world!";
        if (a instanceof String str) {
            if (str.contains("Hello")) {

            }
        }

        if (a instanceof String str && str.contains("Hello")) {

        }
    }
}