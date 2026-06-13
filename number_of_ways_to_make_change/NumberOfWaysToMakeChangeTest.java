import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfWaysToMakeChangeTest {

    NumberOfWaysToMakeChange impl = new NumberOfWaysToMakeChange();

    static Stream<Arguments> inputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(0, new int[]{1, 5, 10}, 1),
                Arguments.of(6, new int[]{1, 5}, 2),
                Arguments.of(7, new int[]{2, 3, 4, 7}, 3),
                Arguments.of(10, new int[]{1, 5, 10, 25}, 4),
                Arguments.of(25, new int[]{1, 5, 10, 25}, 13),
                Arguments.of(9, new int[]{5, 10}, 0),
                Arguments.of(3, new int[]{}, 0),
                Arguments.of(12, new int[]{2, 4}, 4),
                Arguments.of(12, new int[]{4, 2}, 4));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testNumberOfWaysToMakeChange(int n, int[] denoms, int expected) {
        assertEquals(expected, impl.numberOfWaysToMakeChange(n, denoms));
    }

}
