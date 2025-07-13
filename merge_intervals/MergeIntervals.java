import java.util.ArrayList;
import java.util.Arrays;

class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        var result = new ArrayList<int[]>();

        sort(intervals);

        for (int i = 0; i < intervals.length; i++) {
            int[] overlap = { intervals[i][0], intervals[i][1] };
            int end = intervals[i][1];

            for (int j = i + 1; j < intervals.length; j++) {
                // overlap stops at intervals[i]
                if (intervals[j][0] > end) break;
                // overlap continues onto intervals[j]
                else {
                    if (intervals[j][1] > end)
                        end = intervals[j][1];
                    i++;
                }
            }
            overlap[1] = end;
            result.add(overlap);
        }

        return result.toArray(int[][]::new);
    }

    /**
     * This is what I originally came up with
     * <p>
     * Arrays.sort(intervals, Comparator.<int[]>comparingInt(i -> i[0]).thenComparing(i -> i[1]));
     * <p>
     * A note about <int[]>. This is what's referred to as 'Type witness'. It's meant
     * to help the compiler with type inference. It's needed here since we'd otherwise
     * get a compilation error:
     * <p>
     * MergeIntervals.java:32: error: array required, but Object found
     *         Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]).thenComparing(i -> i[1]));
     *                                                              ^
     * MergeIntervals.java:32: error: array required, but Object found
     *         Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]).thenComparing(i -> i[1]));
     *                                                                                       ^
     * Compiler is failing to infer that i is an int[] and falls back to Object. Adding <int[]>
     * helps with that. Another way to help the compiler would be:
     * <p>
     * Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0]).thenComparing(i -> i[1]));
     * <p>
     * None of this is needed since we can just use Array's compare method that compares two int[].
     */
    private void sort(int[][] intervals) {
        Arrays.sort(intervals, Arrays::compare);
    }

}