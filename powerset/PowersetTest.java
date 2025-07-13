import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PowersetTest {

    Powerset impl = new Powerset();

    static Stream<Arguments> inputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(
                        emptyList(),
                        Set.of(emptySet())),

                Arguments.of(
                        List.of(1),
                        Set.of(emptySet(), Set.of(1))),

                Arguments.of(
                        List.of(1, 2),
                        Set.of(emptySet(), Set.of(1), Set.of(2), Set.of(1, 2))),

                Arguments.of(
                        List.of(1, 2, 3),
                        Set.of(emptySet(), Set.of(1), Set.of(2), Set.of(3),
                                Set.of(1, 2), Set.of(1, 3), Set.of(2, 3),
                                Set.of(1, 2, 3))));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testRecursive(List<Integer> input, Set<Set<Integer>> expected) {
        assertEquals(expected, impl.recursive(input));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testIterative(List<Integer> input, Set<Set<Integer>> expected) {
        assertEquals(expected, impl.iterative(input));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testBitManipulation(List<Integer> input, Set<Set<Integer>> expected) {
        assertEquals(expected, impl.bitManipulation(input));
    }

}
