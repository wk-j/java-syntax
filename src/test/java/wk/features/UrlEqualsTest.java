package wk.features;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

public class UrlEqualsTest {
    @Test
    public void urlTest() throws MalformedURLException {
        boolean equals = new URL("https://172.217.166.142").equals(new URL("https://google.com"));
        Assert.assertTrue(equals);
    }
}