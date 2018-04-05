package wk.v8;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

public class OptionalTest {

    @Test
    public void emptyTest() {
        Optional<String> empty = Optional.empty();
        Assert.assertEquals(false, empty.isPresent());
    }

    @Test
    public void presentTest() {
        Optional<String> s = Optional.of("Hello");
        Assert.assertEquals(true, s.isPresent());
        Assert.assertEquals("Hello", s.get());
    }

    @Test
    public void orElseTest() {
        Optional<String> data = Optional.empty();
        String value = data.orElseGet(() -> "Hello");
        Assert.assertEquals("Hello", value);
    }
}