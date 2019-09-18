package wk.v13;

import org.junit.Test;

public class MultilineTest {

    @Test
    public void Go() {
        String a = """
                    <html>
                        <body>          </bodY>
                    <html>
                    """;

        System.out.println(a);

    }
}