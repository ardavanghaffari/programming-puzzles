import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinHeapConstructionTest {

    private List<Integer> input = IntStream.of(
                    48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41)
            .boxed()
            .collect(Collectors.toList());

    private MinHeapConstruction impl;

    @Test
    void testMinHeapConstruction() {
        impl = new MinHeapConstruction(input);
        expectHeapNodesToBe(List.of(-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41));

        impl.insert(-10);
        expectHeapNodesToBe(List.of(-10, 2, -5, 7, 8, 8, 6, 391, 24, 56, 12, 24, 48, 41, 24));

        assertEquals(-10, impl.peek());
        expectHeapNodesToBe(List.of(-10, 2, -5, 7, 8, 8, 6, 391, 24, 56, 12, 24, 48, 41, 24));

        assertEquals(-10, impl.remove());
        expectHeapNodesToBe(List.of(-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41));

        impl.insert(87);
        expectHeapNodesToBe(List.of(-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41, 87));

        assertEquals(-5, impl.remove());
        expectHeapNodesToBe(List.of(2, 7, 6, 24, 8, 8, 24, 391, 87, 56, 12, 24, 48, 41));
    }

    private void expectHeapNodesToBe(List<Integer> expected) {
        assertEquals(expected, impl.heap);
    }

}