import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    void testBalancedBrackets(String input, Boolean expected) {
        assertEquals(expected, impl.isBalanced(input));
    }

}
