import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TaskSchedulerTest {

    private final TaskScheduler impl = new TaskScheduler();

    private static Stream<Arguments> inputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(new char[] {}, 2, 0),
                Arguments.of(new char[] { 'A' }, 2, 1),
                Arguments.of(new char[] { 'A', 'A' }, 2, 4),
                Arguments.of(new char[] { 'A', 'A', 'A', 'A' }, 3, 13),
                Arguments.of(new char[] { 'A', 'A', 'A', 'B', 'B', 'B' }, 0, 6),
                Arguments.of(new char[] { 'A', 'A', 'A', 'B', 'B', 'B' }, 2, 8),
                Arguments.of(new char[] { 'A', 'B', 'C', 'D', 'E', 'F' }, 2, 6),
                Arguments.of(new char[] { 'B', 'C', 'D', 'A', 'A', 'A', 'A', 'G' }, 1, 8),
                Arguments.of(new char[] { 'B', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E' }, 2, 9));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testLeastInterval(char[] tasks, int n, int expected) {
        assertEquals(expected, impl.leastInterval(tasks, n));
    }

}