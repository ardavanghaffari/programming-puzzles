import java.util.HashMap;
import java.util.Map;

class NthFibonacci {

    public int recursive(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        return recursive(n - 1) + recursive(n - 2);
    }

    public int memoization(int n) {
        return memoization(n, new HashMap<>() {{
            put(1, 0);
            put(2, 1);
        }});
    }

    private int memoization(int n, Map<Integer, Integer> memo) {
        if (!memo.containsKey(n))
            memo.put(n, memoization(n - 1, memo) + memoization(n - 2, memo));

        return memo.get(n);
    }

    public int iterative(int n) {
        if (n == 1)
            return 0;

        int previous = 0;
        int current = 1;

        for (int i = 3; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }

}
