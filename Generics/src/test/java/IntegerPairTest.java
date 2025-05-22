import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerPairTest {

    @Test
    void testSwapIntegers() {
        IntegerPair ip = new IntegerPair(2, 3);

        ip.swap();

        assertEquals(3, ip.getLeftThing());
        assertEquals(2, ip.getRightThing());

    }

}