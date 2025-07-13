import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    private int[] input;
    private int[] expected;

    // Some of the implementations under test, change the input in-place.
    // Hence initialization in the before hook.
    @BeforeEach
    void setup() {
        input    = new int[] {8, 5, 2, 9, 5, 6, 3};
        expected = new int[] {2, 3, 5, 5, 6, 8, 9};
    }

    @Test
    void testFirstIteration() {
        var impl = new MergeSort.FirstIteration();
        assertArrayEquals(expected, impl.topDown(input));
    }

    @Test
    void testSecondIteration() {
        var impl = new MergeSort.SecondIteration();
        impl.topDown(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testThirdIteration() {
        var impl = new MergeSort.ThirdIteration();
        impl.topDown(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testFourthIteration() {
        var impl = new MergeSort.FourthIteration();
        impl.topDown(input);
        assertArrayEquals(expected, input);
    }

}
