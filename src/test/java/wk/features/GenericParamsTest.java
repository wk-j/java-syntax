package wk.features;

import java.util.Collection;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class GenericParamsTest {
    @Test
    public void paramsTest() {
        Collection<String> str = Collections.<String>emptyList();
        Assert.assertEquals(0, str.size());
    }
}