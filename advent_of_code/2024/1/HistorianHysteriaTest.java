import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HistorianHysteriaTest {

    HistorianHysteria impl = new HistorianHysteria();

    @Test
    void testTotalDistance() {
        assertEquals(1830467, impl.totalDistance());
    }

    @Test
    void testSimilarityScore() {
        assertEquals(26674158, impl.similarityScore());
    }

}
