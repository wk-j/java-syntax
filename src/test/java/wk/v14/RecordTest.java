package wk.v14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

record Point(int x, int y) {
}

public class RecordTest {
    @Test
    public void aTest() {
        var p = new Point(1, 2);

        assertEquals(1, p.x());
        assertEquals(2, p.y());
    }
}