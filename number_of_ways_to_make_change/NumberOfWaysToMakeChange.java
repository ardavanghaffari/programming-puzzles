class NumberOfWaysToMakeChange {

    public int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] ways = new int[n + 1];
        ways[0] = 1;

        for (int denom : denoms) {
            for (int amount = denom; amount <= n; amount++) {
                ways[amount] += ways[amount - denom];
            }
        }

        return ways[n];
    }

}
