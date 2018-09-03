package wk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SplitTest {
    @Test
    public void splitTest() {
        String a = "aa|b|c";

        String[] s = a.split("\\|");
        assertEquals(3, s.length);

        assertEquals("aa", s[0]);
        assertEquals("b", s[1]);
        assertEquals("c", s[2]);
    }
}