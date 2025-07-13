import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
