import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalancedBracketsTest {

    BalancedBrackets impl = new BalancedBrackets();

    @ParameterizedTest
    @CsvSource({
            "'()',     True",
            "'()[]{}', True",
            "'([])',   True",
            "'(]',     False",
            "'(){',    False",
            "'()}',    False",
            "'){}',    False"
    })
    void testIsBalanced(String input, Boolean expected) {
        assertEquals(expected, impl.isBalanced(input));
    }

}
