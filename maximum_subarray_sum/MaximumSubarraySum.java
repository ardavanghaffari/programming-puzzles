import static java.lang.Math.max;

class MaximumSubarraySum {

    public int bruteForce(int[] input) {
        if (input.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            int sum = 0;

            for (int j = i; j < input.length; j++) {
                sum += input[j];
                if (sum > max) max = sum;
            }
        }

        return max;
    }

    public int kadane(int[] input) {
        if (input.length == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum = max(input[i], input[i] + sum);
            max = max(max, sum);
        }

        return max;
    }

}
