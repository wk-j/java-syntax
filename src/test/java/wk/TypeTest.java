package wk;

import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.*;

public class TypeTest {
    @Test
    public void getValueWithIntFromStringMap() {
        var map = new HashMap<String, Object>();
        map.put("a", "A");
        map.put("b", "B");
        var obj = map.get(5555);
        assertNull(obj);
    }
}