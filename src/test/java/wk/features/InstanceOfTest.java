package wk.features;

import org.junit.Assert;
import org.junit.Test;

public class InstanceOfTest {

    @Test
    public void instatnceOfTest() {
        MyApp app = null;
        boolean isApp = app instanceof MyApp;
        Assert.assertEquals(false, isApp);
    }
}

class MyApp {
}