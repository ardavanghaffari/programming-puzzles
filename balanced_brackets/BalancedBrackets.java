import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

class BalancedBrackets {

    private final Deque<Character> stack = new ArrayDeque<>();
    private final Map<Character, Character> bracketMap = Map.of(
            '(', ')',
            '[', ']',
            '{', '}');

    public Boolean isBalanced(String brackets) {
        for (char c : brackets.toCharArray()) {
            if (isOpeningBracket(c))
                stack.push(c);
            else if (stack.isEmpty() || bracketMap.get(stack.pop()) != c)
                return false;
        }

        return stack.isEmpty();
    }

    private Boolean isOpeningBracket(Character chr) {
        return bracketMap.containsKey(chr);
    }

}
