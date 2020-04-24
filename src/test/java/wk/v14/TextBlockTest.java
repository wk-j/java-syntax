package wk.v14;

import org.junit.Test;

public class TextBlockTest {
    @Test
    public void multipleTest() {
        var html = """
                <html>
                </html>
                """;
        System.out.println(html);
    }

    @Test
    public void singleTest() {
        var html = """
                <html>  \
                </html>
                """;
        System.out.println(html);
    }

    @Test
    public void spaceTest() {
        var html = """
                \saaa
                \sbbb
                \sccc
                ---
                """;
        System.out.println(html);
    }

}