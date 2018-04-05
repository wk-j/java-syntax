package wk.v8;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class ForEachTest {

    @Test
    public void forTest() {
        Collection<String> data = Arrays.asList("A", "B", "C");
        data.forEach(x -> {
            System.out.println(x);
        });
    }
}