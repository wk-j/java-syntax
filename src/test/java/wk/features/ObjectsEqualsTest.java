package wk.features;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

public class ObjectsEqualsTest {
    @Test
    public void equalsTest() {
        List<Integer> a1 = Arrays.asList(1, 2, 3);
        List<Integer> a2 = Arrays.asList(1, 2, 3);
        boolean equal = Objects.equals(a1, a2);
        Assert.assertTrue(equal);
    }

    @Test
    public void listEqualsTest() {
        List<Integer> a1 = Arrays.asList(1, 2, 3);
        List<Integer> a2 = Arrays.asList(1, 2, 3);
        boolean equal = a1.equals(a2);
        Assert.assertTrue(equal);
    }
}