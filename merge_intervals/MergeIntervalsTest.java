import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertArrayEquals;

import java.util.stream.Stream;

class MergeIntervalsTest {

    MergeIntervals impl = new MergeIntervals();

    static Stream<Arguments> intervals() {
        return Stream.of(
            Arguments.of(new int[][] {{2, 6}},
                         new int[][] {{2, 6}}),

            Arguments.of(new int[][] {{2, 6}, {7, 9}},
                         new int[][] {{2, 6}, {7, 9}}),

            Arguments.of(new int[][] {{2, 6}, {5, 9}},
                         new int[][] {{2, 9}}),

            Arguments.of(new int[][] {{2, 6}, {15, 18}, {1, 3}, {6, 10}, {9, 11}}, 
                         new int[][] {{1, 11}, {15, 18}})
        );
    }

    @ParameterizedTest
    @MethodSource("intervals")
    void testMerege(int[][] input, int[][] expected) {
        assertArrayEquals(expected, impl.merge(input));
    }

}
