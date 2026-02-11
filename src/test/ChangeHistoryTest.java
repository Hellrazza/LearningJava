import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangeHistoryTest {

    @Test

    public void MaxValue5() {
        ChangeHistory ch = new ChangeHistory();
        for (double x = 0.0; x <= 5.0; x++) {
            ch.add(x);
        }

        assertEquals(5.0, ch.maxValue(),0.001);
    }

    @Test
    public void MinValue1() {
        ChangeHistory ch = new ChangeHistory();
        for (double x = 1.0; x <= 5.0; x++) {
            ch.add(x);
        }

        assertEquals(1.0,ch.minValue(),0.001);
    }

    @Test
    public void Average30() {
        ChangeHistory ch = new ChangeHistory();
        for (double x = 10.0; x <=50.0; x+=10.0) {
            ch.add(x);
        }

        assertEquals(30.0, ch.average(), 0.001);
    }
}
