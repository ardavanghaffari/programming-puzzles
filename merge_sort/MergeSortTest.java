import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MergeSortTest {

    int[] input    = {8, 5, 2, 9, 5, 6, 3};
    int[] expected = {2, 3, 5, 5, 6, 8, 9};

    @Test
    void testFirstIteration() {
        MergeSort.FirstIteration impl = new MergeSort.FirstIteration();
        assertArrayEquals(expected, impl.topDown(input));
    }

}
