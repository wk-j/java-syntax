package wk.v14;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SwitchExpressioinTest {
    @Test
    public void aTest() {
        var day = Day.MONDAY;

        switch (day) {
            case FRIDAY -> System.out.println("Friday");
            default -> System.out.println("?");
        }

    }

    @Test
    public void aReturn() {
        var day = Day.MONDAY;
        var str = switch (day) {
            case SUNDAY -> "Holliday";
            case MONDAY, FRIDAY -> "Work";
        };

        assertEquals("Work", str);
    }
}

enum Day {
    SUNDAY, MONDAY, FRIDAY
}