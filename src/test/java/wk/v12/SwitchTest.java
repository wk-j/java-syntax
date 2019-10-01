package wk.v12;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwitchTest {
    private enum Day {
        Monday, Sunday
    }

    private int what(Day day) {
        var value = switch (day) {
        case Monday -> 1;
        case Sunday -> 10;
        };
        return value;
    }

    @Test
    public void whatIs() {
        var value = what(Day.Sunday);
        assertEquals(10, value);
    }
}