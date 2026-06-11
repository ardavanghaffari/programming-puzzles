import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthFibonacciTest {

    NthFibonacci impl = new NthFibonacci();

    static Stream<Arguments> inputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(2, 1),
                Arguments.of(3, 1),
                Arguments.of(4, 2),
                Arguments.of(5, 3),
                Arguments.of(6, 5),
                Arguments.of(7, 8),
                Arguments.of(10, 34),
                Arguments.of(12, 89));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testRecursive(int input, int expected) {
        assertEquals(expected, impl.recursive(input));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testMemoization(int input, int expected) {
        assertEquals(expected, impl.memoization(input));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testIterative(int input, int expected) {
        assertEquals(expected, impl.iterative(input));
    }

}
