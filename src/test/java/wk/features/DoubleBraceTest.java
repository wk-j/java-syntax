package wk.features;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class DoubleBraceTest {
    @Test
    public void doubleBraceTest() {
        Set<String> codes = new HashSet<String>() {
            private static final long serialVersionUID = 1L;

            {
                add("A");
                add("B");
                add("C");
            }
        };
        Assert.assertTrue(codes.size() == 3);
    }
}