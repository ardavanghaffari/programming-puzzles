import java.util.Arrays;

class MergeSort {

    static class FirstIteration {
        
        public int[] topDown(int[] input) {
            if (input.length <= 1)
                return input;

            var i = input.length / 2;
            var l = topDown(Arrays.copyOfRange(input, 0, i));
            var r = topDown(Arrays.copyOfRange(input, i, input.length));

            return merge(l, r);
        }

        private int[] merge(int[] left, int[] right) {
            int i = 0, j = 0, k = 0;
            var result = new int[left.length + right.length];

            while (i < left.length && j < right.length) {
                if (left[i] > right[j])
                    result[k++] = right[j++];
                else if (left[i] < right[j])
                    result[k++] = left[i++];
                else {
                    result[k++] = right[j++];
                    result[k++] = left[i++];
                }
            }

            for ( ; i < left.length; i++)  result[k++] = left[i];
            for ( ; j < right.length; j++) result[k++] = right[j];

            return result;
        }

    }

}