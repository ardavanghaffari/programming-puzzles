import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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
