import java.util.ArrayList;
import java.util.Arrays;

class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        var result = new ArrayList<int[]>();

        sort(intervals);

        int i = 0;
        int j;
        while (i < intervals.length) {
            j = i + 1;
            while (j < intervals.length) {
                if (intervals[j][0] > intervals[j - 1][1]) { // overlap stops
                    result.add(new int[] { intervals[i][0], intervals[j - 1][1] });
                    i = j;
                    break;
                } else
                    j++; // overlap continues
            }
            // just add interval at i since there is no interval after it
            result.add(new int[] { intervals[i][0], intervals[i][1] });
            i++;
        }

        return result.toArray(new int[result.size()][]);
        // return result.toArray(int[][]::new);
    }

    private void sort(int[][] intervals) {
        // This is what I originally came up with to sort the 2D array but then later 
        // found out about Arrays compare method that compares two int[].
        //
        // Arrays.sort(intervals, Comparator.<int[]>comparingInt(i -> i[0]).thenComparing(i -> i[1]));
        // 
        // A note about <int[]>. This is what's referred to as 'Type witness'. It's meant 
        // to help the compiler with type inference. It's needed here since we'd otherwise 
        // get a compilation error:
        //
        // MergeIntervals.java:32: error: array required, but Object found
        //         Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]).thenComparing(i -> i[1]));
        //                                                              ^
        // MergeIntervals.java:32: error: array required, but Object found
        //         Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]).thenComparing(i -> i[1]));
        //                                                                                       ^
        // Compiler is failing to infer that i is an int[] and falls back to Object. Adding <int[]>
        // helps with that. Another way to help the compiler would be:
        //
        // Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0]).thenComparing(i -> i[1]));
        //
        // Sources:
        // https://stackoverflow.com/questions/24932177/type-witness-in-java-generics
        // https://stackoverflow.com/questions/25172595/comparator-reversed-does-not-compile-using-lambda
        //

        Arrays.sort(intervals, Arrays::compare);
    }

}