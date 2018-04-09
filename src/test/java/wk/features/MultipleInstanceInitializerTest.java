package wk.features;

import org.junit.Test;

public class MultipleInstanceInitializerTest {

    @Test
    public void miiTest() {
        new App("wk");
    }
}

class App {
    public App(String name) {
        System.out.println(name + "'s constructor called'");
    }

    static {
        System.out.println("static initializer call");
    }

    {
        System.out.println("instance intializer call");
    }

    static {
        System.out.println("static initializer2 call");
    }

    {
        System.out.println("instance initializer2 call");
    }
}