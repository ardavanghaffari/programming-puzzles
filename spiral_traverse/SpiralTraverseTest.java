import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralTraverseTest {

    SpiralTraverse impl = new SpiralTraverse();

    static Stream<Arguments> inputAndExpectedOutput() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1}},
                        List.of(1)),
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}},
                        List.of(1, 2, 3, 4)),
                Arguments.of(
                        new int[][]{{1}, {2}, {3}, {4}},
                        List.of(1, 2, 3, 4)),
                Arguments.of(
                        new int[][]{
                                {1, 2},
                                {4, 3}},
                        List.of(1, 2, 3, 4)),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3},
                                {8, 9, 4},
                                {7, 6, 5}},
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3, 4},
                                {10, 11, 12, 5},
                                {9, 8, 7, 6}},
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3},
                                {10, 11, 4},
                                {9, 12, 5},
                                {8, 7, 6}},
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)),
                Arguments.of(
                        new int[][]{
                                {1, 2, 3, 4},
                                {12, 13, 14, 5},
                                {11, 16, 15, 6},
                                {10, 9, 8, 7}},
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
    }

    @ParameterizedTest
    @MethodSource("inputAndExpectedOutput")
    void testSpiralTraverse(int[][] input, List<Integer> expected) {
        assertEquals(expected, impl.spiralTraverse(input));
    }

}
