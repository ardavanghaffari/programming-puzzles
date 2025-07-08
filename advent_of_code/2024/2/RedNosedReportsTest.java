import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RedNosedReportsTest {

    RedNosedReports impl = new RedNosedReports();

    @Test
    void testNumberOfSafeReports() {
        assertEquals(407, impl.numberOfSafeReports());
    }

    @Test
    void testNumberOfSafeReportsToleratingSingleBadLevel() {
        assertEquals(459, impl.numberOfSafeReportsToleratingSingleBadLevel());
    }

}
