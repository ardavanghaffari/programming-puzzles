import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarraySumTest {

    MaximumSubarraySum impl = new MaximumSubarraySum();

    static Stream<Arguments> inputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{-1}, -1),
                Arguments.of(new int[]{-1, 1}, 1),
                Arguments.of(new int[]{-2, -1}, -1),
                Arguments.of(new int[]{-1, 2, 4, -3, 5, 2, -5, 2}, 10));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testBruteForce(int[] input, int expected) {
        assertEquals(expected, impl.bruteForce(input));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testKadane(int[] input, int expected) {
        assertEquals(expected, impl.kadane(input));
    }

}
